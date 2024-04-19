//Single Inheritance
package bhagwan;
import java.util.*;

public class terachehra extends terachehra1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Durii");
        System.out.println("phaile tum");
        int a= sc.nextInt();
        System.out.println("kya mai");
        int b= sc.nextInt();

        terachehra terachehra= new terachehra();
        terachehra.rishta(a,b);
        terachehra.judai(a,b);

    }
}
package bhagwan;

public class terachehra1 {

    public void rishta(int x, int y)
    {
       int z=x+y;
        System.out.println("HAA BOLA HAI BHAI PARTY:-"+z);
    }

    public void judai(int x, int y)
    {
        int p=x+y;
        System.out.println("NA BOLA HAI BHAI PARTY:-"+p);
    }
}

//Multilevel Inheritance

import java.util.*;
public class multilevel {

    public int gear;
    public int speed;

    public multilevel(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends multilevel {
    public int seatHeight;
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

class Test {
    public static void main(String args[])
    {

        MountainBike mb = new  MountainBike(3,25,100);
        System.out.println(mb.toString());
    }
}
