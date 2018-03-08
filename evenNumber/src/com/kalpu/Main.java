package com.kalpu;

public class Main {

    public static void main(String[] args) {
        int Number = 5;
        int finishnumber = 20;
        int count=0;
        while (Number <= finishnumber)
        {
            if (!isEvenNumber(Number)) {
                Number++;
                continue;


            }

            count=count+1;

            if(count<6)
            System.out.println("even number\t" + Number);
            Number++;
        }
        System.out.println("total count is\t" + count);
    }


                public static boolean isEvenNumber(int Number)
                {
                    if((Number%2)==0)


                    {



                        return true;


                    }


                    else
                    {

                        return false;
                    }
                }
            }




