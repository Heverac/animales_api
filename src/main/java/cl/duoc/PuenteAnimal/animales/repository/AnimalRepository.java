package cl.duoc.PuenteAnimal.animales.repository;

import cl.duoc.PuenteAnimal.animales.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal,Integer> {
}
