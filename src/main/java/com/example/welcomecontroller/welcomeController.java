package com.example.welcomecontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

@GetMapping(path="/name")
    public String name(){
    return "My name is Bashaer";
}


@GetMapping(path="/age")
    public String age(){
        return "My age is 23";
    }


@GetMapping(path="/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

@GetMapping(path="/health")
    public String check(){
        return "Server health is up and running";
    }

@GetMapping(path="/names")
    public String[] names(){
    String[] names={"Bashaer","Saed","Ahmed"};
        return names;
    }

}
