package de.kozdemir.rickyandmortyapi.service;

import de.kozdemir.rickyandmortyapi.entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Service
public class ApiServiceImp implements ApiService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    HttpHeaders httpHeaders;
    private static final String CHARACTER_API="https://rickandmortyapi.com/api/character";

    @Override
    public Character getAllCharacters() {
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<Character> response = restTemplate.exchange(CHARACTER_API, HttpMethod.GET,entity,Character.class);

        return response.getBody();
    }
}
