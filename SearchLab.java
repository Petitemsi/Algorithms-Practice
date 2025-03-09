import java.util.Arrays;

public class SearchLab {

    // Task 1: Linear Search (Integer Array)
    public static int linearSearch(int[] num, int searchKey) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    // Task 2: Binary Search (Integer Array)
    public static int binarySearch(int[] num, int searchKey) {
        Arrays.sort(num); // Ensure array is sorted
        int left = 0, right = num.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == searchKey) {
                return mid;
            } else if (num[mid] < searchKey) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Task 3: Linear Search (String Array)
    public static String linearSearch(String[] countries, String searchKey) {
        for (String country : countries) {
            if (country.equalsIgnoreCase(searchKey)) {
                return country;
            }
        }
        return "-1";
    }

    // Task 4: Merge Sort (String Array)
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareToIgnoreCase(rightArray[j]) <= 0) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Task 5: Binary Search (String Array)
    public static String binarySearch(String[] countries, String searchKey) {
        Arrays.sort(countries); // Ensure array is sorted
        int left = 0, right = countries.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = countries[mid].compareToIgnoreCase(searchKey);
            if (cmp == 0) {
                return countries[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Country not found";
    }

    public static void main(String[] args) {
        // Example Country Array
        String[] countries = {"Afghanistan", "Albania", "Costa Rica", "Denmark", "Egypt", "France"};

        // Linear Search Example
        System.out.println(linearSearch(countries, "Egypt"));

        // Sort Countries using Merge Sort
        mergeSort(countries, 0, countries.length - 1);
        System.out.println("Sorted Countries: " + Arrays.toString(countries));

        // Binary Search Example
        System.out.println(binarySearch(countries, "Denmark"));
    }
}
