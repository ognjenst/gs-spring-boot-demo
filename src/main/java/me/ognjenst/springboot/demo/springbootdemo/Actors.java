package me.ognjenst.springboot.demo.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Actors extends JpaRepository<Actor, Integer> {
}
