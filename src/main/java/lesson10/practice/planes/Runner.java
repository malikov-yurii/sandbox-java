package lesson10.practice.planes;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {
        AirPlaneWithInner airPlaneWithInner = new AirPlaneWithInner("Boeing");
        AirPlaneWithNested airPlaneWithNested = new AirPlaneWithNested("SuperBoeing");
        AirPlaneWithAnonymous airPlaneWithAnonymous = new AirPlaneWithAnonymous("MegaBoeing");
        AirPlaneWithLocal airPlaneWithLocal = new AirPlaneWithLocal("HyperBoeing");

        System.out.println(
                "AirPlaneWithInner test:\n"
                        + airPlaneWithInner.activateAllSystems()
                        + "\n" + airPlaneWithInner.activateAllSystems()
                        + "\n" + airPlaneWithInner.deactivateAllSystems()

                        + "\n\nAirPlaneWithNested test:\n"
                        + airPlaneWithNested.activateAllSystems()
                        + "\n" + airPlaneWithNested.activateAllSystems()
                        + "\n" + airPlaneWithNested.deactivateAllSystems()

                        + "\n\nAirPlaneWithAnonimous test:\n"
                        + airPlaneWithAnonymous.activateAllSystems()
                        + "\n" + airPlaneWithAnonymous.activateAllSystems()
                        + "\n" + airPlaneWithAnonymous.deactivateAllSystems()

                        + "\n\nAirPlaneWithLocal test:\n"
                        + airPlaneWithLocal.activateAllSystems()
                        + "\n" + airPlaneWithLocal.activateAllSystems()
                        + "\n" + airPlaneWithLocal.deactivateAllSystems()
        );
    }
}
