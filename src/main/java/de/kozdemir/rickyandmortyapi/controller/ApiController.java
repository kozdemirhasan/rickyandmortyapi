package de.kozdemir.rickyandmortyapi.controller;

import de.kozdemir.rickyandmortyapi.entity.Character;
import de.kozdemir.rickyandmortyapi.service.ApiServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ApiServiceImp characterService;

    @GetMapping("/allCharacters")
    public ResponseEntity<Character> getCharacters() {
        Character allCharacters = characterService.getAllCharacters();
        return new ResponseEntity<>(allCharacters, HttpStatus.OK);

    }
}
