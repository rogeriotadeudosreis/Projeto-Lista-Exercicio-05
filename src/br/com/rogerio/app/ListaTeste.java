/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.app;

import br.com.rogerio.model.Lista;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class ListaTeste {

    public static void main(String[] args) {
        Lista lista = new Lista(10);
        try {
            for (int i = 0; i < 10; i++) {
                lista.inserePosicao(i, 10 - i);
            }

        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        lista.mostrarLista();
        System.out.println("Elemento do fim > " + lista.getFim());
        System.out.println("Elemento do início > " + lista.getInicio());
        System.out.println("Posição: " + lista.getPosicao(9));
        lista.removeElemento(8);
        System.out.println("Após remoção: ");
        lista.mostrarLista();
        System.out.println("Tamanho: " + lista.size());
        


    }

}
