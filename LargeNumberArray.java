import java.util.Random;
import javax.swing.*;

public class LargeNumberArray {
    public static void main(String[] args) {
        
        // int [] data = {2,5,7,3,4,9,22,11,15,14};
        // singelArrayTest(data, 22);

        // int arraySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter how large you want the array to be"));
        // int [] data2 = new int[arraySize];
        // for(int i=0; i<data2.length; i++){
        //     data2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number " + (i+1)));
        // }
        // int expectedOutput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the expected output"));

        // singelArrayTest(data2, expectedOutput);

        randomArrayTest();

    }


    public static void randomArrayTest(){
        Random random = new Random();
        //generates random numbers between 10 and 100000
        int [] numbers = new int[8000];
        for(int i=0; i < numbers.length; i++){
        
            numbers[i] = random.nextInt(100000);

        }

        JOptionPane.showMessageDialog(null, getLargest(numbers));

    }


    public static void singelArrayTest( int [] data, int expectedOutput){
        long startTime;
        long endTime;
        long elapsedTime;

        
        // TODO: change later to accept user intput

        //startTime = System.nanoTime(); // Gets the time before the method is called
        int largest = getLargest(data);   // call the method we are testing
        //endTime = System.nanoTime();   // Gets the time after the method is called

        //elapsedTime = endTime - startTime; // tells us the total time the method takes to run

        //JOptionPane.showMessageDialog(null, largest + " is the largest number");
        //JOptionPane.showMessageDialog(null, "Elapsed time: " + elapsedTime + " nanoseconds");


        if(largest == expectedOutput){
            JOptionPane.showMessageDialog(null, "Test passed");
        }
        else{
            JOptionPane.showMessageDialog(null, "Test failed");
        }
    }

    public static int getLargest(int [] data){
    
        int largest = data[0];
        for(int i=0; i<data.length; i++){
            if(data[i] > largest){
                largest = data[i];
            }
        }

        return largest;

    }

    
}
