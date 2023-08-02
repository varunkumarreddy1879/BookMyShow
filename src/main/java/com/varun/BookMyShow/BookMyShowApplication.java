package com.varun.BookMyShow;

import com.varun.BookMyShow.Controller.UserController;
import com.varun.BookMyShow.Dtos.SignUpRequestDto;
import com.varun.BookMyShow.Dtos.SignUpResponseDto;
import com.varun.BookMyShow.Model.Auditorium;
import com.varun.BookMyShow.Model.Language;
import com.varun.BookMyShow.Model.Movie;
import com.varun.BookMyShow.Model.Show;
import com.varun.BookMyShow.Repository.MovieRepository;
import com.varun.BookMyShow.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.yaml.snakeyaml.comments.CommentLine;

import java.util.ArrayList;
import java.util.Collections;

import static com.varun.BookMyShow.Model.Language.*;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApplication implements CommandLineRunner {

	UserController userController;

	@Autowired
	ShowRepository showRepository;
	@Autowired
	MovieRepository movieRepository;

	@Autowired
	BookMyShowApplication(UserController userController){
		this.userController=userController;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		SignUpRequestDto signUpRequestDto=new SignUpRequestDto();
//		signUpRequestDto.setMail("bvarunkumarreddy2000@gmail.com");
//		signUpRequestDto.setName("varun");
//		signUpRequestDto.setPhone("8019809136");
//		signUpRequestDto.setPassword("Password");
//
//		SignUpResponseDto responseDto=userController.signUp(signUpRequestDto);
//		System.out.println(responseDto.getReponseMessage());

//		Movie movie=new Movie();
//		movie.setName("Kalki");
//		movieRepository.save(movie);






	}

}
