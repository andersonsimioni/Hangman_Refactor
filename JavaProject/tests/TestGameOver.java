import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import univali.bit.View.GameOver;

public class TestGameOver {
    @Test
    public void TestLose(){
        GameOver gameOver = new GameOver();
        String loseMessage = " YOU LOSE!\n " +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // |   | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |         / | | \\\n" +
                "\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n" +
                "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                "| |        \\ \\        | |\n" +
                ": :         \\ \\       : :\n" +
                ". .          `'       . .";

        assertEquals(loseMessage, gameOver.Lose());
    }

    @Test
    public void TestWin()
    {
        GameOver gameOver = new GameOver();

        String winMessage = "    )   )                    (       )  \n" +
                "  ( /(( /(          (  (      )\\ ) ( /(  \n" +
                "  )\\())\\())    (    )\\))(   '(()/( )\\()) \n" +
                " ((_)((_)\\     )\\  ((_)()\\ )  /(_)|(_)\\  \n" +
                "__ ((_)((_) _ ((_) _(())\\_)()(_))  _((_) \n" +
                "\\ \\ / / _ \\| | | | \\ \\((_)/ /|_ _|| \\| | \n" +
                " \\ V / (_) | |_| |  \\ \\/\\/ /  | | | .` | \n" +
                "  |_| \\___/ \\___/    \\_/\\_/  |___||_|\\_| ";

        assertEquals(winMessage, gameOver.Win());
    }
}
