package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetServices {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
