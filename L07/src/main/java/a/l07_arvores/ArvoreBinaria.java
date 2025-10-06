/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.l07_arvores;

/**
 *
 * @author zobol
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean estaVazia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }
    
    public boolean pertence(T info) {
        return pertence(raiz,info);
    }
    
    private boolean pertence(NoArvoreBinaria<T> raizParam, T infoParam) {
        if (raizParam == null) {
            return false;
        } else {
            return ((raizParam.getInfo() == infoParam) 
                    || (pertence(raizParam.getEsquerda(),infoParam) 
                    || pertence(raizParam.getDireita(),infoParam)));
        }
    }
    
    @Override
    public String toString() {
        return arvorePre(raiz);
    }
    
    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + 
               arvorePre(no.getEsquerda()) + 
               arvorePre(no.getDireita()) + 
               ">";
    }
    
    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }
}
