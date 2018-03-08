package com.kalpu;

public class Main {

    public static void main(String[] args)
    {
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        calculatefinalScore(gameover, score, levelcompleted, bonus);
        score = 10000;
        levelcompleted = 8;
        bonus = 200;
        calculatefinalScore(gameover, score, levelcompleted, bonus);

    }


    public static int  calculatefinalScore(boolean gameover, int score, int levelcompleted, int bonus)

    {


        if (gameover == false) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 2000;
            System.out.println("the final score is" + finalscore);
            return finalscore;


        } else return -1;
    }

}