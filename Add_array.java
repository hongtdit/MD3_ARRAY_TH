import java.util.Arrays;
import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        int size;
        int arr1[];
        int arr2[];
        int newArr[];

        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài yêu cầu nhỏ hơn 20!");
        } while (size > 20);
        arr1 = new int[size];
        arr2 = new int[size - 1];
        newArr =new int[size + size -1];
        int i = 0;
        int c=0;
        while (i < (size*2 -1)) {
            if (i<size) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 1:");
                arr1[i] = sc.nextInt();
            } else {
                System.out.println("Nhập phần tử thứ " + (c + 1) + " của mảng 2:");
                arr2[c] = sc.nextInt();
                c++;
            }
            i++;
        }


        for (int j = 0; j < newArr.length; j++) {
            if (j > arr1.length-1 ) {
                newArr[j] = arr2[j- arr1.length];
            } else {
                newArr[j] = arr1[j];
            }
        }

        System.out.printf("%-20s%s", "Các phần tử trong mảng 1:", "");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }

        System.out.printf("%-20s%s", "Các phần tử trong mảng 2:", "");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }

        String str = Arrays.toString(newArr);
        System.out.println(str);
    }
}
