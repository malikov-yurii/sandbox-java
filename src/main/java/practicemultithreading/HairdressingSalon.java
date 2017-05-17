package practicemultithreading;

/**
 * @author Yurii Malikov
 */

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class HairdressingSalon implements Runnable {

    public static final int TOTAL_WAITING_ROOM_CAPACITY = 4;

    public static final int TOTAL_HAIRDRESSER_ROOM_CAPACITY = 1;

    public static final int HAIRCUT_DURATION_MILLIS = 500;

    public static int waitingRoomFreeSeatsQuantity = TOTAL_WAITING_ROOM_CAPACITY;

    public static Semaphore hairdresserRoom = new Semaphore(TOTAL_HAIRDRESSER_ROOM_CAPACITY);

    public static Semaphore waitingClients = new Semaphore(0); // no clients in the waiting room in the morning

    public static Semaphore waitingRoomDoor = new Semaphore(1);

    class Client implements Runnable {

        private int id;

        public Client(int i) {
            id = i;
        }

        public void run() {
            try {
                waitingRoomDoor.acquire();
                if (waitingRoomFreeSeatsQuantity > 0) {
                    waitingRoomFreeSeatsQuantity--;
                    waitingRoomDoor.release();
                    System.out.println("Client" + id + " has taken down a free seat in a waiting room.");
                    waitingClients.release();
                    hairdresserRoom.acquire();
                    waitingRoomFreeSeatsQuantity++;
                    getHaircut();
                    System.out.println("Client" + id + " has been cut and has left a hairdressing salon.");
                } else {
                    System.out.println("Client" + id + " has gone! There are no free seats in a waiting room!!");
                    waitingRoomDoor.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void getHaircut() {
            System.out.println("Client" + id + " is getting his hair cut.");
            try {
                sleep(HAIRCUT_DURATION_MILLIS);
            } catch (InterruptedException ex) {
            }
        }
    }

    class Hairdresser implements Runnable {

        public void run() {
            while (true) {
                try {
                    waitingClients.acquire();
                    cutHair();
                    hairdresserRoom.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void cutHair() throws InterruptedException {
            System.out.println("The hairdresser is cutting hair of client");
            sleep(HAIRCUT_DURATION_MILLIS);
        }
    }

    public static void main(String args[]) {
        new Thread(new HairdressingSalon()).start();
    }

    public void run() {
        Thread hairdresser = new Thread(new Hairdresser());
        hairdresser.setDaemon(true);
        hairdresser.start();

        for (int i = 1; i < 10; i++) {
            new Thread(new Client(i)).start();

            try {
                sleep(ThreadLocalRandom.current().nextInt(100, 301));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
