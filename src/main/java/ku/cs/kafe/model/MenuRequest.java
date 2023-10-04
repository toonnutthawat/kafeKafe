package ku.cs.kafe.model;

import lombok.Data;

import java.util.UUID;

//Nutthawat Aonprasert 6410450940
//DTO ของ Menu

@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}
