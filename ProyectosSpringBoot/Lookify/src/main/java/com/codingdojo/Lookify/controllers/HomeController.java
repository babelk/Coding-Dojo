package com.codingdojo.Lookify.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.Lookify.models.Song;
import com.codingdojo.Lookify.services.SongService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	private SongService songService;

	@GetMapping("")
	public String home() {
		return "shows/index.jsp";
	}
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.findAll();
		model.addAttribute("songs", songs);
		return "shows/dashboard.jsp";
	}
	@PostMapping("/eliminar/{id}")
	public String eliminarCancion(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/search/{artist}")
	public String search(Model model, @PathVariable("artist") String artist) {
		List<Song> songsArtist = songService.encontrarCanciones(artist);
		model.addAttribute("songsArtist", songsArtist);
		model.addAttribute("artist", artist);
		return "shows/search.jsp";
	}
	
	@PostMapping("/songs/artista")
    public String searchByArtist(@RequestParam("artist") String artist) {
        return "redirect:/search/"+artist;
    }
	
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("newSong") Song song) {
		return "shows/new.jsp";
	}
	@PostMapping("/songs/new")
    public String createSong(@Valid @ModelAttribute("newSong") Song song, BindingResult result, Model model ) {
		if(result.hasErrors()) {
			return "shows/new.jsp";
		}
		else {
		songService.createSong(song);
        return "redirect:/songs/new";
		}
    }
	@GetMapping("/search/topTen")
	public String topTen(Model model) {
		List<Song> topTen = songService.topTen();
		model.addAttribute("topTen", topTen);
		return "shows/top.jsp";
	}
	@GetMapping("/songs/{id}")
	public String searchSong(Model model, @PathVariable("id") Long id) {
		Song song = songService.findSong(id);
		model.addAttribute("song", song);
		return "shows/songs.jsp";
	}
}
