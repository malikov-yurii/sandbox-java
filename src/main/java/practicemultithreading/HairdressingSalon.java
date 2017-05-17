package practicemultithreading;

/**
 * @author Yurii Malikov
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class HairdressingSalon{

    private String name;

    private int totalWaitingRoomCapacity;

    private AtomicInteger waitingRoomFreeSeatsQuantity;

    private Semaphore hairdresserRoom;

    private BlockingQueue<Client> waitingClients;

    private Semaphore waitingRoomDoor;


    public HairdressingSalon(String name, int totalWaitingRoomCapacity) {
        this.name = name;
        this.totalWaitingRoomCapacity = totalWaitingRoomCapacity;
        waitingRoomFreeSeatsQuantity = new AtomicInteger(totalWaitingRoomCapacity);
        hairdresserRoom = new Semaphore(1);
        waitingClients = new ArrayBlockingQueue<>(totalWaitingRoomCapacity);
        waitingRoomDoor = new Semaphore(1); // one by one, gentlemen!
    }

    public int getTotalWaitingRoomCapacity() {
        return totalWaitingRoomCapacity;
    }

    public AtomicInteger getWaitingRoomFreeSeatsQuantity() {
        return waitingRoomFreeSeatsQuantity;
    }

    public Semaphore getHairdresserRoom() {
        return hairdresserRoom;
    }

    public BlockingQueue<Client> getWaitingClients() {
        return waitingClients;
    }

    public Semaphore getWaitingRoomDoor() {
        return waitingRoomDoor;
    }

    @Override
    public String toString() {
        return "HairdressingSalon \"" + name + '"';
    }
}
