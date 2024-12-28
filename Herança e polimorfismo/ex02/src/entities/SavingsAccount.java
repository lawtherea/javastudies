package entities;

public final class SavingsAccount extends Account { //o uso de final evita que sejam criadas
    // subclasses dessa classe
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //ao fazer um saque, é cobrado 5 reais de taxa na classe Account, porém, se for uma
    // SavingsAccount, não é pra ter taxa. Para isso, se faz um Override/Sobreposição
    @Override
    public final void withdraw(double amount) { //o uso de final evita que esse metodo seja sobreposto
        balance -= amount;
    }

}
