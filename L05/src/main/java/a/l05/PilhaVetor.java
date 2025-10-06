/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l05;

/**
 *
 * @author zobol
 */
public class PilhaVetor<T> implements Pilha<T>{
    private T[] info;
    private int limite;
    private int tamanho;
    
    public PilhaVetor(int valorLimite) {
        info = (T[]) new Object[valorLimite];
        limite = valorLimite;
        tamanho = 0;
    }
    
    @Override
    public void push(T objeto) {
        if (tamanho == limite) {
            throw new PilhaCheiaException("A pilha está cheia!");
        }
        info[tamanho] = objeto;
        tamanho += 1;
    }

    @Override
    public T pop() {
        if (tamanho == 0) {
            throw new PilhaVaziaException("A pilha está vazia!");
        }
        T retorno = this.peek();
        info[tamanho-1] = null;
        tamanho -= 1;
        
        return retorno;
    }

    @Override
    public T peek() {
        if (tamanho == 0) {
            throw new PilhaVaziaException("A pilha está vazia!");
        }
        return info[tamanho-1];
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
    }
    
    @Override
    public String toString() {
        String retorno = "";
        
        for (int i = tamanho-1; i > 0; i--) {
            retorno += info[i] + ",";
        }
        retorno += info[0];
        
        return retorno;
    }
    
    public void concatenar(PilhaVetor<T> p2) {
        if ((this.tamanho + p2.tamanho) > this.limite) {
            throw new RuntimeException("O tamanho dos vetores somados ultrapassa o limite do vetor corrente!");
        }
        for (int i = 0; i < p2.tamanho; i++) {
            this.push(p2.info[i]);
        }
        
        this.tamanho += p2.tamanho;
    }
}
