package org.service.Impl;

import org.commons.PokemonTO;
import org.service.ILookingforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ILookingforServiceImpl implements ILookingforService {

    @Override
    public PokemonTO findByID(Integer id) {
        return null;
    }

    @Override
    public PokemonTO findByName(String name) {
        return null;
    }
}
