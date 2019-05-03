package FinalExam.Factory;

import FinalExam.Room;
import FinalExam.SmallPartyRoom;

public class SmallPartyRoomFactory extends RoomFactory {
    public Room createRoom() {
        return new SmallPartyRoom();
    }
}
