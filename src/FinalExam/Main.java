package FinalExam;

public class Main {
    public static void main(String[] args) {

        SmallPartyRoom a = new SmallPartyRoom();
        System.out.println(a);
        System.out.println();

        MediumPartyRoom b = new MediumPartyRoom();
        System.out.println(b);
        System.out.println();

        AquaworldRoom c = new AquaworldRoom();
        String d = c.newAquaworldRoom();
        System.out.println(d);
        System.out.println();

        BillardsLounge e = new BillardsLounge();
        System.out.println(e);
        System.out.println();

        KaraokeLounge f = new KaraokeLounge();
        System.out.println(f);
        System.out.println();
    }
}
