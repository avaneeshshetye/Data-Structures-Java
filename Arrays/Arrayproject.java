import java.util.Scanner;

/**
 * Arrayproject
 */
public class Arrayproject {

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter number  of days: ");
            int numberOfdays = console.nextInt();
            double sum = 0;

            int temperature [] = new int[numberOfdays];


            for(int i=0;i<numberOfdays;i++){
                System.out.println("Enter temeperature of day " + i);
                temperature[i] = console.nextInt();
                sum+=temperature[i];
            }

            double  average = sum / numberOfdays;
            System.out.println();
            

            int above = 0;
             
            for(int i=0;i<temperature.length;i++){
                if(temperature[i]>average){
                    above ++;
                }
            }
      
            System.out.print("Average temperature is: " + average);
            System.out.println();
            if(above == 1){
                System.out.println(above +" Day with temperature above ");
            }
            else{
                System.out.println(above + "Days with temperature above");
            
            }
        }
        





        

    }
}