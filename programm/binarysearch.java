package programm;

public class binarysearch {

    public static int binarysearch(int number[], int key) {
        int start = 1, end = number.length;

        while (start <= end) {
            int mid =( start + end) / 2;  // Corrected mid calculation
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int binarysearcharr[] = {10, 20, 40, 60, 80, 120, 450, 500};
        int key = 450;

        int index = binarysearch(binarysearcharr, key);
        System.out.println("Binary search index: " + index);
    }
}
