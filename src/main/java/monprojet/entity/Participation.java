package monprojet.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @ToString
@Entity
public class Participation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @NonNull
    private float pourcentage;

    @NonNull
    private String role;


    @ManyToOne
    private Employe contributeur;

    @ManyToOne
    private Projet affectation;

}