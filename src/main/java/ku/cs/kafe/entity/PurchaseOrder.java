package ku.cs.kafe.entity;

import jakarta.persistence.*;
import ku.cs.kafe.common.Status;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Nutthawat Aonprasert 6410450940
//Entity ของ PurchaseOrder

@Data
@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue
    private UUID id;


    private LocalDateTime timestamp;
    private Status status;

//    @ManyToOne save who is ordered
//    private Member member;

    @OneToMany(mappedBy = "purchaseOrder")
    private List<OrderItem> items = new ArrayList<>();

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items)
            total += item.getSubtotal();
        return total;
    }

}
