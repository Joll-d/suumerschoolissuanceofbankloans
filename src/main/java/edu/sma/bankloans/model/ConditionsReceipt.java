package edu.sma.bankloans.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class ConditionsReceipt {
    @Id
    private String id;
    private String name;
    private int ageMin;
    private int ageMax;
    private double salaryMin;
    private int workExperience;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ConditionsReceipt() {
    }

    public ConditionsReceipt(String name, int ageMin, int ageMax, double salaryMin, int workExperience) {
        this.name = name;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.salaryMin = salaryMin;
        this.workExperience = workExperience;
    }

    public ConditionsReceipt(String id, String name, int ageMin, int ageMax, double salaryMin, int workExperience, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.salaryMin = salaryMin;
        this.workExperience = workExperience;
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

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    public double getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(double salaryMin) {
        this.salaryMin = salaryMin;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
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
        ConditionsReceipt that = (ConditionsReceipt) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ConditionsReceipt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ageMin=" + ageMin +
                ", ageMax=" + ageMax +
                ", salaryMin=" + salaryMin +
                ", workExperience=" + workExperience +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
