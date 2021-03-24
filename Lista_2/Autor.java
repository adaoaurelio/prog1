import java.util.Scanner;

class Autor{
    int id;
    String nome;

    Scanner sc = new Scanner(System.in);

    public void carregaDoTeclado(){
        id = sc.nextInt();
        String nome = sc.nextLine();

        System.out.println("Id: " + id + "Nome: " + nome);
    }
}