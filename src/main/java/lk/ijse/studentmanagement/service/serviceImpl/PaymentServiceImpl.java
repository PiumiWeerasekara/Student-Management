package lk.ijse.studentmanagement.service.serviceImpl;

import lk.ijse.studentmanagement.dto.PaymentDto;
import lk.ijse.studentmanagement.entity.Payment;
import lk.ijse.studentmanagement.repository.PaymentRepository;
import lk.ijse.studentmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public ArrayList<PaymentDto> getAllPayments() {

//        List<Student> all=studentRepository.findAll();
//        ArrayList<StudentDto> alStudents=new ArrayList<>();
//        for (Student student : all) {
//            StudentDto studentDto=new StudentDto(
//                    student.getStudentID(),
//                    student.getStudentName(),
//                    student.getStudentGender(),
//                    student.getStudentContact(),
//                    student.getStudentAddress());
//            alStudents.add(studentDto);
//        }
        return null;
    }

    @Override
    public PaymentDto getPayment(String paymentId) {

        Payment payment=paymentRepository.findById(paymentId).get();
        PaymentDto paymentDto=new PaymentDto(payment.getPaymentID(),payment.getPaymentDate(),payment.getPaymentAmount(),payment.getRid());
        return paymentDto;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean savePayment(PaymentDto paymentDto) {
        Payment p=new Payment();
        p.setPaymentID(paymentDto.getPaymentID());
        p.setPaymentDate(paymentDto.getPaymentDate());
        p.setPaymentAmount(paymentDto.getPaymentAmount());
        p.setRid(paymentDto.getRid());
        paymentRepository.save(p);
        return true;
    }

    @Override
    public String updatePayment(PaymentDto paymentDto) {
        return null;
    }
}
