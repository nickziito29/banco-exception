package model.entities;

import model.exceptions.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //CONSTRUTORES
    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws AccountException {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //GETTERS E SETTERS
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //MÉTODOS

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount) throws AccountException {
        // Comparação da quantia desejada para o limite de saque da conta.
        if (amount > withdrawLimit) {
            throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
        }
        // Comparação da quantia desejada e o saldo da conta.
        if (amount > this.balance){
            throw new  AccountException("Withdraw error: Not enough balance");
        } else {
            this.balance -= amount;
            System.out.println("New Balance: " +  String.format("%.2f",this.balance));
        }
    }





}
