/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l03;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        System.out.println(lista.obterNo(0).getInfo());
    }
}
