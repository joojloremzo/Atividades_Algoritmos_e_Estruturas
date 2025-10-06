/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ListaDuplaTest {
    
    public ListaDuplaTest() {
    }

    @Test
    public void inserirTest() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals("20,15,10,5", lista.toString());
    }
    
    @Test
    public void buscarTest() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20, lista.buscar(20).getInfo());
    }
    
    @Test
    public void buscarTest2() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(10, lista.buscar(10).getInfo());
    }
    
    @Test
    public void retirarTest() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(20);
        
        assertEquals("15,10,5", lista.toString());
    }
    
    @Test
    public void retirarTest2() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(10);
        
        assertEquals("20,15,5", lista.toString());
    }
    
    @Test
    public void retirarTest3() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(5);
        
        assertEquals("20,15,10", lista.toString());
    }
    
    @Test
    public void liberarTest() {
        ListaDupla<Integer> lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.liberar();
        
        try {
            lista.buscar(10).getInfo();
            fail("");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
}
