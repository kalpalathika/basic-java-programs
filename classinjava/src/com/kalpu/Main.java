package com.kalpu;

public class Main {

    public static void main(String[] args)

    {
        Bankaccount customer=new Bankaccount();


        customer.setAccountNumber(23);
        System.out.print("the acc number is :\t"+customer.getAccountNumber());

        customer.setBalance(2300);
        System.out.print("\n the acc balance is :\t"+customer.getBalance());


        customer.setCustomername("kalpu");
        System.out.print("\n the customername is :\t"+customer.getCustumername());


        customer.setEmail("kalpalathika@gmail.com");
        System.out.print("\n the Email id is :\t"+customer.getEmail());


        customer.setPhoneNo(982144);
        System.out.print("\n the phonenumber is :\t"+customer.getPhoneNo());

        customer.Deposit(330);
        customer.withdrawal(3000);



    }
}
