package entities;

public class CompanyAccount extends Account {

    private Integer numberOfEmployees;

    public CompanyAccount(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        }
        else{
            return getAnualIncome() * 16;
        }
    }
}
