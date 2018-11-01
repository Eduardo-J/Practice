package com.revature.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/pokemon")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@PostMapping(value="/create")
	public Pokemon createPokemon(Pokemon pokemon) {
		return pokemonService.createPokemon(pokemon);
	}
	
	@GetMapping(value="/pokemon/{pokemonId}")
	public Optional<Pokemon> getPokemonById(@PathVariable("pokemonId")Integer pokemonId) {
		return pokemonService.getPokemonById(pokemonId);
	}
}
