package edu.sma.bankloans.form;

public class ProfessionForm {
    private String name;
    private int workExperience;
    private double salary;

    public ProfessionForm() {
    }

    public ProfessionForm(String name, int workExperience, double salary) {
        this.name = name;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ProfessionForm{" +
                "name='" + name + '\'' +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                '}';
    }
}
