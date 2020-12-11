package univali.bit.Model;

import java.io.IOException;
import java.util.ArrayList;

public class WordList {
    private final ArrayList<String> WordList;
    private static final String FileName = "WordList.txt";

    /**
     * Custom constructor,
     * read words from internal saved file path
     */
    public WordList() {
        this.WordList = FileIO.readLines(FileName);
    }

    public ArrayList<String> getWordList() {
        return WordList;
    }

    public String getWord(){
        return "BARATA";

        //int randomIndex = (int) (Math.random() * (this.getWordList().size()));
        //return this.getWordList().get(randomIndex).toUpperCase();
    }
}
