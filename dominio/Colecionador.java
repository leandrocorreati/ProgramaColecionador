package br.com.programacolecionador.dominio;

import java.util.ArrayList;
import java.util.List;

public class Colecionador
{
    private String nome;
    private List<Item> colecao; // A classe List permite armazenar uma lista de objetos,  que é definido entre os sinais de maior e menor <>. Nesse caso essa lista armazena informações do tipo  Item

    public Colecionador(String nome)
    {
        this.nome = nome;
        this.colecao = new ArrayList<Item>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getColecao() {
        return colecao;
    }

    public void setColecao(List<Item> colecao) {
        this.colecao = colecao;
    }
}
