package com.kalpu;

public class Main {

    public static void main(String[] args)
    {
        calcFeetAndInchesToCentimeters(0,1);
        calcFeetAndInchesToCentimeters(10);



    }


    public static double calcFeetAndInchesToCentimeters(float feet,float inches) {
        if (feet >= 0)

        {
            double feettocentimeters = feet / 0.032808d;
            System.out.println("ftoc is \n" + feettocentimeters);
        }

        if (12 > inches && inches >8) {
            double inchestocentimeters = inches / 2.54;

            System.out.println("itoc is \n" + inchestocentimeters);
            return inchestocentimeters;
        } else
            {
            return -1;
            }

    }

    public static double calcFeetAndInchesToCentimeters(float inches)

    {
        if(inches>=0)
        {
            double inchestofeet= inches/0.083333;
            System.out.println("itoc is \n"+inchestofeet);
            return inchestofeet;


        }
        else
        {
            return -1;
        }
    }
}
