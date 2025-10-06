/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.prj_listaestatica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
    }

    @org.junit.jupiter.api.Test
    public void inserirTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals("5,10,15,20", list.toString());
    }
    
    @org.junit.jupiter.api.Test
    public void getTamanhoTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(4, list.getTamanho());
    }
    
    @org.junit.jupiter.api.Test
    public void buscarTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(2, list.buscar(15));
    }
    
    @org.junit.jupiter.api.Test
    public void buscarTest2() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(-1, list.buscar(30));
    }
    
    @org.junit.jupiter.api.Test
    public void retirarTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        list.retirar(10);
        
        assertEquals("5,15,20", list.toString());
        assertEquals(3, list.getTamanho());
    }
    
    @org.junit.jupiter.api.Test
    public void redimensionarTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(1);
        list.inserir(2);
        list.inserir(3);
        list.inserir(4);
        list.inserir(5);
        list.inserir(6);
        list.inserir(7);
        list.inserir(8);
        list.inserir(9);
        list.inserir(10);
        list.inserir(11);
        list.inserir(12);
        list.inserir(13);
        list.inserir(14);
        list.inserir(15);
        
        assertEquals(15, list.getTamanho());
    }
    
    @org.junit.jupiter.api.Test
    public void obterElementoTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(20, list.obterElemento(3));
    }
    
    @org.junit.jupiter.api.Test
    public void obterElementoTest2() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertThrows(NullPointerException.class , () -> list.obterElemento(5));
    }
    
    @org.junit.jupiter.api.Test
    public void estaVaziaTest() {
        ListaEstatica list = new ListaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        list.liberar();
        
        assertEquals(true, list.estaVazia());
    }
}
