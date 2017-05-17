package practicemultithreading;

import static java.lang.Thread.sleep;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static int CLIENTS_QUANTITY = 15;

    public static void main(String args[]) {
        HairdressingSalon hairdressingSalon = new HairdressingSalon("Happy bold head", 2);

        Thread hairdresserWorkingDay = new Thread(new Barber(hairdressingSalon));
        hairdresserWorkingDay.setDaemon(true);
        hairdresserWorkingDay.start();


        for (int i = 1; i < CLIENTS_QUANTITY; i++) {
            Client client = new Client(i);
            client.choosesToGetHaircutIn(hairdressingSalon);
            new Thread(client).start();

            try {
                // normal clients quantity in the morning, rare clients in the middle of a day, massive flow in the evening
                sleep(i < CLIENTS_QUANTITY/3 ? 10 : i < CLIENTS_QUANTITY*2/3 ? 3_00 : 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
