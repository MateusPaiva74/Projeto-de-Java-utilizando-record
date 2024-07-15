package br.com;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        try{
            numero = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        System.out.println("O numero digitado foi:"+ numero);
    }
}