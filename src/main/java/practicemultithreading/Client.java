package practicemultithreading;

import static java.lang.Thread.sleep;
import static practicemultithreading.AnsiConstants.*;

/**
 * @author Yurii Malikov
 */
class Client implements Runnable {

    private HairdressingSalon salon;

    private int id;

    public Client(int i) {
        id = i;
    }

    public void choosesToGetHaircutIn(HairdressingSalon hairdressingSalon) {
        this.salon = hairdressingSalon;
    }

    public void run() {
        try {
            System.out.println(System.currentTimeMillis() % 10_000 + " " + this + " has just come to the door of " + salon);
            salon.getWaitingRoomDoor().acquire();
            if (salon.getWaitingRoomFreeSeatsQuantity().get() > 0) {
                salon.getWaitingRoomFreeSeatsQuantity().decrementAndGet();
                System.out.println(System.currentTimeMillis() % 10_000 + " " + this + " has taken down a free seat in a waiting room.");
                salon.getWaitingRoomDoor().release();
                salon.getWaitingClients().put(this);
                salon.getHairdresserRoom().acquire();

                salon.getWaitingRoomFreeSeatsQuantity().incrementAndGet();
                getHaircut();
                System.out.println(System.currentTimeMillis() % 10_000 + " " + ANSI_BLUE + this + " has been cut and has left a hairdressing salon." + ANSI_RESET);
            } else {
                System.out.println(System.currentTimeMillis() % 10_000 + " " + ANSI_RED + this + " has gone! There are no free seats in a waiting room!!" + ANSI_RESET);
                salon.getWaitingRoomDoor().release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getHaircut() {
        System.out.println(System.currentTimeMillis() % 10_000 + " Client" + id + " has set in a hairdresser\'s chair.");
        try {
            sleep(50);
        } catch (InterruptedException ex) {
        }
    }

    @Override
    public String toString() {
        return "Client" + id;
    }
}