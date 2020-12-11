package univali.bit.View;

import univali.bit.Model.SecretWord;
import java.util.ArrayList;

public class GameStatus {
    private String SecretWord;
    private SecretWord.KickResults result;
    private ArrayList<String> WrongKicks;
    private ArrayList<String> CorrectlyKicks;

    public void setSecretWord(String secretWord) {
        this.SecretWord = secretWord;
    }

    public void setResult(SecretWord.KickResults result) {
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

    private void renderSecretWordCorrectlyLetters(){
        String strikesOfSecretWord = "";
        for (int i = 0; i < this.SecretWord.length(); i++)
            if(this.CorrectlyKicks.contains(String.valueOf(this.SecretWord.charAt(i))))
                strikesOfSecretWord += this.SecretWord.charAt(i);
            else
                strikesOfSecretWord += "_";

        System.out.println(strikesOfSecretWord);
    }

    private void renderDoll(){
        Doll doll = new Doll();
        doll.setWrongErrors(WrongKicks.size());

        doll.render();
    }

    public void render(){
        renderDoll();
        renderSecretWordCorrectlyLetters();
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
        }
    }
}
