package FinalExam;

public class Main {
    public static void main(String[] args) {
        SmallPartyRoom a = new SmallPartyRoom();
        System.out.println(a);

        MediumPartyRoom b = new MediumPartyRoom();
        System.out.println(b);

        AquaworldRoom c = new AquaworldRoom();
        String d = c.newAquaworldRoom();
        System.out.println(d);

        BillardsLounge e = new BillardsLounge();
        System.out.println(e);

        KaraokeLounge f = new KaraokeLounge();
        System.out.println(f);
    }
}
