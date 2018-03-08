package com.kalpu;

public class Main {

    public static void main(String[] args)
    {
        String name;

        int score;
        int position= calculatehighscoreposition(1500);
        displayhishschoolposition( "aadu", position);

        position= calculatehighscoreposition(900);
        displayhishschoolposition( "nimi", position);

         position= calculatehighscoreposition(400);
        displayhishschoolposition( "kalpu", position);

         position= calculatehighscoreposition(50);
        displayhishschoolposition( "rohit", position);


    }



    public static void displayhishschoolposition(String name,int position)
    {
        System.out.println(name+  "\n managed to get into position\n"  +position+  "\ton the score table\t");
        ;
    }


    public static int calculatehighscoreposition(int score)
    {
        if(score>1000)
        {
            return 1;

        }
        else if(score<1000 &&  score>500 )
        {


            return 2;
        }
      else  if( score<500 && score>100)
        {
            int finalposition =3;
            return finalposition;

        }
        int finalposition =4;
        return finalposition;
    }
}
