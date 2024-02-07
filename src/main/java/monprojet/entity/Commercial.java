package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @ToString
@Entity
public class Commercial extends Employe {
    @NonNull
    private float pourcentage;

}
