package me.ognjenst.springboot.demo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository repo;

    @RequestMapping("/countries")
    public List<Country> getAllCountries(){
        return repo.findAll();
    }
}
