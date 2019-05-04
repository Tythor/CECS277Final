package FinalExam.Factory;

import FinalExam.AquaworldRoom;
import FinalExam.Room;

public class AquaworldRoomFactory extends RoomFactory {
    @Override
    public Room createRoom() {
        return new AquaworldRoom();
    }
}
