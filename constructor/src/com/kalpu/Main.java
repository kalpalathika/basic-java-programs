package com.kalpu;

public class Main {

    public static void main(String[] args)
    {
        VipCustomer cust = new VipCustomer();

        System.out.println("the cust name is\n"+cust.getName());

        VipCustomer custa = new VipCustomer("kalpz", 234);
        System.out.println("the name  is\n" + custa.getName()+"\n" );

        VipCustomer custb = new VipCustomer("kalpuuuu", 560, "kalp@gmail.com");
        System.out.println("the name is\n" + custb.getName());


    }
}
