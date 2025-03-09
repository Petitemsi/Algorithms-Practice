import java.util.LinkedList;
import java.util.Stack;

public class RecursiveLab{

    public static void main(String[] args) {
        

        // power method
        // 2^0 = 1
        // 3^2 = 9
        // 2^10 = 1024

        

        //recursively
        System.out.println("Recursive Solutions:");
        testPower(2, 0);
        testPower(3, 2);
        testPower(2, 10);
        System.out.println("******************************");

        //iteratively
        System.out.println("Iterative Solutions:");
        testPowerI(2, 0);
        testPowerI(3, 2);
        testPowerI(2, 10);
        System.out.println("******************************");
        

        System.out.println("racecar is palidrome:" + isPalindrome("racecar"));
        System.out.println("raceca is palidrome:" + isPalindrome("raceca"));


        LinkeListAlt ll = new LinkeListAlt();
        ll.add(new Node(1)); 
        ll.add(new Node(2)); 
        ll.add(new Node(3)); 
        ll.add(new Node(4));
        
        printLinkedList(ll);

        System.out.println("bracket match: (()())()(()()())" + isBrackets(new Stack<Character>(), "(()())()(()()())"));
        System.out.println("bracket match: (()(()()" + isBrackets(new Stack<Character>(), "(()(()()"));

    }


    public static boolean isBrackets(Stack<Character> brackets, String data){
        if(data.length()==0 ){
            if(brackets.isEmpty()) return true;
            else return false;
        }
        else if(data.charAt(0) == ')' && brackets.pop()!='('){
            return false;
        }
        else if(data.charAt(0)== '('){
            brackets.push('(');
        }

        return isBrackets(brackets, data.substring(1));
    }


    public static boolean isPalindrome(String s){
        
        if(s.length()==0 || s.length() == 1){
            return true;
        }
        else if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        else{
            return isPalindrome(s.substring(1, s.length()-1));
        }
    }


    public static void printNode(Node current){
        System.out.println(current.data);

        if(current.neighbour == null){ // we reached the end of the list
            return;
        }
        else{ // otherwise keep printing
            printNode(current.neighbour);
        }
    }

    public static void printLinkedList(LinkeListAlt ll){
        printNode(ll.getFirst());
    }

    public static void testPower(int x, int y){
        int powerXY = powerR(x, y);
        System.out.println(x + "^" + y + "=" + powerXY);

    }

    public static void testPowerI(int x, int y){
        int powerXY = powerI(x, y);
        System.out.println(x + "^" + y + "=" + powerXY);

    }

    // calculates x^y 

    // x^y = x * x^(y-1)
    // x^y = x * x * x^(y-2) ... 
    public static int powerR(int x, int y){
        // base case
        if(y==0){
            return 1;
        }
        // recursive call
        else{
            return x * powerR(x, y-1);
        }
    }

    public static int powerI(int x, int y){
        // work from the bottom up
        // assume x^0 starting off
        int result = 1; 
        while(y > 0){
            result = result * x;
            y--;
        }
        return result;
    }


}