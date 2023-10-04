package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//Nutthawat Aonprasert 6410450940
//เชื่อมกับ DB

@Repository
public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
