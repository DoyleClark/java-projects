public class methods{

    public static void main(String[] args){

        int highScore = calculateScore(true, 800, 5, 10);
        System.out.println("Your high score was: "+highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your high score was: "+highScore);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Doyle", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ryan", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Rob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Grammit", highScorePosition);

	highScorePosition = calculateHighScorePosition(300);
        displayHighScorePosition("Jamie", highScorePosition);

	highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Peach", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

	if(gameOver){
	    int finalScore = score+(levelCompleted*bonus);
	    finalScore+=2000;
	    return finalScore;
	}
	return -1;
    }

    public static void displayHighScorePosition(String playersName, int highScorePosition){
        System.out.println(playersName+" managed to get into position "+highScorePosition+" on the high score table");
    }

    public static int calculateHighScorePosition(int playersScore){

	/*
	 if(playersScore >= 1000){
            return 1;
        }
        else if(playersScore >= 500){
            return 2;
        }
        else if(playersScore >= 100){
            return 3;
        }
            return 4;
	*/

	int position = 4; //assuming position 4 will be returned

	if(playersScore >= 1000){
	    position = 1;
	}
	else if(playersScore >=500){
	    position = 2;
	}
	else if(playersScore >= 100){
	    position = 3;
	}
	return position;
    }
}