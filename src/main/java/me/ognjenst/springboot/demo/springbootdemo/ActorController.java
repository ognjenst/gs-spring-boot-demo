package me.ognjenst.springboot.demo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    @Autowired
    private ActorsRepository repo;

    @RequestMapping("/actors")
    public List<Actor> getAllActors(){
        return repo.findAll();
    }


}
