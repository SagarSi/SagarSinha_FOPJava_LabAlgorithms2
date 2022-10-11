import java.util.Scanner;

public class CurrencyPayment {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of currency denominations");
        int size = s.nextInt();
        int arr[] = new int[size];
        int counter = 0;

        System.out.println("enter the currency denominations value");
        for (int i = 0; i < size; i++)
            arr[i] = s.nextInt();

        System.out.println("enter the amount you want to pay");
        int targetNo = s.nextInt();

        for(int i=0; i<size; i++) {
            if(targetNo >= arr[i]) {
                counter = targetNo / arr[i];
                targetNo = targetNo % arr[i];
            }

        }
        System.out.println("Your payment approach in order to give min no of notes will be " + ":"+counter);
    }
}
