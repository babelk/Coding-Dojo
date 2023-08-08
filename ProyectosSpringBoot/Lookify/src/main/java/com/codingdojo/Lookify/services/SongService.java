package com.codingdojo.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.Lookify.models.Song;
import com.codingdojo.Lookify.repositories.SongRepository;

@Service
public class SongService {
	@Autowired
	private SongRepository songRepository;

	public Song createSong(Song b) {
		return songRepository.save(b);
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        }
        else {
            return null;
        }
	}
	
	public List<Song> findAll() {
		return songRepository.findAll();
	}
	
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
	public List<Song> topTen(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> encontrarCanciones(String artist){
		return songRepository.findByArtistContaining(artist);
	}
}
