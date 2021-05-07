package programs;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class CalcProducts {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for (int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            Double price = sc.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("Avg: %.2f%n", avg);

        sc.close();

    }
}
