package br.edu.ifsc.Aula1;

import java.util.Date;

public class pessoa {
    String nome;
    Date dataNascimento;
    String genero;
    String cpf;
    //pessoa pai;
    //pessoa mae;
    pessoa [] responsaveis;
    pessoa conjuge;
    Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public pessoa[] getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(pessoa[] responsaveis) {
        this.responsaveis = responsaveis;
    }

    public pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(pessoa conjuge) {
        this.conjuge = conjuge;
    }



    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
