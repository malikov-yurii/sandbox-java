package barber;

import static barber.util.AnsiConstant.ANSI_BLUE;
import static barber.util.AnsiConstant.ANSI_RED;
import static barber.util.AnsiConstant.ANSI_RESET;
import static barber.util.StopWatch.getTimePoint;

/**
 * @author Yurii Malikov
 */
class Client implements Runnable {

    private HairdressingSalon salon;

    private int id;

    public Client(int i) {
        id = i;
    }

    public void choosesToGetHaircutIn(HairdressingSalon salon) {
        this.salon = salon;
    }

    public void run() {
        try {
            System.out.println(getTimePoint() + " " + this + " has come to the door of " + salon);
            salon.getWaitingRoomDoor().acquire(); // client blocks the door preventing another client entrance
            if (salon.getWaitingRoomFreeSeatsQuantity().get() > 0) {
                salon.getWaitingRoomFreeSeatsQuantity().decrementAndGet();
                if (salon.getBarberRoomDoor().availablePermits() == 1) {
                    System.out.println(getTimePoint() + " " + this
                            + " found sleeping barber in a waiting room, woke him up."
                            + " They head to the barber\'s room.");
                } else {
                    System.out.println(getTimePoint() + " " + this +
                            " sets in a waiting room and is waiting for his turn.");
                }
                salon.getWaitingRoomDoor().release(); // client unblocks the waiting room door
                salon.getWaitingClientsQueue().put(this);
                salon.getBarberRoomDoor().acquire();
                Thread.sleep(20); // time to get from waiting room to hairdresser's chair
                salon.getWaitingRoomFreeSeatsQuantity().incrementAndGet();
                getHaircut();
                System.out.println(getTimePoint() + " " + ANSI_BLUE + this
                        + " had his hair cut and left a creepy salon overwhelmed." + ANSI_RESET);

            } else {
                System.out.println(getTimePoint() + " " + ANSI_RED
                        + this + " has gone! There are no free seats in a waiting room!!" + ANSI_RESET);
                salon.getWaitingRoomDoor().release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getHaircut() {
        System.out.println(getTimePoint()
                + " OMG! " + this + "\'s realized he is locked in a barber\'s chair!");
        try {
            // Client tries to escape from the seat by removing the belt
            salon.getBarbersChairCreepyBelt().acquire();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Client" + id;
    }
}