/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.l05;

/**
 *
 * @author zobol
 */
public interface Pilha<T> {
    
    public void push(T objeto);
    
    public T pop();
    
    public T peek();
    
    public boolean estaVazia();
    
    public void liberar();
    
}
