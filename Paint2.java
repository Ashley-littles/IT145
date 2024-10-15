import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;

     // Prompt user to input wall's height
        do {
           System.out.println("Enter wall height (feet): ");

           // No double present
           if(!scnr.hasNextDouble()) {
              scnr.next();
              continue;
           }

           wallHeight = scnr.nextDouble();
           if(!(wallHeight > 0))
              continue;

           break;
        } while(true);

        // Prompt user to input wall's width
        do {
           System.out.println("Enter wall width (feet): ");

           // No double present
           if(!scnr.hasNextDouble()) {
              scnr.next();
              continue;
           }

           wallWidth = scnr.nextDouble();
           if(!(wallWidth > 0))
              continue;

           break;
        } while(true);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Round the `gallonsPaintNeeded` up as the number of cans needed
        cansPaintNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansPaintNeeded + " can(s)");
     }
  }