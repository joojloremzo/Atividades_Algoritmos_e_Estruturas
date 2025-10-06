/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.l06;

/**
 *
 * @author zobol
 */
public interface Fila<T> {
    
    public void inserir(T dado);
    
    public boolean estaVazia();
    
    public T peek();
    
    public T retirar();
    
    public void liberar();
}
