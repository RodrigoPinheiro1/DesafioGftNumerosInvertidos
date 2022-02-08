package Desafio;

import java.util.Scanner;
public class pegaNumero {


    private Scanner leitor = new Scanner(System.in);



    public void inverter(int num){

        int i = 0;

        while (num > 0) {
            i *=  10;
            i += (num % 10);
            num /= 10;
        }

        System.out.printf("O número invertido é: %d.\n", i);

    }


    public  void pegarNumero (){


        System.out.print("Digite a seguir o número a ser invertido: ");
        int num = leitor.nextInt();

        inverter(num);

    }


}
