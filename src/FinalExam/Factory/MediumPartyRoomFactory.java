package FinalExam.Factory;

import FinalExam.MediumPartyRoom;
import FinalExam.Room;

/**
 * This class represents a ConcreteFactory in the abstract factory design pattern.
 */
public class MediumPartyRoomFactory extends RoomFactory {

    /**
     * This method overrides the abstract method in RoomFactory and returns an MediumPartyRoom object
     *
     * @return MediumPartyRoom
     */
    @Override
    public Room createRoom() {
        return new MediumPartyRoom();
    }
}
