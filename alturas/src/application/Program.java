package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas ?");
        int n = sc.nextInt();
        Pessoa[] person = new Pessoa[n];

        for (int i = 0; i<n; i++){
            sc.nextLine();
            System.out.println("Dados da "+ (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            person[i] = new Pessoa(name, age, height);
        }

        // Altura média
        double sum = 0.0;
        for (int i = 0; i<person.length; i++){
            sum = sum + person[i].getHeight();
        }

        double mediaAltura = sum / person.length;
        System.out.printf("A média de altura é %.2f%%n", mediaAltura);

        // Média de idade com 16 anos.
        int count = 0;

        for (int i = 0; i<person.length; i++){
            if (person[i].getAge() < 16) {
                count += 1;
            }
        }

        double percent = count * 100.0 / n;

        System.out.printf("Pessoa com menos de 16 anos: %.1f%n", percent);

        sc.close();
    }
}
