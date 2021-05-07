package programs;

import entities.Rent;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];
        System.out.println("Quantos quarto para alugar");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Mail: ");
            String mail = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, mail);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " +vect[i]);
            }
        }

    }
}
