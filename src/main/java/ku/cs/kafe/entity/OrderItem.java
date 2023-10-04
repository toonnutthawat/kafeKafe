package ku.cs.kafe.entity;

import jakarta.persistence.*;
import lombok.Data;

//Nutthawat Aonprasert 6410450940
//Entity ของ OrderItem โดยมี orderID และ menuId เป็น Composite Primary Key

@Data
@Entity
public class OrderItem {

    @EmbeddedId
    private OrderItemKey id;

    private int quantity;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")//purchaseOrder join column orderId
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name = "menu_id")//menu join column MenuId
    private Menu menu;

    public double getSubtotal() {
        return menu.getPrice() * quantity;
    }

}
