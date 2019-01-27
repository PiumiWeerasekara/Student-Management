package lk.ijse.studentmanagement.dto;

public class PaymentDto {
    private int paymentID;
    private String paymentDate;
    private double paymentAmount;
    private int rid;
    private RegistrationDto registrationDto;

    public PaymentDto() {
    }

    public PaymentDto(int paymentID, String paymentDate, double paymentAmount) {
        this.paymentID = paymentID;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public PaymentDto(int paymentID, String paymentDate, double paymentAmount, int rid) {
        this.paymentID = paymentID;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.rid = rid;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public RegistrationDto getRegistrationDto() {
        return registrationDto;
    }

    public void setRegistrationDto(RegistrationDto registrationDto) {
        this.registrationDto = registrationDto;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
                "paymentID=" + paymentID +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", rid=" + rid +
                ", registrationDto=" + registrationDto +
                '}';
    }
}
