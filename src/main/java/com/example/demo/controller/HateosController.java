//package com.example.demo.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Resource;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.entity.Users;
//import com.example.demo.service.UserService;
//
// 
//@RestController
////public class HateosController {
//    
////    @Autowired
////    UserService userService;
////    
////    
////    @GetMapping(value="/user/{id}")
////    public Users getUserById(@PathVariable Long id) {
////        return null;
////    }
////
//// 
////    @GetMapping(value ="/getAllUsers")
////    public List<Resource<Users>> getAllUsersV1() {
////        List<Users> result = userService.getAllUsers();
////        List<Resource<Users>> userResource = new ArrayList<Resource<Users>>();
////        for(Users user : result) {
////            userResource.add(getUserResource(user));
////        }
////        return userResource;
////        
////    }
////    
////    private static Resource<Users> getUserResource(Users user){
////        Resource<Users> resource = new Resource<Users>(user);
////        resource.add(linkTo(methodOn(HateosController.class).getUserById(user.getId())).withRel("_self"));
////        return resource;
////    }
//
// 
//
//    
//    
//    
//
// 
//
//}