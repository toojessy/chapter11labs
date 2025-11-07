public class Jumbah extends SupremeBoohbah{

    public Jumbah() {
        super();
        name = "Jumbah";
        System.out.println("refuses to submit!");
    }

    @Override
    public String toString() {
        String message = name + " says: NEVER!!";
        super.command(message);
        return name + " says: NEVER!!";
    }
}
