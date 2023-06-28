package org.service;

import org.commons.PokemonTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ILookingforService {

    PokemonTO findByID(Integer id);
    PokemonTO findByName(String name);
}
