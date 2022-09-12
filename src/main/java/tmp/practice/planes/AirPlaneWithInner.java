package tmp.practice.planes;

/**
 * @author Yurii Malikov
 */
public class AirPlaneWithInner {

    private class AirPlaneEngine implements IEngine {

        private class Engine {

            private boolean isActive;

            public boolean isActive() {
                return isActive;
            }

            public void setActive(boolean active) {
                isActive = active;
            }
        }

        private Engine engine;

        public AirPlaneEngine() {
            engine = new Engine();
        }

        @Override
        public String start() {
            if (engine.isActive()) {
                return model + " engine is already active";
            }
            engine.setActive(true);
            return model + " engine is activated";
        }

        @Override
        public String stop() {
            if (!engine.isActive()) {
                return model + " engine is already not active";
            }
            engine.setActive(false);
            return model + " engine has been successfully stopped";
        }
    }

    private String model;

    private AirPlaneEngine airPlaneEngine;

    public AirPlaneWithInner(String model) {
        airPlaneEngine = new AirPlaneEngine();
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

}
