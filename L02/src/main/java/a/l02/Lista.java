/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.l02;

/**
 *
 * @author zobol
 */
public class Lista<T> {
    private Object[] info;
    private int tamanho;

    public Lista() {
        info = new Object[10];
        setTamanho(0);
    }
    
    public void inserir(T valor) {
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
        Object[] novo = new Object[getTamanho() + 10];
        
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
    
    public int buscar(T valor) {
        for (int i = 0; i < getTamanho(); i++) {
            if (getInfo()[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    
    public void retirar(T valor) {
        int posicao = buscar(valor);
        
        for (int j = posicao; j < getTamanho(); j++) {
            getInfo()[j] = getInfo()[j+1];
        }
        setTamanho(getTamanho()-1);
    }
    
    public void liberar() {
        Object[] novo = new Object[10];
        setInfo(novo);
        setTamanho(0);
    }
    
    public T obterElemento(int posicao) {
        if (posicao >= getTamanho()) {
            throw new NullPointerException("Posição Inválida!");
        }
        return (T)getInfo()[posicao];
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
    
    public void inverter() {
        int cursor = getTamanho()-1;
        int aux = 0;
        
        for (int i = 0; i < getTamanho()/2; i++) {
            aux = (int)getInfo()[i];
            
            getInfo()[i] = getInfo()[cursor];
            getInfo()[cursor] = aux;
            cursor--;
        }
    }
    
    public void setInfo(Object[] novo) {
        this.info = novo;
    }

    public Object[] getInfo() {
        return info;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
