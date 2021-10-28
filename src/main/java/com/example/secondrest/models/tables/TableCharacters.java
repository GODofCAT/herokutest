package com.example.secondrest.models.tables;


import com.example.secondrest.models.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableCharacters extends JpaRepository<Character,Integer> {

}
