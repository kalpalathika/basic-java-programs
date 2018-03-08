package com.kalpu;

public class Bankaccount {
    public int accountNumber;
    public int balance;
    public String customername;
    public String email;
    public int phoneNo;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }

    public int getBalance() {
        return this.balance;
    }


    public void setCustomername(String customername) {
        this.customername = customername;

    }

    public String getCustumername() {
        return this.customername;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;

    }

    public int getPhoneNo() {
        return this.phoneNo;
    }

    public void Deposit(int customerDeposit) {
        this.balance = customerDeposit + this.balance;
        System.out.println("\n the current balance after deposit  is\t" + this.balance);

    }

    public void withdrawal(int customerWithdrawal)

    {
        if (this.balance > customerWithdrawal) {
            this.balance = this.balance - customerWithdrawal;
            System.out.println("\n the current balance after withdrawal is\t" + this.balance);


        } else {
            System.out.println("\n there is not sufficient balance in your account");
        }
    }
}