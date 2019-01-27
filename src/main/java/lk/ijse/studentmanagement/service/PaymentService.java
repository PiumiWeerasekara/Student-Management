package lk.ijse.studentmanagement.service;

import lk.ijse.studentmanagement.dto.PaymentDto;

import java.util.ArrayList;

public interface PaymentService {
    public ArrayList<PaymentDto> getAllPayments();
    public PaymentDto getPayment(String paymentId);
    public boolean savePayment(PaymentDto paymentDto);
    public String updatePayment(PaymentDto paymentDto);
}
