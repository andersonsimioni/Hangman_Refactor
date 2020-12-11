package univali.bit.Model;

import univali.bit.View.GameStatus;

import java.util.ArrayList;

public class SecretWord {
    public enum KickResults {
        CorrectLetter,
        WrongLetter,
        WinGame,
        LoseGame
    }

    private KickResults KickResult;
    private final String SecretWord;
    private final ArrayList<String> WrongKicks;
    private final ArrayList<String> CorrectlyKicks;

    public KickResults getKickResult() {
        return KickResult;
    }

    public String getSecretWord() {
        return SecretWord;
    }

    public ArrayList<String> getWrongKicks() {
        return WrongKicks;
    }

    public ArrayList<String> getCorrectlyKicks() {
        return CorrectlyKicks;
    }

    public SecretWord() {
        WordList wordList = new WordList();
        this.SecretWord = wordList.getWord();
        this.WrongKicks = new ArrayList<String>();
        this.CorrectlyKicks = new ArrayList<String>();
    }

    public boolean isEndGame(){
        return (KickResult == KickResults.WinGame || KickResult == KickResults.LoseGame);
    }

    private void updateEndGameStatus(){
        if(getWrongKicks().size() >= 6)
            KickResult = KickResults.LoseGame;

        for (int i = 0; i < SecretWord.length(); i++)
            if(CorrectlyKicks.contains(String.valueOf(SecretWord.charAt(i))) == false)
                return;
        KickResult = KickResults.WinGame;
    }

    public void kick(String kick){
        if(kick.length() > 1){
            this.KickResult = KickResults.LoseGame;
            if(hitWord(kick))
                this.KickResult = KickResults.WinGame;

            return;
        }

        if(SecretWord.contains(kick)){
            this.CorrectlyKicks.add(kick);
            this.KickResult = KickResults.CorrectLetter;
        }
        else{
            this.WrongKicks.add(kick);
            this.KickResult = KickResults.WrongLetter;
        }

        updateEndGameStatus();
    }

    private boolean hitWord(String word){
        return word.equals(this.SecretWord);
    }

    private boolean containsLetter(String letter){
        return SecretWord.contains(letter);
    }
}
