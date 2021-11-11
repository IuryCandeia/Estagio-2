package br.com.unifip.pets.petservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.unifip.pets.Pets;

public class PetService {
	private Map<String, Pets> mapVeiculos = new HashMap<String, Pets>();

	public void grava(Pets pets) {
		mapVeiculos.put(pets.getNome(), pets);
	}

	public List<Pets> buscaTodos() {
		return mapVeiculos.values().stream().collect(Collectors.toList());
	}

}
