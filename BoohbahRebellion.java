public class SupremeBoohbah {
    protected String name;

    public SupremeBoohbah() {
        name = "ZingZingZingbah";
        System.out.println("The SupremeBoohbah has awakened");
    }

    public void command() {
        System.out.println("Cower in fear before your new leader.");
    }

    public void command(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "SupremeBoohbah named " + name;
    }
}
