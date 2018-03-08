package com.kalpu;

public class Main {

    public static void main(String[] args)

    {
        for(double interestrate=2;interestrate<9;interestrate++ )
        {
            double rate= calculateinterest(10000.0,interestrate);
                    System.out.println("10,000 at the\t" +interestrate+ " %is\t" +rate);
        }
        for(double interestrate=8;interestrate>1;interestrate-- )
        {
            double rate=calculateinterest(10000.0,interestrate);
            System.out.println("10,000 at the\t" +interestrate+ " %is\t" +rate);
        }
    }
    public static  double calculateinterest(double amount,double interestrate)
    {
        return (amount *(interestrate/100));
    }
}
