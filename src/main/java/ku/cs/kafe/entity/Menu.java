package ku.cs.kafe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

//Nutthawat Aonprasert 6410450940
//Entity ของ Menu

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double price;

    @ManyToOne
    private Category category;

}
