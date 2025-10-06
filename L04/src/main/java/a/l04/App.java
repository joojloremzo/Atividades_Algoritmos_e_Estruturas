/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l04;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        System.out.println(lista.toString());
        lista.exibirOrdemInversa();
        
        
        lista.liberar();
        
        System.out.println(lista.buscar(5).getAnterior());
        
        
    }
}
