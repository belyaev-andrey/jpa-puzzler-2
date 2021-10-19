package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPuzzler2Application implements CommandLineRunner {

    @Autowired
    private PetRepository petRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaPuzzler2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        petRepository.findAll().forEach(System.out::println);
    }
}