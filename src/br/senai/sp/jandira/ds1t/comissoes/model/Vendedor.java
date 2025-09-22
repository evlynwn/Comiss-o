package br.senai.sp.jandira.ds1t.comissoes.model;

import java.util.Scanner;

public class Vendedor {

    String nomeVendedor;
    double totalVedas;
    double percentualComissao;
    double valorComissao;

    public void ColetarDados(){
        Scanner leitor = new Scanner(System.in);

        // obtendo os dados dos vendedores
        System.out.println("** CALCULADORA DE COMISSOES**");
        System.out.println("--------------------------------");

        // Obtendo o nome do vendedor
        System.out.println("Nome do vendedor");
        nomeVendedor = leitor.nextLine();

        //Obtendo o total de vendas do vendedor
        System.out.println("Total de vendas do(a) " + nomeVendedor + ":");
        totalVedas = leitor.nextDouble();
        calcularComissao();
    }

    public void calcularComissao(){
        if(totalVedas < 20000){
           percentualComissao = 5;
        } else {
            percentualComissao = 10;
        }

        valorComissao = totalVedas * percentualComissao / 100;
        exibirDados();
    }

        public void exibirDados(){
        System.out.println("------------------");
        System.out.println("NOME DO VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: R$" + totalVedas );
        System.out.println("PERCENTUAL DE COMISSAO: " + percentualComissao);
        System.out.println("VALOR DA COMISSÃO: R$ " + valorComissao);
        }

}
