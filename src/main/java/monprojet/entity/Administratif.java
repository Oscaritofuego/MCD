package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @ToString
@Entity
public class Administratif extends Employe {
    @NonNull 
    private String diplome;

}