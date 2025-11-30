package cl.duoc.PuenteAnimal.animales.model;



import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnimal;

    @Column
    private String nombre;

    @Column
    private String urlImagen;

    @Column
    private String descripcion;


}
