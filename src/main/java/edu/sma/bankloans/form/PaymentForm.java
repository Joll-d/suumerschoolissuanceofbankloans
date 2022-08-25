package edu.sma.bankloans.form;

import java.time.LocalDateTime;


public class PaymentForm {
    private String id;

    private String loanId;
    private String name;
    private double paid;

    private boolean delay;
    private LocalDateTime paymentDate ;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PaymentForm() {
    }

    public PaymentForm(String loanId, String name, double paid, boolean delay, LocalDateTime paymentDate) {
        this.loanId = loanId;
        this.name = name;
        this.paid = paid;
        this.delay = delay;
        this.paymentDate = paymentDate;
    }

    public PaymentForm(String id, String loanId, String name, double paid, boolean delay, LocalDateTime paymentDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.loanId = loanId;
        this.name = name;
        this.paid = paid;
        this.delay = delay;
        this.paymentDate = paymentDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public boolean getDelay() {
        return delay;
    }

    public void setDelay(boolean delay) {
        this.delay = delay;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", loanId='" + loanId + '\'' +
                ", name='" + name + '\'' +
                ", paid=" + paid +
                ", delay=" + delay +
                ", paymentDate=" + paymentDate +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
