package com.revature.demo;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "poke_id")
	private Integer pokeId;

	@Column(name = "poke_name")
	private String pokeName;

	@Column(name = "poke_level")
	private String pokeLvl;

	public Integer getPokeId() {
		return pokeId;
	}

	public void setPokeId(Integer pokeId) {
		this.pokeId = pokeId;
	}

	public String getPokeName() {
		return pokeName;
	}

	public void setPokeName(String pokeName) {
		this.pokeName = pokeName;
	}

	public String getPokeLvl() {
		return pokeLvl;
	}

	public void setPokeLvl(String pokeLvl) {
		this.pokeLvl = pokeLvl;
	}

	@Override
	public String toString() {
		return "Pokemon [pokeId=" + pokeId + ", pokeName=" + pokeName + ", pokeLvl=" + pokeLvl + "]";
	}

}
