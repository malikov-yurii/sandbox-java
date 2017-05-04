package lesson10.practice.planes;

/**
 * @author Yurii Malikov
 */
public class AirPlaneWithLocal {

    public IEngine getLocalEngine() {

        class AirPlaneEngine implements IEngine {

            class Engine {

                private boolean isActive;

                public boolean isActive() {
                    return isActive;
                }

                public void setActive(boolean active) {
                    isActive = active;
                }
            }

            private Engine engine;

            public AirPlaneEngine(AirPlaneWithLocal airPlaneWithLocal) {
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

        return new AirPlaneEngine(this);
    }

    private String model;

    private IEngine airPlaneEngine;

    public AirPlaneWithLocal(String model) {
        this.model = model;
        airPlaneEngine = getLocalEngine();
    }

    public String activateAllSystems() {
        StringBuilder result = new StringBuilder();
        /*
            Some code activating other systems.
            foreach result.append(airPlaneConditioning.stop()
        */
        return result.append(airPlaneEngine.start()).toString();
    }

    public String deactivateAllSystems() {
        StringBuilder result = new StringBuilder();
        /*
            Some code deactivating other systems.
            foreach result.append(airPlaneConditioning.start()
        */
        return result.append(airPlaneEngine.stop()).toString();
    }

}
