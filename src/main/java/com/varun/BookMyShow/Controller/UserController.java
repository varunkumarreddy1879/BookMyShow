package com.varun.BookMyShow.Controller;

import com.varun.BookMyShow.Dtos.SignUpRequestDto;
import com.varun.BookMyShow.Dtos.SignUpResponseDto;
import com.varun.BookMyShow.Model.ResponceStatus;
import com.varun.BookMyShow.Model.User;
import com.varun.BookMyShow.Service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    UserService userService;

    UserController(UserService userService){
        this.userService=userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto request){
        String name=request.getName();
        String mail=request.getMail();
        String mobile=request.getPhone();
        String password=request.getPassword();

        User user;
        SignUpResponseDto response=new SignUpResponseDto();

        try{
            user=userService.signUp(name,mail,mobile,password);
            response.setResponceStatus(ResponceStatus.SUCCESS);
        }
        catch (Exception e){
            response.setResponceStatus(ResponceStatus.FAILED);
            response.setReponseMessage("Something Went Wrong");
        }

        return response;
    }
}
