import java.util.*;
class CompatableArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of arrays: ");
        int n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int count = 0;
        System.out.println("Enter the elements of array1: ");
        for(int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the elements of array2: ");
        for(int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if (arr1[i] >= arr2[i])
            count++;
        }
        if (count == n) {
            System.out.println("Compatable Array");  
        }
        else {
            System.out.println("Not Compatable Array");
        }
    }
}