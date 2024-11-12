public class Car {
    private String model;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void avgSpeed(int speed){
        System.out.println("the average speed is :" + (speed/50));
    }

    public void calcDistance(){
        System.out.println("the distance is 80 km");
    }
}
