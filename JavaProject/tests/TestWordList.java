import org.junit.jupiter.api.Test;
import univali.bit.Model.WordList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestWordList {
    @Test
    public void testGetFirstWord()
    {
        WordList wordList = new WordList();
        assertEquals("barraca", wordList.getWordList().get(0));
    }

    @Test
    public void testGetRandomWord()
    {
        WordList wordList = new WordList();
        for (int i = 0; i < 100000; i++) {
            try {
                wordList.getWord();
            } catch (Exception e){
                fail("Invalid word");
            }
        }
    }
}
