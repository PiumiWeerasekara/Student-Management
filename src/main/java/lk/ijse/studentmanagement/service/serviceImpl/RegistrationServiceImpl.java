package lk.ijse.studentmanagement.service.serviceImpl;

import lk.ijse.studentmanagement.dto.RegistrationDto;
import lk.ijse.studentmanagement.entity.Registration;
import lk.ijse.studentmanagement.repository.PaymentRepository;
import lk.ijse.studentmanagement.repository.RegistrationRepository;
import lk.ijse.studentmanagement.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean saveRegistration(RegistrationDto registrationDto) {
        Registration r=new Registration();
        r.setRid(registrationDto.getRid());
        r.setRegDate(registrationDto.getRegDate());
        r.setRegFee(registrationDto.getRegFee());
        r.setCourseId(registrationDto.getCourseId());
        r.setStudentId(registrationDto.getStudentId());
        registrationRepository.save(r);
        return true;
    }
}
