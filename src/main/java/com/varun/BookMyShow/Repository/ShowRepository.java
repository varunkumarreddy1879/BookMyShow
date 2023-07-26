package com.varun.BookMyShow.Repository;

import com.varun.BookMyShow.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show,Long> {
    public Optional<Show> findById(Long showId);

}
