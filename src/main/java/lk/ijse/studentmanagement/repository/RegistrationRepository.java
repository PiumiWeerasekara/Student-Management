package lk.ijse.studentmanagement.repository;

import lk.ijse.studentmanagement.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, String> {
}
