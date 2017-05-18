package barber;

/**
 * @author Yurii Malikov
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class HairdressingSalon{

    private String name;

    private AtomicInteger waitingRoomFreeSeatsQuantity;

    private Semaphore waitingRoomDoor;

    private Semaphore barberRoomDoor;

    private Semaphore barbersChairCreepyBelt;

    private BlockingQueue<Client> waitingClientsQueue;


    public HairdressingSalon(String name, int totalWaitingRoomCapacity) {
        this.name = name;
        waitingRoomFreeSeatsQuantity = new AtomicInteger(totalWaitingRoomCapacity);
        waitingRoomDoor = new Semaphore(1); // one by one, gentlemen!
        barberRoomDoor = new Semaphore(1);
        barbersChairCreepyBelt = new Semaphore(0);
        waitingClientsQueue = new ArrayBlockingQueue<>(totalWaitingRoomCapacity);
    }

    public AtomicInteger getWaitingRoomFreeSeatsQuantity() {
        return waitingRoomFreeSeatsQuantity;
    }

    public Semaphore getBarberRoomDoor() {
        return barberRoomDoor;
    }

    public Semaphore getBarbersChairCreepyBelt() {
        return barbersChairCreepyBelt;
    }

    public BlockingQueue<Client> getWaitingClientsQueue() {
        return waitingClientsQueue;
    }

    public Semaphore getWaitingRoomDoor() {
        return waitingRoomDoor;
    }

    @Override
    public String toString() {
        return "barber shop \"" + name + '"';
    }
}
