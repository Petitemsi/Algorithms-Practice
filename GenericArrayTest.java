import java.util.Iterator;

public class GenericArrayTest {
    public static void main(String[] args) {
        
        // GenericArray<Integer> arr = new GenericArray<Integer>();
        // for(int j=0; j < 20; j++){
        //     arr.add(j);
        // }
        // System.out.println(arr.length());
        // GenericArray<String> arr = new GenericArray<String>();
        // arr.add("Monday");
        // arr.add("Tuesday");
        // arr.add("Wednesday");
        // arr.add("Thursday");
        // arr.add("Friday");

        GenericArray<Staff> arr = new GenericArray<Staff>();
        
        arr.add(new Staff(1, 160, "William", 21));
        arr.add(new Staff(2, 180, "John", 30));
        arr.add(new Staff(3, 180, "Mathew", 18));
        arr.add(new Staff(4, 180, "Mark", 70));
        arr.add(new Staff(5, 180, "Luke", 41));

        Staff.setSortingChoice(4);

        arr.selectionSort();

        Iterator<Staff> iter = arr.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        
    }
}
