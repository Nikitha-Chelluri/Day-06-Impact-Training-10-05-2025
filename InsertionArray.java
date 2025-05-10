import java.util.*;
class InsertionArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size Array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter at which index: ");
        int position = s.nextInt();
        System.out.println("Enter Value to insert: ");
        int value = s.nextInt();
        System.out.println("Elements Before: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            if (i == position - 1) {
                System.out.println(value);
            }
            System.out.print(arr[i]+"\t");
        }
    }
}