package me.ognjenst.springboot.demo.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorsRepository extends JpaRepository<Actor, Integer> {
}
