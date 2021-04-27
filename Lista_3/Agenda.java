package Lista_3;

public class Agenda {
   public void armazenaPessoa(String nome, int idade, float altura);
   public void removePessoa(String nome);
   public int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
   public void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
   public void imprimePessoa(int index); // imprime os dados da pessoa que está na posição
   
   //“index” da agenda.

}
