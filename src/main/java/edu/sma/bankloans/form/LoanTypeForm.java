package edu.sma.bankloans.form;

public class LoanTypeForm {

    private String name ;
    private String conditions;
    private double amountMin ;
    private double amountMax ;
    private double rate ;
    private int term ;

    public LoanTypeForm() {
    }

    public LoanTypeForm(String name, String conditions, double amountMin, double amountMax, double rate, int term) {
        this.name = name;
        this.conditions = conditions;
        this.amountMin = amountMin;
        this.amountMax = amountMax;
        this.rate = rate;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
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

    @Override
    public String toString() {
        return "LoanTypeForm{" +
                "name='" + name + '\'' +
                ", conditions='" + conditions + '\'' +
                ", amountMin=" + amountMin +
                ", amountMax=" + amountMax +
                ", rate=" + rate +
                ", term=" + term +
                '}';
    }
}
