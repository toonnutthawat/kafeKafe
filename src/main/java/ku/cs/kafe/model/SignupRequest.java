package ku.cs.kafe.model;

import lombok.Data;

//don't have @Entity @Id @GeneratedValue because It doesn't save to database
//Nutthawat Aonprasert 6410450940
//DTO ของ Member
@Data
public class SignupRequest {//DTO
    private String name;
    private String username;
    private String password;
}
