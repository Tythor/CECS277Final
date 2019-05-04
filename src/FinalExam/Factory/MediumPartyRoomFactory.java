package FinalExam.Factory;

import FinalExam.MediumPartyRoom;
import FinalExam.Room;

public class MediumPartyRoomFactory extends RoomFactory {
    @Override
    public Room createRoom() {
        return new MediumPartyRoom();
    }
}
