package ku.cs.kafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;
//Nutthawat Aonprasert 6410450940
//Entity ของ Member

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String password;
    private String name;
    private String role;
}
