package com.revature.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		
		PokemonService pokemonService = applicationContext.getBean("pokemonService", PokemonService.class);
		Pokemon pokemon = new Pokemon();
		pokemon.setPokeName("Bulbasaur");
		pokemon.setPokeLvl("1");
		pokemonService.createPokemon(pokemon);
	}
}
