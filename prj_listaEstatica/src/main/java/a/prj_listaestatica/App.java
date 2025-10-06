/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.prj_listaestatica;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(10);
        list.inserir(20);
        list.inserir(30);
        
        list.exibir();
        
        list.liberar();
        
        list.exibir();
    }
}
