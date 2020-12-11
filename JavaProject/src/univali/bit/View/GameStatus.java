package univali.bit.View;

import java.util.ArrayList;

public class GameStatus {
    enum RoundResults{
        CorrectLetter,
        WrongLetter,
        WinGame,
        LoseGame,
        LetterAlreadyPlayed
    }

    private String secretWord;
    private RoundResults result;
    private ArrayList<String> WrongKicks;
    private ArrayList<String> CorrectlyKicks;

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public void setResult(RoundResults result) {
        this.result = result;
    }

    public void setWrongKicks(ArrayList<String> wrongKicks) {
        WrongKicks = wrongKicks;
    }

    public void setCorrectlyKicks(ArrayList<String> correctlyKicks) {
        CorrectlyKicks = correctlyKicks;
    }

    private void renderCorrectlyWrongLetters(){
        String wrong = "Wront letters: ";
        for (String s:WrongKicks)
            wrong += s + "; ";

        String correctly = "Correctly letters: ";
        for (String s:CorrectlyKicks)
            correctly += s + "; ";

        System.out.println(wrong);
        System.out.println(correctly);
    }
    
    public void render(){
        renderCorrectlyWrongLetters();

        switch (result){
            case WinGame -> {
                EndGame game = new EndGame();
                System.out.println(game.Win());
            }
            case LoseGame -> {
                EndGame game = new EndGame();
                System.out.println(game.Lose());
            }

            case WrongLetter -> {
                System.out.println("Wrong letter :(");
            }
            case CorrectLetter -> {
                System.out.println("Nice kick !!");
            }
            case LetterAlreadyPlayed -> {
                System.out.println("Letter already played");
            }
        }
    }
}
