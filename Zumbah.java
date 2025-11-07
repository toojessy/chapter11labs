public class Zumbah extends SupremeBoohbah{

    public Zumbah() {
        super();
        name = "Zumbah";
        System.out.println("proclaims loyalty to ZingZingZingbah with crossed fingers behind back.");
    }

    @Override
    public void command(String message) {
        String m = " proclaims loyalty to ZingZingZingbah with crossed fingers behind back.";
        System.out.println(message + m);
    }

    @Override
    public String toString() {
        return name + "  pretends to conform, but initiates a POWER HUM.";
    }
}
