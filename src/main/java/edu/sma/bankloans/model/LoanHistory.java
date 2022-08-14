package edu.sma.bankloans.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class LoanHistory {
    private String id;
    private String name;
    private Loan loan;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public LoanHistory() {
    }

    public LoanHistory(String name, Loan loan) {
        this.name = name;
        this.loan = loan;
    }

    public LoanHistory(String id, String name, Loan loan, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.loan = loan;
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

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
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
        LoanHistory that = (LoanHistory) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LoanHistory{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", loan=" + loan +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
