public class Jingbah extends SupremeBoohbah{

    public Jingbah() {
        super();
        name = "Jingbah";
        System.out.println("want peace between all Boohbah");
    }

    @Override
    public void command(String message) {
        String m = "want peace between all Boohbah";
        System.out.println(message + m);
    }

    public void command(String message, boolean whisper) {
        if (whisper) {
            System.out.println("Quietly calms " + message);
        }
        else {
            System.out.println("Loudly calms " + message);
        }

}

    @Override
    public String toString() {
        return name + " says: lets all be friends.";
    }
}
