package br.com.programacolecionador.principal;

import br.com.programacolecionador.dominio.Colecionador;
import br.com.programacolecionador.dominio.Item;

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Colecionador colecionador;
        Item item;
        String nomeDoColecionador, nomeDoItem;
        int ano;
        Scanner teclado = new Scanner (System.in);

        System.out.println("INFORME O NOME DO COLECIONADOR:");
        nomeDoColecionador = teclado.nextLine();

        colecionador = new Colecionador(nomeDoColecionador);

        while (true)
        {
            System.out.println("============================");
            System.out.println("INFORME O NOME DO ITEM");
            nomeDoItem = teclado.nextLine();

            if (nomeDoItem.isEmpty())
            {
                break;
            }

            System.out.println("INFORME O ANO E MQUE ESSE ITEM FOI FABRICADO: ");
            ano = Integer.parseInt(teclado.nextLine());

            item = new Item(nomeDoItem, ano);
            colecionador.getColecao().add(item);
        }
        System.out.println("A coleção de " + colecionador.getNome()+" é: " + colecionador.getColecao());

    }
}
