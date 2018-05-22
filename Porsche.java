# First-Java-project
random java classes

public class Porsche extends Car {
    Porsche() {
       setMaxSpeed(300);
    }
    public void increaseSpeed()
    {
        if(getSpeed()+10<=getMaxSpeed()) {
            setSpeed(10);
        }
        else {
            System.out.println("error : this Porsche can't go that fast");
        }
    }
}

