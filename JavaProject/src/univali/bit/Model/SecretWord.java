package univali.bit.Model;

public class SecretWord {
    private String secretWord;

    public SecretWord() {
        WordList wordList = new WordList();
        this.secretWord = wordList.getWord();
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
