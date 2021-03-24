package Lista_3;

import java.util.Scanner;

public class Compra {
    String nomeProduto;
    float preço;
    int quantidade;

    Scanner sc = new Scanner(System.in);

    public Compra(String produto, float preço, int quantidade){
        nomeProduto = sc.nextLine();
        preço = sc.nextFloat();
        quantidade = sc.nextInt();

    }

    public void imprimeResumo(){
        System.out.println("Produto: " + nomeProduto + "Preço: " + preço + "Quantidade: " + quantidade);
        
    }

}
