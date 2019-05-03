package FinalExam.Factory;

import FinalExam.KaraokeLounge;
import FinalExam.Room;

public class KaraokeLoungeFactory extends RoomFactory {
    public Room createRoom() {
        return new KaraokeLounge();
    }
}
