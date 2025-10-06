/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l05;

/**
 *
 * @author zobol
 */
public class PilhaLista<T> implements Pilha<T>{
    ListaEncadeada<T> lista;
    
    public PilhaLista() {
        lista = new ListaEncadeada<T>();
    }

    @Override
    public void push(T objeto) {
        lista.inserir(objeto);
    }

    @Override
    public T pop() {
        T retorno = this.peek();
        lista.retirar(retorno);
        
        return retorno;
    }

    @Override
    public T peek() {
        if (this.estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia!");
        }
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        lista.getPrimeiro().setProximo(null);
        lista.setPrimeiro(null);
    }
}
