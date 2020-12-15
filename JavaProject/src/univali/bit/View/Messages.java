package univali.bit.View;

public class Messages {
    private final String message;

    public Messages(String message) {
        this.message = message;
    }

    public void show(){
        System.out.println(this.message);
    }
}
