package org.example;


import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    HashMap<String, String> mapa = new HashMap<>();
        mapa.put("UUU", "F"); mapa.put("UUC", "F");
        mapa.put("UUA", "L"); mapa.put("UUG", "L");
        mapa.put("CUU", "L"); mapa.put("CUC", "L");
        mapa.put("CUA", "L"); mapa.put("CUG", "L");
        mapa.put("AUU", "I"); mapa.put("AUC", "I");
        mapa.put("AUA", "I"); mapa.put("AUG", "M");
        mapa.put("GUU", "V"); mapa.put("GUC", "V");
        mapa.put("GUA", "V"); mapa.put("GUG", "V");

        mapa.put("UCU", "S"); mapa.put("UCC", "S");
        mapa.put("UCA", "S"); mapa.put("UCG", "S");
        mapa.put("CCU", "P"); mapa.put("CCC", "P");
        mapa.put("CCA", "P"); mapa.put("CCG", "P");
        mapa.put("ACU", "T"); mapa.put("ACC", "T");
        mapa.put("ACA", "T"); mapa.put("ACG", "T");
        mapa.put("GCU", "A"); mapa.put("GCC", "A");
        mapa.put("GCA", "A"); mapa.put("GCG", "A");

        mapa.put("UAU", "Y"); mapa.put("UAC", "Y");
        mapa.put("UAA", "*"); mapa.put("UAG", "*");
        mapa.put("UGA", "*");

        mapa.put("CAU", "H"); mapa.put("CAC", "H");
        mapa.put("CAA", "Q"); mapa.put("CAG", "Q");
        mapa.put("AAU", "N"); mapa.put("AAC", "N");
        mapa.put("AAA", "K"); mapa.put("AAG", "K");
        mapa.put("GAU", "D"); mapa.put("GAC", "D");
        mapa.put("GAA", "E"); mapa.put("GAG", "E");

        mapa.put("UGU", "C"); mapa.put("UGC", "C");
        mapa.put("UGG", "W");

        mapa.put("CGU", "R"); mapa.put("CGC", "R");
        mapa.put("CGA", "R"); mapa.put("CGG", "R");
        mapa.put("AGU", "S"); mapa.put("AGC", "S");
        mapa.put("AGA", "R"); mapa.put("AGG", "R");
        mapa.put("GGU", "G"); mapa.put("GGC", "G");
        mapa.put("GGA", "G"); mapa.put("GGG", "G");

        System.out.println("Digite o DNA que você deseja saber a proteina:   ");
        Scanner DNA = new Scanner (System.in);
        String dna =  DNA.nextLine();

        String RNA = dna.replace ("T","U");

        StringBuilder Proteina = new StringBuilder();

        for (int i = 0; i < RNA.length() - 2; i += 3) {
            String codon = RNA.substring(i, i + 3);
            String aminoacido = mapa.getOrDefault(codon, "?");
            Proteina.append(aminoacido);
        }

        System.out.println("RNA: " + RNA);
        System.out.println("Proteína: " + Proteina);






        /*System.out.println("Classe mais rodada");
        Scanner leitor = new Scanner (System.in);
        System.out.println("Qual o seu nome? ");
        String nome = leitor.nextLine();
        System.out.println(" O seu nome é " + nome);
        System.out.println("Qual a sua idade? ");
        int idade = 0;
        idade = Integer.parseInt(leitor.nextLine());
        System.out.println("Sua idade é " + idade);
        System.out.println("Quantos filhos voce tem? ");
        int Filhos = Integer.parseInt(leitor.nextLine());
        System.out.println("Você tem " + Filhos);

        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
*/


    }
}