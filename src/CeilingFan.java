
import java.time.LocalDate;
public class CeilingFan 
{
	
	private int speed;
    private boolean isReversed;
    private LocalDate currentDate;

    public CeilingFan() 
    {
        this.speed = 0;
        this.isReversed = false;
        this.currentDate = LocalDate.now();
    }

    public void increaseSpeed() {
        if (this.currentDate.equals(LocalDate.of(2023, 12, 25))) {
            System.out.println("Ceiling fan is off on December 25th.");
            return;
        }

        if (this.speed < 3) {
            this.speed++;
        } else {
            this.speed = 0;
        }
    }
    public void reverseDirection() {
        if (this.currentDate.equals(LocalDate.of(2023, 12, 25))) {
            System.out.println("Ceiling fan is off on December 25th.");
            return;
        }

        this.isReversed = !this.isReversed;
    }

    public void printStatus() {
        System.out.print("Ceiling fan is currently ");
        if (this.speed == 0) {
            System.out.println("off.");
        } else {
            System.out.print("running at speed " + this.speed);
            if (this.isReversed) {
                System.out.println(" in reverse.");
            } else {
                System.out.println(" in forward direction.");
            }
        }
    }

    public static void main(String[] args) {
        // create a new instance of CeilingFan
        CeilingFan fan = new CeilingFan();

        // increase the speed
        fan.increaseSpeed();
        fan.printStatus(); 

        // reverse the direction
        fan.reverseDirection();
        fan.printStatus();
    }

}
