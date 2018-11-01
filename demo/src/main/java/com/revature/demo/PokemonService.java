package com.revature.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

	@Autowired
	private PokemonDao pokemonDao;

	public Pokemon createPokemon(Pokemon pokemon) {
		return pokemonDao.save(pokemon);
	}

	public Optional<Pokemon> getPokemonById(Integer pokemonId) {
		return pokemonDao.findById(pokemonId);
	}

}
