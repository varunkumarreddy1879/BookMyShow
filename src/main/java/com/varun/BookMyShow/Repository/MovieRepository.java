package com.varun.BookMyShow.Repository;

import com.varun.BookMyShow.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
     Movie save(Movie movie);
}
