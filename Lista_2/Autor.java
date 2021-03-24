package Lista_2;

import java.util.Scanner;

public class Autor{
    int id;
    String nome;

    Scanner sc = new Scanner(System.in);

    public void carregaDoTeclado(){
        id = sc.nextInt();
        nome = sc.nextLine();

        System.out.println("Id: " + id + "Nome: " + nome);
    }
}