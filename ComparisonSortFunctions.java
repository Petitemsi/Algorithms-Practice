public class ComparisonSortFunctions{
    public static void main(String args[]){

        int [] data = {100, 5, 1000, 2, 10101, 9};
        
        long startTime = System.nanoTime();
        bubbleSort(data);
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        System.out.println("Bubblesort took " + elapsedTime + " many nanoseconds");

        for(int item : data){
            System.out.println(item);
        }

    }


    public static void bubbleSort(int [] data){

        for(int i=0; i < data.length; i++){
            for(int j = 1; j < data.length - i; j++){

                if(data[j-1] > data[j]){ // only swap when the item before is greater than the current item
                    swap(data, j-1, j);
                }
            }
        }
    }

    public static void swap(int[] data,int leftIndex,int rightIndex){
        int temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }

}