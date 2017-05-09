package lesson10.practice.planes;

/**
 * @author Yurii Malikov
 */
public class AirPlaneWithNested {

    private static class AirPlaneEngine implements IEngine {

        private static class Engine {

            private boolean isActive;

            public boolean isActive() {
                return isActive;
            }

            public void setActive(boolean active) {
                isActive = active;
            }

            private static String getEngineName() {
                return "Engine" + " of " + getWordPlane();
            }
        }

        AirPlaneWithNested airPlaneWithNested;

        private Engine engine;

        public AirPlaneEngine(AirPlaneWithNested airPlaneWithNested) {
            engine = new Engine();
            this.airPlaneWithNested = airPlaneWithNested;
        }

        @Override
        public String start() {
            if (engine.isActive()) {
                return airPlaneWithNested.model + " engine is already active";
            }
            engine.setActive(true);
            return airPlaneWithNested.model + "Engine is activated";
        }

        @Override
        public String stop() {
            if (!engine.isActive()) {
                return getFancyPlaneName() + " engine is already not active";
            }
            engine.setActive(false);
            return getFancyPlaneName() + " engine has been successfully stopped";
        }

        private String getFancyPlaneName() {
            return airPlaneWithNested.model + " aka \"" + " " + getTransportName() + "\"";
        }

        private static String getAirplaneEngineName() {
            return "Airplane engine";
        }
    }

    private AirPlaneEngine airPlaneEngine;

    private String model;

    public AirPlaneWithNested(String model) {
        airPlaneEngine = new AirPlaneEngine(this);
        this.model = model;
    }

    public String activateAllSystems() {
        StringBuilder result = new StringBuilder();
      /*
        Some code activating other systems.
        For instance, result.append(airPlaneConditioning.stop()
      */
        return result.append(airPlaneEngine.start()).toString();
    }

    public String deactivateAllSystems() {
        StringBuilder result = new StringBuilder();
      /*
        Some code deactivating other systems.
        For instance, result.append(airPlaneConditioning.start()
      */
        return result.append(airPlaneEngine.stop()).toString();
    }

    public static String getTransportName() {
        return "Airplane<" + AirPlaneEngine.getAirplaneEngineName() + '<' + AirPlaneEngine.Engine.getEngineName() + ">>";
    }

    private static String getWordPlane() {
        return "Plane";
    }

}
