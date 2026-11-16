package com.example.user_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/{userId}")
    public User getUser(@PathVariable("userId") String userId){

     User userOne = new User("1","Ravi" ,"1234") ;


    Posts posts = restTemplate.getForObject("http://post-service/post/1",Posts.class);

     userOne.setPosts(posts);

     Notification notification = restTemplate.getForObject("http://notification-service/notifications/12",Notification.class);

     userOne.setNotifications(notification);
     return userOne;

    }
}
