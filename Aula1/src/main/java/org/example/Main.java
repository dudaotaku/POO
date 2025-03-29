package org.example;

import br.edu.ifsc.Aula1.Endereco;
import br.edu.ifsc.Aula1.pessoa;
public class Main {
    public static void main(String[] args) {

        pessoa p1 = new pessoa();
        pessoa p2 = new pessoa();
        Endereco end = new Endereco();
        end.setLogradouro("7 de Setembro");
        end.setNumero("900");
        p1.setNome("Renato");
        p1.setCpf("123456789");
        p1.setEndereco(end);
        p2.setNome("Maria");
        p2.setCpf("9999999999");
        p2.setEndereco(end);
        end.setNumero("100000000zzz");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(end);

    }
}