package com.example.optic_store.repositories;


import com.example.optic_store.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByLogin(String login);

}
