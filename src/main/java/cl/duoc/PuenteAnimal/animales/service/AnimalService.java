package cl.duoc.PuenteAnimal.animales.service;


import cl.duoc.PuenteAnimal.animales.model.Animal;
import cl.duoc.PuenteAnimal.animales.repository.AnimalRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AnimalService {
    private final AnimalRepository animalRepository;
    public AnimalService(AnimalRepository animalRepository) {this.animalRepository = animalRepository;}
    public List<Animal> findAll(){
        return animalRepository.findAll();
    }
    public Animal findById(Integer id){
        return animalRepository.findById(id).get();
    }
    public Animal Save(Animal animal){
        return animalRepository.save(animal);
    }
    public void delete(Integer id){
        animalRepository.deleteById(id);}
    public Animal update(Integer idAnimal, Animal animal2){
        Animal animal1= findById(idAnimal);

        return animalRepository.save(animal1);
    }
}



