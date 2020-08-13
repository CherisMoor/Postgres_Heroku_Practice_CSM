package com.csm.postgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndUserController {

    @Autowired
    EndUserRepo endUserRepo;

    @GetMapping("/")
    public String getWelcome() {
        return "Hello there and welcome!";
    }

    @GetMapping("/all")
    public List<EndUser> getUsers() {
        return endUserRepo.findAll();
    }

    @PostMapping("/")
    public void postUser(@RequestBody EndUser endUser) {
        endUserRepo.save(endUser);
    }
}