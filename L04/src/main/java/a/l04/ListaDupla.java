/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.l04;

/**
 *
 * @author zobol
 */
public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;
    
    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor) {
        NoListaDupla novo = new NoListaDupla();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    
    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            
            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
        if (p != null) {
            if (primeiro == p) {
                primeiro = p.getProximo();
            }
            else {
                p.getAnterior().setProximo(p.getProximo());
            }
            
            if (p.getProximo() != null) {
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }
    
    public void exibirOrdemInversa() {
        NoListaDupla<T> p = primeiro;
        
        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        
        while(p.getAnterior() != null) {
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
        System.out.println(p.getInfo());
    }
    
    public void liberar() {
        if (primeiro == null) {
            throw new NullPointerException();
        }
        while(primeiro.getProximo() != null) {
            primeiro = primeiro.getProximo();
            primeiro.getAnterior().setProximo(null);
            primeiro.setAnterior(null);
        }
        primeiro = null;
    }
    
    @Override
    public String toString() {
        NoListaDupla<T> p = primeiro;
        String retorno = String.valueOf(p.getInfo());
        p = p.getProximo();
        
        while (p.getProximo() != null) {
            retorno += "," + String.valueOf(p.getInfo());
            p = p.getProximo();
        }
        retorno += "," + String.valueOf(p.getInfo());
        
        return retorno;
    }
}
