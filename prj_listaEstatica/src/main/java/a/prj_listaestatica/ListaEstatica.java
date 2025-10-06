/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.prj_listaestatica;

/**
 *
 * @author zobol
 */
public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        setTamanho(0);
    }
    
    public void inserir(int valor) {
        if (getTamanho() == info.length) {
            redimensionar();
            inserir(valor);
        }
        else {
            info[getTamanho()] = valor;
            tamanho += 1;
        }
    }
    
    private void redimensionar() {
        int[] novo = new int[getTamanho() + 10];
        
        for (int i = 0; i < getTamanho(); i++) {
            novo[i] = getInfo()[i];
        }
        setInfo(novo);
    }
    
    public void exibir() {
        for (int i = 0; i < getTamanho(); i++) {
            System.out.println("Valor do índice " + i + " :" + getInfo()[i]);
        }
    }
    
    public int buscar(int valor) {
        for (int i = 0; i < getTamanho(); i++) {
            if (getInfo()[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    
    public void retirar(int valor) {
        int posicao = buscar(valor);
        
        for (int j = posicao; j < getTamanho(); j++) {
            getInfo()[j] = getInfo()[j+1];
        }
        setTamanho(getTamanho()-1);
    }
    
    public void liberar() {
        int[] novo = new int[10];
        setInfo(novo);
        setTamanho(0);
    }
    
    public int obterElemento(int posicao) {
        if (posicao >= getTamanho()) {
            throw new NullPointerException("Posição Inválida!");
        }
        return getInfo()[posicao];
    }
    
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        String elemConcat = "";
        for (int i = 0; i < getTamanho()-1; i++) {
            elemConcat += getInfo()[i] + ",";
        }
        elemConcat += getInfo()[getTamanho()-1];
        return elemConcat;
    }
    
    public void setInfo(int[] novo) {
        this.info = novo;
    }

    public int[] getInfo() {
        return info;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
