/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l02;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista();
        
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        
        lista.inserir(50);
        lista.inserir(60);
        
        lista.inverter();
        
        lista.exibir();
    }
}
