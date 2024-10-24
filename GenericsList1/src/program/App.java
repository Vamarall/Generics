package program;
import java.util.Scanner;

import service.PrintService;

public class App {

    public static void main(String[] args) {

        /*
         * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
         * inteiros. Ao final, imprima esses números de forma organizada conforme
         * exemplo. Em seguida, informar qual foi o primeiro valor informado
         */

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.println("Valores: ");
        int valores = sc.nextInt();

        for (int i = 0; i < valores; i++) {
            int proximoValor = sc.nextInt();
            ps.addValue(proximoValor);

        }

        ps.print();
		Integer x = ps.first();
		System.out.println("Primeiro: " + x);

        sc.close();
    }

}
