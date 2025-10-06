/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l06;

/**
 *
 * @author zobol
 */
public class FilaVetor<T> implements Fila<T> {
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;
    
    public FilaVetor(int limiteValor) {
        info = (T[]) new Object[limiteValor];
        this.limite = limiteValor;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T dado) {
        if (limite == tamanho) {
            throw new FilaCheiaException("A fila está cheia!");
        }
        int posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = dado;
        tamanho += 1;
    }

    public boolean estaVazia() {
         if (tamanho == 0) {
            return true;
        }
         return false;
    }

    @Override
    public T peek() {
        if (tamanho == 0) {
            throw new FilaVaziaException("A fila está vazia!");
        }
        return (T) info[inicio];
    }

    @Override
    public T retirar() throws FilaVaziaException{
        T retorno = this.peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho -= 1;
        return retorno;
    }

    @Override
    public void liberar() {
        Object[] novo = (T[]) new Object[limite];
        info = novo;
        this.tamanho = 0;
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> fila2) {
        FilaVetor<T> filaConcatenada = new FilaVetor<T>(this.limite + fila2.limite);
        
        for (int i = 0; i < this.tamanho; i++) {
            int posicao = (this.inicio + i) % this.limite;
            filaConcatenada.inserir((T) this.info[posicao]);
        }
        for (int i = 0; i < fila2.tamanho; i++) {
            int posicao = (fila2.inicio + i) % fila2.limite;
            filaConcatenada.inserir((T) fila2.info[posicao]);
        }
        
        return filaConcatenada;
    }
    
    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i < this.tamanho; i++) {
            int posicao = (this.inicio + i) % this.limite;
            retorno += this.info[posicao];
            
            if (i < this.tamanho - 1) {
                retorno += ",";
            }
        }
        
        return retorno;
    }

    public int getLimite() {
        return limite;
    }
}
