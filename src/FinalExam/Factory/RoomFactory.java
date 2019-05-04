package FinalExam.Factory;

import FinalExam.Room;

public abstract class RoomFactory {
    public static final int MAX_AQUAWORLDROOM = 1;
    public static final int MAX_SMALLPARTYROOM = 10;
    public static final int MAX_MEDIUMPARTYROOM = 2;
    public static final int MAX_KARAOKELOUNGE = 10;
    public static final int MAX_BILLIARDSLOUNGE = 5;

    private static int count_aquaworldroom;
    private static int count_smallpartyroom;
    private static int count_mediumpartyroom;
    private static int count_karaokelounge;
    private static int count_billiardslounge;

    public abstract Room createRoom();
}
