package edu.sma.bankloans.form;

public class ConditionsReceiptForm {

    private String name;
    private int ageMin;
    private int ageMax;
    private double salaryMin;
    private int workExperience;

    public ConditionsReceiptForm() {
    }

    public ConditionsReceiptForm(String name, int ageMin, int ageMax, double salaryMin, int workExperience) {
        this.name = name;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.salaryMin = salaryMin;
        this.workExperience = workExperience;
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

    @Override
    public String toString() {
        return "ConditionsReceiptForm{" +
                "name='" + name + '\'' +
                ", ageMin=" + ageMin +
                ", ageMax=" + ageMax +
                ", salaryMin=" + salaryMin +
                ", workExperience=" + workExperience +
                '}';
    }
}
