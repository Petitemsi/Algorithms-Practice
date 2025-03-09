import javax.swing.JOptionPane;

public class LargeNumber {
    public static void main(String args[]){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null , "Enter second number: "));


        JOptionPane.showMessageDialog(null, getSmallest(num1, num2) + " is the smallest number");
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
