# First-Java-project
random java classes

public class Car {
    private int horsePower;
    private int maxSpeed;
    private int speed;

    public Car(){
        horsePower = 1;
        maxSpeed = 100;
        speed = 0;
    }
    public Car(int horsePower, int maxSpeed, int speed)
    {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }
    public void increaseSpeed()
    {
        if(speed+10<=maxSpeed) {
            speed += 10;
        }
        else {
            System.out.println("error : this car can't go that fast");
        }
    }

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }
    public void setSpeed(int speed) { this.speed = speed; }
    public int getMaxSpeed() { return this.maxSpeed; }
    public int getHorsePower() { return horsePower; }
    public int getSpeed() { return speed; }



}
