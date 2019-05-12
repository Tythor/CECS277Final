package FinalExam;

import FinalExam.Factory.*;

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

        // Abstract Factory Implementation
        RoomFactory roomFactory = null;
        String name = "MediumPartyRoom";
        switch (name) {
            case "SmallPartyRoom":
                roomFactory = new SmallPartyRoomFactory();
                break;
            case "MediumPartyRoom":
                roomFactory = new MediumPartyRoomFactory();
                break;
            case "AquaworldRoom":
                roomFactory = new AquaworldRoomFactory();
                break;
            case "BilliardsLounge":
                roomFactory = new BilliardsLoungeFactory();
                break;
            case "KaraokeLounge":
                roomFactory = new KaraokeLoungeFactory();
                break;
        }
        Room room = roomFactory.createRoom();
        System.out.println(room);

        Room smallPartyRoom = new SmallPartyRoomFactory().createRoom();
        System.out.println(smallPartyRoom);
    }
}
