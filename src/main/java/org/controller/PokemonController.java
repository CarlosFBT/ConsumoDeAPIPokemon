package org.controller;

import org.commons.PokemonTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PokemonTO> getPokemonByID(){
        return null;
    }
    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<PokemonTO> getPokemonByName() {
        return null;
    }
}
