public class RedCommand {
    private TrafficLight trafficLight;

    public RedCommand(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    public void execute() {
        trafficLight.setLightOff();
    }
}
