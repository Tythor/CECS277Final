package FinalExam.Factory;

import FinalExam.BillardsLounge;
import FinalExam.Room;

public class BilliardsLoungeFactory extends RoomFactory {
    @Override
    public Room createRoom() {
        return new BillardsLounge();
    }
}
