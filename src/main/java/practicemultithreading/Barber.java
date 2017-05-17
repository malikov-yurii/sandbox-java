package practicemultithreading;

import static java.lang.Thread.sleep;
import static practicemultithreading.AnsiConstants.*;

/**
 * @author Yurii Malikov
 */
class Barber implements Runnable {

    private HairdressingSalon salon;

    public Barber(HairdressingSalon salon) {
        this.salon = salon;
    }

    public void run() {
        while (true) {
            try {
                if (salon.getWaitingClients().size() == 0) {
                    System.out.println(System.currentTimeMillis() % 10_000 + ANSI_WHITE  + " There are no clients in a waiting room. Barber falls asleep." + ANSI_RESET);
                }
                cutHair(salon.getWaitingClients().take());
                salon.getHairdresserRoom().release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void cutHair(Client client) throws InterruptedException {
        System.out.println(System.currentTimeMillis() % 10_000 + " The hairdresser is cutting hair of " + client);
        sleep(52); // extra 2 millis to get haircut seat clean
    }

}