public class Jingbah extends SupremeBoohbah{

    public Jingbah() {
        super();
        name = "Jingbah";
        System.out.println(name + " want's peace between all Boohbah");
    }

    @Override
    public void command() {
        System.out.println(name + " want peace between all Boohbah");
    }

    public void command(String message, boolean whisper) {
        if (whisper) {
            System.out.println(name + " pleads for peace and love amoung the Boohbah.");
        }
        else {
            System.out.println(name + " shouts: I wish we could all get along like we used to in middle school. I wish we could bake a cake made out of rainbows and smile and we'd all eat it and be happy-  *Zumbah interrupts* BOOHBAH DOESN'T EVEN GO HERE!");
        }

    }

    @Override
    public String toString() {
        return name + " says: lets all be friends.";
    }
}
