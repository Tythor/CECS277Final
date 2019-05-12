package FinalExam.Factory;

import FinalExam.AquaworldRoom;
import FinalExam.Room;

/**
 * This class represents a ConcreteFactory in the abstract factory design pattern.
 */
public class AquaworldRoomFactory extends RoomFactory {

    /**
     * This method overrides the abstract method in RoomFactory and returns an AquaworldRoom object
     *
     * @return AquaworldRoom
     */
    @Override
    public Room createRoom() {
        return new AquaworldRoom();
    }
}
