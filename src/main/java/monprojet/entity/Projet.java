package monprojet.entity;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Projet {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer code;

    @NonNull
    private String nom;

 
    private LocalDate debut;


    private LocalDate fin;

    @OneToMany(mappedBy = "affectation")
    private java.util.List<Participation> partipations;

}
