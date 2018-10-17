package br.com.programacolecionador.dominio;

public class Item
{
    // Atributos

    private String nome;
    private int anoCriaçao; //fortemente tipado é uma linguagem que exige que o tipo das variaveis seja declarado


    // Construtor

    public Item(String nome, int anoCriaçao)
    {
        this.nome = nome;
        this.anoCriaçao = anoCriaçao; // This funciona como uma auto referencia ao atributo, nesse caso o atributo "anoCriacao"
    }


    // Metodos Acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriaçao() {
        return anoCriaçao;
    }

    public void setAnoCriaçao(int anoCriaçao) {
        this.anoCriaçao = anoCriaçao;
    }


    // To String

    @Override
    public String toString()
    {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", anoCriaçao=" + anoCriaçao +
                '}';
    }



}
