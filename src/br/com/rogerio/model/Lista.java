/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Lista {

    private final int MAXTAM;
    private int array[];
    private int ultimo;

    public Lista(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho deve ser maior que zero!\n");
        }
        MAXTAM = tamanho;
        array = new int[MAXTAM];
        ultimo = -1;
    }

    public boolean isEmpty() {
        return ultimo == -1;
    }

    public boolean isFull() {
        return ultimo + 1 == MAXTAM;
    }

    public int size() {
        return ultimo + 1;
    }

    public void insereInicio(int elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        for (int i = ultimo; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = elemento;
    }

    public void mostrarLista() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        System.out.println("*****  Elementos da Lista  *****");
        for (int i = 0; i <= ultimo; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("");
    }

    public void insereFim(int elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        array[ultimo] = elemento;
    }

    public void inserePosicao(int posicao, int elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        if (posicao > ultimo + 1 || posicao < 0) {
            throw new RuntimeException("Posição inválida!\n");
        }
        ultimo++;
        for (int i = ultimo; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
    }

    public void removeInicio() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        for (int i = 0; i < 10; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public void removeFim() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        ultimo--;
    }

    public void removePosicao(int posicao) {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Posição inválida!\n");
        }
        for (int i = posicao; i < ultimo; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    //retorna a posição do elemento, caso o elemento exista
    //retorna -1, caso contrário elemento não exista
    public int buscaElemento(int elemento) {
        for (int i = 0; i < ultimo; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    //retorna true, caso o elemento seja removido
    //ou retorna false, caso contrário, se o elemento não foi removido
    public boolean removeElemento(int elemento) {
        int pos = buscaElemento(elemento);
        if (pos == -1) {
            return false;
        }
        removePosicao(pos);
        return true;
    }

    public int getInicio() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        return array[0];
    }
    
    public int getFim(){
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        return array[ultimo];
    }
    
    public int getPosicao(int posicao){
         if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
         if (posicao > ultimo || posicao < 0) {
            throw new RuntimeException("Posição inválida!\n");
        }
         return array[posicao];
    }
    
    //tornando a lista vazia
    public void destroy(){
        ultimo = -1;
    }
}












