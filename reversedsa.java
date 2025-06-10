
import java.util.*;

public class reversedsa {

    public static void reverse(int array[]) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter " + i + " element");
            array[i] = sc.nextInt();
        }
        reverse(array);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
