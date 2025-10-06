/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ListaEncadeadaTest {
    
    public ListaEncadeadaTest() {
    }

    @Test
    public void testListaVazia() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        
        assertEquals(true, lista.estaVazia());
    }
    
    @Test
    public void testNaoVazia() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        
        assertEquals(false, lista.estaVazia());
    }
    
    @Test
    public void test3() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        
        assertEquals(5,lista.getPrimeiro().getInfo());
        assertEquals(1,lista.obterComprimento());
    }
    
    @Test
    public void test4() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        
        assertEquals(15,10,5, lista.toString());
    }
    
    @Test
    public void testBuscar() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20,lista.buscar(20).getInfo());
    }
    
    @Test
    public void testBuscar2() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(15,lista.buscar(15).getInfo());
    }
    
    @Test
    public void testBuscar3() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(null,lista.buscar(50));
    }
    
    @Test
    public void testRetirar() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        
        assertEquals("15,10,5",lista.toString());
    }
    
    @Test
    public void testRetirar2() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(15);
        
        assertEquals("20,10,5",lista.toString());
    }
    
    @Test
    public void testObterNo() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20,lista.obterNo(0).getInfo());
    }
    
    @Test
    public void testObterNo2() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(5,lista.obterNo(3).getInfo());
    }
    
    @Test
    public void testObterNo3() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        try {
            lista.obterNo(-1);
            fail("");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
    
    @Test
    public void testObterComprimento() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        
        assertEquals(0,lista.obterComprimento());
    }
    
    @Test
    public void testObterComprimento2() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(15);
        lista.inserir(115);
        lista.inserir(1115);
        
        assertEquals(4,lista.obterComprimento());
    }
}
