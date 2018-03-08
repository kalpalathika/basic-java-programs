package com.kalpu;

public class Main
{

    public static void main(String[] args)
    {
	byte mybytevalue= 6;
    short myshortvalue= 33;
    int myintvalue= 140;
    long mylongvalue= 50000L + 10L*(mybytevalue + myshortvalue+
    myintvalue);
    System.out.println("mylongvalue is" +mylongvalue);
    }
}
