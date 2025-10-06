/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ListaTest {
    
    public ListaTest() {
    }

    @Test
    public void inverterTest() {
        Lista<Integer> lista = new Lista();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.inverter();
        
        assertEquals("20,15,10,5", lista.toString());
    }
    
    @Test
    public void inverterTest2() {
        Lista<Integer> lista = new Lista();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);
        
        lista.inverter();
        
        assertEquals("25,20,15,10,5", lista.toString());
    }
    
}
