package ku.cs.kafe.repository;

import ku.cs.kafe.entity.OrderItem;
import ku.cs.kafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
//Nutthawat Aonprasert 6410450940
//เชื่อมกับ DB

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> {
}
