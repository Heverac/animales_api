package cl.duoc.PuenteAnimal.animales.repository;


import cl.duoc.PuenteAnimal.animales.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("!test")
public class DataLoader implements CommandLineRunner {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void run(String... args) throws Exception {

//        if (animalRepository.count() > 0) {
//            return;
//        }

        Animal gato = new Animal();
        gato.setNombre("Luna");
        gato.setUrlImagen("/animales/gato1.jpg");
        gato.setDescripcion("Gato curioso de color naranja.");

        Animal loro = new Animal();
        loro.setNombre("Nala");
        loro.setUrlImagen("/animales/loro.jpg");
        loro.setDescripcion("Loro sociable y muy hablador.");

        Animal oveja = new Animal();
        oveja.setNombre("Celeste");
        oveja.setUrlImagen("/animales/oveja.jpg");
        oveja.setDescripcion("Oveja tranquila que disfruta del pasto.");

        Animal perro1 = new Animal();
        perro1.setNombre("Capitán");
        perro1.setUrlImagen("/animales/perro1.jpg");
        perro1.setDescripcion("Perro leal y protector.");

        Animal perro2 = new Animal();
        perro2.setNombre("Milo");
        perro2.setUrlImagen("/animales/perro2.jpg");
        perro2.setDescripcion("Cachorro juguetón y energético.");

        animalRepository.saveAll(List.of(gato, loro, oveja, perro1, perro2));
    }
}


