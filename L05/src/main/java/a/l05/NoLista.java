/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l05;

import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class NoLista<T> {
    private T info;
    private NoLista<T> proximo;
    
    ArrayList<Integer> p = new ArrayList();

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoLista<T> a) {
        this.proximo = a;
    }
}
