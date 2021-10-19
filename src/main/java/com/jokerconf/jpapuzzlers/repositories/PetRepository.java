package com.jokerconf.jpapuzzlers.repositories;

import com.jokerconf.jpapuzzlers.entities.Pet;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
}