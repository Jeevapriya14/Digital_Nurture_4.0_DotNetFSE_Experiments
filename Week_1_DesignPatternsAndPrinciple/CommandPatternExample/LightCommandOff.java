public class LightCommandOff implements Command {
    private Light light;

    public LightCommandOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
