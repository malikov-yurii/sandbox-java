package barber;

import barber.util.StopWatch;

import static java.lang.Thread.sleep;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static int CLIENTS_QUANTITY = 8;

    public static int EVENING_DELAY_BETWEEN_CLIENTS = 150;

    public static int MORNING_DELAY_BETWEEN_CLIENTS = EVENING_DELAY_BETWEEN_CLIENTS * 10;

    public static void main(String args[]) {
        StopWatch.reset();

        HairdressingSalon salon = new HairdressingSalon("Hall Of Fear", 2);

        Barber barber = new Barber("Edward Scissorhands");
        barber.hiredIn(salon);

        Thread BarbersWorkingDay = new Thread(barber);
        BarbersWorkingDay.setDaemon(true);
        BarbersWorkingDay.start();

        for (int i = 1; i < CLIENTS_QUANTITY; i++) {
            try {
                // massive client flow in the in the evening , rare clients in the morning
                if (i < CLIENTS_QUANTITY / 2)
                sleep(i  <   CLIENTS_QUANTITY / 2 ? MORNING_DELAY_BETWEEN_CLIENTS : EVENING_DELAY_BETWEEN_CLIENTS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Client client = new Client(i);
            client.choosesToGetHaircutIn(salon);
            new Thread(client).start();
        }
    }

}
