package monprojet.entity;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringExclude;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter@Setter@NoArgsConstructor@RequiredArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NonNull
    private String nom;

    @Email
    private String email;

    @OneToMany(mappedBy = "superieur")
    private List<Employe> subordonnes;

    @ManyToOne(optional = true)
    private Employe superieur;

    @OneToMany(mappedBy = "contributeur")
    private List<Participation> participations;
}

