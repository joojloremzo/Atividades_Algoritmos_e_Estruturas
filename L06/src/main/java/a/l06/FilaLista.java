/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l06;

/**
 *
 * @author zobol
 */
public class FilaLista<T> implements Fila<T> {
    ListaEncadeada<T> lista = new ListaEncadeada<T>();

    @Override
    public void inserir(T dado) {
        lista.inserirNoFinal(dado);
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        if (lista.estaVazia()) {
            throw new FilaVaziaException("A fila está vazia");
        }
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() throws FilaVaziaException{
        if (lista.estaVazia()) {
            throw new FilaVaziaException("A fila está vazia!");
        }
        T retorno = lista.getPrimeiro().getInfo();
        lista.retirar(retorno);
        return retorno;
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<T>();
    }
    
}
