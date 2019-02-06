public class GreenCommand implements ICommand {
    private TrafficLight trafficLight;


    public GreenCommand(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    public void execute() {
        trafficLight.setLightOff();
    }
}
