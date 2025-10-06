/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.l08;

/**
 *
 * @author zobol
 */
public class Arvore<T> {
    private NoArvore<T> raiz;
    
    public Arvore() {
        raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean pertence(T infoParam) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz,infoParam);
        }
    }
    
    private boolean pertence(NoArvore<T> no,T infoParam) {
        if (no.getInfo() == infoParam) {
            return true;
        } else {
            NoArvore<T> p;
            p = no.getPrimeiro();
            while (p != null) {
                if (pertence(p,infoParam)) {
                    return true;
                }
                p = p.getProximo();
            }
            return false;
        }
    }
    
    @Override
    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return this.obterRepresentacaoTextual(raiz);
        }
    }
    
    private String obterRepresentacaoTextual(NoArvore<T> no) {
        if (no == null) {
            return "";
        }
        
        String r = "";
        
        r += "<";
        r += no.getInfo();
        
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {            
            r += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        r += ">";
        
        return r;
    }
    
    public int contarNos() {
        if (raiz == null) {
            return 0;
        } else {
            return contarNos(raiz);
        }
    }
    
    private int contarNos(NoArvore<T> no) {
        NoArvore<T> p = no.getPrimeiro();
        int contagem = 0;
        contagem += 1;
        while (p != null) {            
            contagem += this.contarNos(p);
            p = p.getProximo();
        }
        return contagem;
    }
}
