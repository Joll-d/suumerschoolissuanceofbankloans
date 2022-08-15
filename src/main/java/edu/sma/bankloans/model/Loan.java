package edu.sma.bankloans.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Loan {
    private String id;
    private String name;
    private LoanType idType;
    private Customer idCustomer;
    private double sum;
    private Payment payment;
    private LocalDateTime dateIssuance;
    private LocalDateTime dateRefund;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Loan() {
    }

    public Loan(String name, LoanType idType, Customer idCustomer, double sum, Payment payment, LocalDateTime dateIssuance, LocalDateTime dateRefund) {
        this.name = name;
        this.idType = idType;
        this.idCustomer = idCustomer;
        this.sum = sum;
        this.payment = payment;
        this.dateIssuance = dateIssuance;
        this.dateRefund = dateRefund;
    }

    public Loan(String id, String name, LoanType idType, Customer idCustomer, double sum, Payment payment, LocalDateTime dateIssuance, LocalDateTime dateRefund, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.idType = idType;
        this.idCustomer = idCustomer;
        this.sum = sum;
        this.payment = payment;
        this.dateIssuance = dateIssuance;
        this.dateRefund = dateRefund;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoanType getIdType() {
        return idType;
    }

    public void setIdType(LoanType idType) {
        this.idType = idType;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDateTime getDateIssuance() {
        return dateIssuance;
    }

    public void setDateIssuance(LocalDateTime dateIssuance) {
        this.dateIssuance = dateIssuance;
    }

    public LocalDateTime getDateRefund() {
        return dateRefund;
    }

    public void setDateRefund(LocalDateTime dateRefund) {
        this.dateRefund = dateRefund;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return id.equals(loan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", idType=" + idType +
                ", idCustomer=" + idCustomer +
                ", sum=" + sum +
                ", payment=" + payment +
                ", dateIssuance=" + dateIssuance +
                ", dateRefund=" + dateRefund +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
