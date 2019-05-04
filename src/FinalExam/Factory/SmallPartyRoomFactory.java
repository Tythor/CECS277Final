package FinalExam.Factory;

import FinalExam.Room;
import FinalExam.SmallPartyRoom;

public class SmallPartyRoomFactory extends RoomFactory {
    @Override
    public Room createRoom() {
        /*SmallPartyRoom smallPartyRoom = new SmallPartyRoom();
        smallPartyRoom.setName("Small Party Room");
        smallPartyRoom.setDescription("Room with party tables and chairs, adjacent to arcade. Includes table & chair set-up and basic meal plan in cost.");
        smallPartyRoom.setCapacity(30);
        return smallPartyRoom;*/
        return new SmallPartyRoom();
    }
}
