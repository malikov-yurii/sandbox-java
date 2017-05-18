package barber;

import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;
import static barber.util.AnsiConstant.ANSI_RESET;
import static barber.util.AnsiConstant.ANSI_YELLOW;
import static barber.util.StopWatch.getTimePoint;
import static barber.util.StringUtil.capitalizeFirstLetter;

/**
 * @author Yurii Malikov
 */
class Barber implements Runnable {

    public static final int HAIRCUT_MIN_DURATION = 550;

    public static final int HAIRCUT_MAX_DURATION = 650;

    private HairdressingSalon salon;

    private String name;

    public Barber(String name) {
        this.name = name;
    }

    public void hiredIn(HairdressingSalon salon) {
        this.salon = salon;
    }

    public void run() {
        while (true) {
            try {
                if (salon.getWaitingClientsQueue().size() == 0) {
                    System.out.println(getTimePoint() + ANSI_YELLOW
                            + " There are no clients in a waiting room. " + capitalizeFirstLetter(toString())
                            + " fell asleep." + ANSI_RESET);
                }
                cutHair(salon.getWaitingClientsQueue().take());
                sleep(20); // barber's chair needs cleaning after client (some blood, ha-ha)
                salon.getBarberRoomDoor().release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void cutHair(Client client) throws InterruptedException {
        System.out.println(getTimePoint() + " "
                + capitalizeFirstLetter(toString()) + " is cutting hair of " + client);
        sleep(ThreadLocalRandom.current().nextInt(HAIRCUT_MIN_DURATION, HAIRCUT_MAX_DURATION + 1));
        salon.getBarbersChairCreepyBelt().release(); // Barber lets happy client to go away
    }

    @Override
    public String toString() {
        return "barber " + name;
    }
}