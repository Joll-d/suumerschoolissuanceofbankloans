package edu.sma.bankloans.form;

public class LoanForm {
    private String name;
    private String type;
    private String customer;
    private double sum;
    private String payment;
    public LoanForm() {
    }

    public LoanForm(String name, String type, String customer, double sum, String payment) {
        this.name = name;
        this.type = type;
        this.customer = customer;
        this.sum = sum;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "LoanForm{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", customer='" + customer + '\'' +
                ", sum=" + sum +
                ", payment='" + payment + '\'' +
                '}';
    }
}
