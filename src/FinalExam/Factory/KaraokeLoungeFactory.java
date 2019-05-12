package FinalExam.Factory;

import FinalExam.KaraokeLounge;
import FinalExam.Room;

/**
 * This class represents a ConcreteFactory in the abstract factory design pattern.
 */
public class KaraokeLoungeFactory extends RoomFactory {

    /**
     * This method overrides the abstract method in RoomFactory and returns a KaraokeLounge object
     *
     * @return KaraokeLounge
     */
    @Override
    public Room createRoom() {
        return new KaraokeLounge();
    }
}
