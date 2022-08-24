package edu.sma.bankloans.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class LoanType {
    @Id
    private String id;
    private String name;
    private ConditionsReceipt conditions;
    private double amountMin;
    private double amountMax;
    private double rate;
    private int term;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public LoanType() {
    }

    public LoanType(String name, ConditionsReceipt conditions, double amountMin, double amountMax, double rate, int term) {
        this.name = name;
        this.conditions = conditions;
        this.amountMin = amountMin;
        this.amountMax = amountMax;
        this.rate = rate;
        this.term = term;
    }

    public LoanType(String id, String name, ConditionsReceipt conditions, double amountMin, double amountMax, double rate, int term, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.conditions = conditions;
        this.amountMin = amountMin;
        this.amountMax = amountMax;
        this.rate = rate;
        this.term = term;
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

    public ConditionsReceipt getConditions() {
        return conditions;
    }

    public void setConditions(ConditionsReceipt conditions) {
        this.conditions = conditions;
    }

    public double getAmountMin() {
        return amountMin;
    }

    public void setAmountMin(double amountMin) {
        this.amountMin = amountMin;
    }

    public double getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(double amountMax) {
        this.amountMax = amountMax;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
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
        LoanType loanType = (LoanType) o;
        return id.equals(loanType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LoanType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", conditions=" + conditions +
                ", amountMin=" + amountMin +
                ", amountMax=" + amountMax +
                ", rate=" + rate +
                ", term=" + term +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
