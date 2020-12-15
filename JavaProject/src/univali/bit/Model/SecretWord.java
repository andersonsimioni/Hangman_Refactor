package univali.bit.Model;

import univali.bit.View.GameStatus;

import java.util.ArrayList;
import java.util.List;

public class SecretWord {
    public enum KickResults {
        CorrectLetter,
        WrongLetter,
        WinGame,
        LoseGame
    }

    private List<String> PlayedLetters;
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
        this.addRangePlayedLetters(this.getCorrectlyKicks());
        this.addRangePlayedLetters(this.getWrongKicks());
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
        this.validateKick(kick);

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

    private void addRangePlayedLetters(List<String> playedLetters) {
        if(PlayedLetters == null)
            PlayedLetters = new ArrayList<String>();

        for (String s:playedLetters)
            if(!PlayedLetters.contains(s))
                PlayedLetters.add(s);
    }

    private void validateKick(String kick){
        if(kick == null || kick.isEmpty()){
            throw new IllegalArgumentException("invalid input!");
        }

        if(PlayedLetters != null && PlayedLetters.contains(kick)){
            throw new IllegalArgumentException("letter already played");
        }
    }

    public String getSecretWordWithWildCards(){
        String strikesOfSecretWord = "";
        for (int i = 0; i < this.SecretWord.length(); i++)
            if(this.CorrectlyKicks.contains(String.valueOf(this.SecretWord.charAt(i))))
                strikesOfSecretWord += this.SecretWord.charAt(i);
            else
                strikesOfSecretWord += "_";

        return strikesOfSecretWord;
    }
}
