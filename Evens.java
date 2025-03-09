public class Evens {
    public static void main(String[] args) {
        
        // System.out.println(calcEvensIter(1234));
        // System.out.println(calcEvensGauss(1234));
        concatDigits(2);

    }

    public static int calcEvensGauss(int n){
        // if(n%2==0){
        //     return (n*(n+2)) / 4;
        // }
        // else{
        //     return ((n-1)*( (n-1) + 2))/ 4;
        // }
        return ((n-(n%2))*( (n-(n%2)) + 2))/ 4;
    }

    public static int calcEvensIter(int n){
        
        int sum = 0; // keeps track of the sum throughout
        for(int i=0; i<=n; i++){
            if(i%2==0)  sum += i; // adds all the even values from zero to n and stores it in sum
        }
        return sum;
    }

    public static void concatDigits(int n){

        for(int leftDigit=n; leftDigit>=0; leftDigit--){

            for(int rightDigit=n; rightDigit>=0; rightDigit--){
                System.out.print(leftDigit+""+rightDigit);
                if(rightDigit>0){
                    System.out.print(",");
                }
            }
            if(leftDigit>0){
                System.out.print(",");
            }
            
        }

    }
}
