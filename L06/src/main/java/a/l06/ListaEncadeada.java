/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l06;

/**
 *
 * @author zobol
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public void setUltimo(NoLista<T> ultimo) {
        this.ultimo = ultimo;
    }

    public NoLista<T> getUltimo() {
        return ultimo;
    }
    
    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }
    
    public void inserir(T valor) {
        NoLista<T> novo = new NoLista();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
        
        if (this.estaVazia()) {
            ultimo = novo;
        }
        
    }
    
    public void inserirNoFinal(T dado) {
        NoLista<T> novo = new NoLista<T>();
        novo.setInfo(dado);
        novo.setProximo(null);
        
        if (this.estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        }  
        else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
        
        this.ultimo = novo;
    }
    
    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        }
        
        return false;
    }
    
    public NoLista<T> buscar(T valor) {
        NoLista<T> p = primeiro;
        
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            
            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T valor) {
        NoLista anterior = null;
        NoLista p = primeiro;
        
        while((p != null) && (!p.getInfo().equals(valor))) {
            anterior = p;
            p = p.getProximo();
        }
        
        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            }
            else {
                anterior.setProximo(p.getProximo());
            }
        }
        
        if (p == ultimo) {
            ultimo = anterior;
        }
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }
    
    public int obterComprimento() {
        NoLista p = primeiro;
        int contagem = 0;
        
        while(p != null) {
            contagem += 1;
            p = p.getProximo();
        }
        
        return contagem;
    }
    
    public NoLista<T> obterNo(int index) {
        if ((index < 0) || (index >= obterComprimento())) {
            throw new IndexOutOfBoundsException();
        }
        NoLista<T> p = primeiro;
        for (int i = 0; i < index; i++) {
            p = p.getProximo();
        }
        return p;
    }
    
    @Override
    public String toString() {
        NoLista<T> p = primeiro;
        String retorno = String.valueOf(p.getInfo());
        p = p.getProximo();
        
        for (int i = 1; i < obterComprimento(); i++) {
            retorno += "," + p.getInfo();
            p = p.getProximo();
        }
        
        return retorno;
    }
}
