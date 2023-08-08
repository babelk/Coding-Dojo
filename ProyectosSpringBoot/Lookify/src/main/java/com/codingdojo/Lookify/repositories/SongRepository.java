package com.codingdojo.Lookify.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
	
	Optional<Song> findById(Long id);
	
	List<Song> findAll();

	List<Song> findTop10ByOrderByRatingDesc();
	
	List<Song> findByArtistContaining(String artist);
	

}
