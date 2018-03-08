package com.kalpu;

public class Main {

    public static void main(String[] args)
    {
	char name='A','B','C','D';
	int position = 1,2,3,4;
	int score=1500,900,400,50;
        displayhishschoolposition( name, position);
        int pos= calculatehighscoreposition(score);

    }



   public static void         displayhishschoolpositionition);
    {
        System.out.println("the name of the player"+ name);
        System.out.println("the posiion of the player"+ position);
    }


    public int calculatehighscoreposition(int score)
    {
        if(score>1000)
        {
           int finalposition =1;
            return finalposition;

        }
         if(score<1000 && >500 )
        {
            int finalposition = 2;

            return finalposition;
        }
            if( score<500 && >100)
            {
             int finalposition =3;
             return finalposition;

            }
            int finalposition =4;
            return finalposition;
    }
}
