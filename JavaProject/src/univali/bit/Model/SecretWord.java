package univali.bit.Model;

import java.util.ArrayList;

public class SecretWord {
    public enum KickResults {
        CorrectLetter,
        WrongLetter,
        WinGame,
        LoseGame,
        LetterAlreadyPlayed
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
        for (int i = 0; i < SecretWord.length(); i++)
            if(CorrectlyKicks.contains(SecretWord.charAt(i)) == false)
                return false;

        return true;
    }

    public void kick(String kick){

        this.KickResult = KickResults.CorrectLetter;
    }

    private boolean hitWord(String word){
        return word.equals(this.SecretWord);
    }

    private boolean containsLetter(String letter){
        return false;
    }
}
