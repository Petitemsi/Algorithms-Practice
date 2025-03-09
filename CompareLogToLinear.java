public class CompareLogToLinear {
    public static void main(String[] args) {
        
        int n = 100;

        // linear loop
        for(int i=1; i<n; i++){
            System.out.println(i);
        }


        // counter to see the indici of 2^counter = i
        int counter = 0;
        // log loop
        for(int i=1; i < n; i*=2){
            System.out.println(i);
            counter++;
        }


        // exponential
        for(int i=1; i<Math.pow(2, n); i++){
            System.out.println(i);
        }

    }
}
