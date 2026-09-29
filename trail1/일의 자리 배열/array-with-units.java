import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int add = 0;
        int num = 0;
        for(int i = 0; i<2; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 2; i < 10; i++){
            add = arr[i-1] + arr[i-2];
            num = add%10;
            arr[i] = num;
        }
        for(int i = 0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}