package lk.ijse.studentmanagement.repository;

import lk.ijse.studentmanagement.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
