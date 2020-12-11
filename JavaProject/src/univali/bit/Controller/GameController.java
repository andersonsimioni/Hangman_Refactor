package univali.bit.Controller;

import univali.bit.Command;
import univali.bit.Model.SecretWord;
import univali.bit.View.GameStatus;
import univali.bit.View.Input;

public class GameController extends Command {
    private final GameStatus Status;
    private final SecretWord Word;
    private final Input Input;

    @Override
    public void Execute() {
        while (Word.isEndGame() == false){
            Input.addRangePlayedLetters(this.Word.getCorrectlyKicks());
            Input.addRangePlayedLetters(this.Word.getWrongKicks());
            Input.read();

            this.Word.kick(Input.getInput());

            this.Status.setResult(this.Word.getKickResult());
            this.Status.setSecretWord(this.Word.getSecretWord());
            this.Status.setWrongKicks(this.Word.getWrongKicks());
            this.Status.setCorrectlyKicks(this.Word.getCorrectlyKicks());
            this.Status.render();
        }
    }

    public GameController(){
        this.Status = new GameStatus();
        this.Word = new SecretWord();
        this.Input = new Input();
    }
}
