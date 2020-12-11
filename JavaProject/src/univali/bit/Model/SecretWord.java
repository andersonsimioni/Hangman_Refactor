package univali.bit.Model;

import java.util.ArrayList;

public class SecretWord {
    private final String secretWord;
    private final ArrayList<String> WrongKicks;
    private final ArrayList<String> CorrectlyKicks;

    public SecretWord() {
        WordList wordList = new WordList();
        this.secretWord = wordList.getWord();
        this.WrongKicks = new ArrayList<String>();
        this.CorrectlyKicks = new ArrayList<String>();
    }

    public void Kick(String kick){

    }

    private boolean hitWord(String word){
        return word.equals(this.secretWord);
    }

    private boolean containsLetter(String letter){
        return false;
    }
}
