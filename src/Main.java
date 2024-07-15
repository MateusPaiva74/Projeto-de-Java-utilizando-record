// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", 32);
        TabelaDePrecos tabelaDePrecos=new TabelaDePrecos(3.13, 9.99, 23.4);


        System.out.println("Nome: "+ pessoa.nome() + " e a idade: "+ pessoa.idade());
        System.out.println("O feijao custa "+tabelaDePrecos.feijao());
        System.out.println("O arroz custa "+tabelaDePrecos.arroz());
        System.out.println("O milho custa "+tabelaDePrecos.milho());
    }
}