package lk.ijse.studentmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentID;

    @Column(name = "payment_date")
    private String paymentDate;

    @Column(name = "payment_amount")
    private double paymentAmount;

    @Column(name = "rid")
    private int rid;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "rid",referencedColumnName = "rid" , insertable = false, updatable = false)
    private Registration registration;

    public Payment() {

    }

    public Payment(String paymentDate, double paymentAmount, Registration registration) {
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.registration = registration;
    }

    public Payment(int paymentID, String paymentDate, double paymentAmount) {
        this.paymentID = paymentID;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public Payment(String paymentDate, double paymentAmount, int rid) {
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

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", rid=" + rid +
                ", registration=" + registration +
                '}';
    }
}
