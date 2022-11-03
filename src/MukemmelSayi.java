import java.util.LinkedList;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number,sum = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        number = inp.nextInt();

        for (int i = 1; i < number;i++) {
            if (number % i == 0) {
                list.add(i);
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("Mukemmel sayi");
        }
        else {
            System.out.println("Mukkeml sayi degildir");
        }
        //System.out.println(list);
    }
}
