package com.rst.Controllers;

import com.rst.Services.UserServices;
import com.rst.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {



    @Autowired
    private UserServices userServices;


    @GetMapping ("/all")
    public List<UserDTO> allUsers()
    {
     return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO userData)
    {
      return userServices.SaveUser(userData);
    }

}
