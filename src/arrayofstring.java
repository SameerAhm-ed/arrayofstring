import java.util.Arrays;
import java.util.Scanner;

public class arrayofstring {

    void arrayofstringMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to enter: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i<n; i++) {
            System.out.println("Enter Element " + i + ":");
            arr[i] = sc.next();
        }

        for (int i = 0; i<arr.length-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
