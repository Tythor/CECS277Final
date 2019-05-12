package FinalExam.Factory;

import FinalExam.BillardsLounge;
import FinalExam.Room;

/**
 * This class represents a ConcreteFactory in the abstract factory design pattern.
 */
public class BilliardsLoungeFactory extends RoomFactory {

    /**
     * This method overrides the abstract method in RoomFactory and returns a BilliardsLounge object
     *
     * @return BilliardsLounge
     */
    @Override
    public Room createRoom() {
        return new BillardsLounge();
    }
}
