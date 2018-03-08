package com.kalpu;

public class VipCustomer {
    private String Name;
    private double limit;
    private String emailaddress;


    public VipCustomer()
    {
        this("default name", 123, "default emailid");


    }

    public VipCustomer(String Name, double limit)
    {
        this(Name,limit,"unknown@gmail.com");
    }

    public VipCustomer(String Name, double limit, String emailaddress) {
        System.out.println("the parameters are");
        this.Name = Name;
        this.limit = limit;
        this.emailaddress = emailaddress;
    }

    public  String getName()
    {
        return this.Name;
    }

    public  double getlimit() {
        return this.limit;

    }

    public  String getemailaddress() {
        return this.emailaddress;
    }
}