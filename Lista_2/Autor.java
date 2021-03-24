package Lista_2;

import java.util.Scanner;

public class Autor{
    int id;
    String nome;

    Scanner sc = new Scanner(System.in);

    public void carregaDoTeclado(){
        id = sc.nextInt();
        System.out.println("Id: " + this.id);
        
        nome = sc.nextLine();        
        System.out.println("Nome: " + this.nome);
    }
}