package lk.ijse.studentmanagement.repository;

import lk.ijse.studentmanagement.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository<Batch, String> {
}
