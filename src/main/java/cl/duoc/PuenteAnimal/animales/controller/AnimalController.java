package cl.duoc.PuenteAnimal.animales.controller;


import cl.duoc.PuenteAnimal.animales.model.Animal;
import cl.duoc.PuenteAnimal.animales.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animales")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> findAll(){
        return animalService.findAll();
    }
    @GetMapping("/{id}")
    public Animal findById(@PathVariable Integer id){
        return animalService.findById(id);
    }
    @PostMapping
    public Animal save(Animal animal){
        return animalService.Save(animal);
    }
    @PutMapping("/{id}")
    public Animal update(@PathVariable Integer id, @RequestBody Animal animal){
        return animalService.update(id, animal);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        animalService.delete(id);
    }
}
