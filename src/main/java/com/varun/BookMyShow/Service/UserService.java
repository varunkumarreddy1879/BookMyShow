package com.varun.BookMyShow.Service;

import com.varun.BookMyShow.Exceptions.InvalidArgumentException;
import com.varun.BookMyShow.Model.User;
import com.varun.BookMyShow.Repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService{

    UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public User signUp(String name, String mail, String mobile, String password) throws InvalidArgumentException {
        // check email id already exist
        Optional<User> optionalUser=userRepository.findBymail(mail);

        if(optionalUser.isPresent()){
            throw new InvalidArgumentException("mail : "+ mail+ " alredy exist,try with other mail.");
        }

        User user=new User();
        user.setName(name);
        user.setMail(mail);
        user.setMobile(mobile);
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));

        user=userRepository.save(user);
        return user;
    }

}
