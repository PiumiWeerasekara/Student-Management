package lk.ijse.studentmanagement.controller;

import lk.ijse.studentmanagement.dto.PaymentDto;
import lk.ijse.studentmanagement.dto.StudentDto;
import lk.ijse.studentmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<PaymentDto> getAllPayments() {
        return paymentService.getAllPayments()    ;
    }

//    @PutMapping("/update")
//    public String updateCustomer(@RequestBody CustomerDto customer) {
//        return service.updateCustomer(customer);
//    }

    @GetMapping(value="/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentDto getPayment(@PathVariable("name")String name) {
        return paymentService.getPayment(name)  ;
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean savePayment(@RequestBody PaymentDto paymentDto) {
        return paymentService.savePayment(paymentDto);
    }
}
