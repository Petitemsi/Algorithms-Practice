import javax.swing.*;

public class LargeNumberNano {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long elapsedTime;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter second number: "));

        startTime = System.nanoTime(); // Gets the time before the method is called
        int largest = getLargest(num1, num2);   // call the method we are testing
        endTime = System.nanoTime();   // Gets the time after the method is called

        elapsedTime = endTime - startTime; // tells us the total time the method takes to run

        JOptionPane.showMessageDialog(null, largest + " is the largest number");
        JOptionPane.showMessageDialog(null, "Elapsed time: " + elapsedTime + " nanoseconds");
    }

    public static int getLargest(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int getSmallest(int a, int b){
        if(a < b){
            return a;
        }
        else{
            return b;
        }
    }
}
