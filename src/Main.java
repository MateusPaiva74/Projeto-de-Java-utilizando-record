import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TabelaDePrecos tabelaDePrecos = new TabelaDePrecos(9.90,4.0,2.32);
        String texto = "Escolha a opcao:" +"\n1 - arroz" +"\n2 - feijao" +"\n3 - milho"+"\n4 - Tabela completa de precos" +"\n5 - Sair" +"\n";


        int opcao = 0;
        boolean continuar = true;
        while (continuar) {
            System.out.println(texto);
            Scanner scanner = new Scanner(System.in);
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    System.out.println("Arroz :" +tabelaDePrecos.precoArroz());
                    break;
                case 2:
                    System.out.println("Feijao :"+tabelaDePrecos.precoFeijao());
                    break;
                case 3:
                    System.out.println("Milho :"+tabelaDePrecos.precoMilho());
                    break;
                case 4:
                    System.out.println("Tabela completa de precos :" +tabelaDePrecos);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    continuar = false;
                    System.out.println("Saiu");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}