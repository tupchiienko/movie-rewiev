package com.cursor.moviereview.repository;

import com.cursor.moviereview.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieRepo extends JpaRepository<Movie, UUID> {
}
