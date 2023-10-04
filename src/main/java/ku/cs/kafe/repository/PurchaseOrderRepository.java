package ku.cs.kafe.repository;

import ku.cs.kafe.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//Nutthawat Aonprasert 6410450940
//เชื่อมกับ DB
@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, UUID> {
}
