public class BoohbahRebellionTest {

    public static void main(String[] args) {
        SupremeBoohbah[] boohbahs = new SupremeBoohbah[4];
        Humbah humbah = new Humbah();
        Jingbah jingbah = new Jingbah();
        Zumbah zumbah = new Zumbah();
        Jumbah jumbah = new Jumbah();

        boohbahs[0] = humbah;
        boohbahs[1] = jingbah;
        boohbahs[2] = zumbah;
        boohbahs[3] = jumbah;

        System.out.println(" --- Boohbah Rebellion Begins ---");
        for (int i = 0; i < boohbahs.length; i++) {
            boohbahs[i].command();
        }

        System.out.println(" --- Overloaded Commands ---");
        boohbahs[2].command("pretends to conform, but initiates a POWER HUM.");
        boohbahs[1].command("calms everyone down.", true);
       // boohbahs[1].command("Loudly calms everyone down.", false);

    }
}
