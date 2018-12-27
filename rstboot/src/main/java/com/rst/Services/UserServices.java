package com.rst.Services;

import com.rst.domain.UserDTO;

import java.util.List;

public interface UserServices {


  List<UserDTO> findAllUsers();
 String SaveUser(UserDTO userData) ;
}
