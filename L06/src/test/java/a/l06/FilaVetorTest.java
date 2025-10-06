/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class FilaVetorTest {
    
    public FilaVetorTest() {
    }

    @Test
    public void q2Teste1() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        
        assertEquals(true,fila.estaVazia());
    }
    
    
    @Test
    public void q2Teste2() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        fila.inserir(10);
        
        assertEquals(false,fila.estaVazia());
    }
    
    @Test
    public void q2Teste3() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.retirar());
        assertEquals(20, fila.retirar());
        assertEquals(30, fila.retirar());
        assertEquals(true, fila.estaVazia());
    }
    
    @Test
    public void q2Teste4() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(3);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        try {
            fila.inserir(40);
            fail("");
        } catch (FilaCheiaException e) {
            assertTrue(true);
        }
        
    }
    
    @Test
    public void q2Teste5() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        
        try {
            fila.retirar();
            fail("");
        } catch (FilaVaziaException e) {
            assertTrue(true);
        }
    }
    
    @Test
    public void q2Teste6() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.peek());
        assertEquals(10, fila.retirar());
    }
    
    @Test
    public void q2Teste7() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        fila.liberar();
        
        assertEquals(true, fila.estaVazia());
    }
    
    @Test
    public void q2Teste8() {
        FilaVetor<Integer> fila = new FilaVetor<Integer>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        FilaVetor<Integer> fila2 = new FilaVetor<Integer>(3);
        fila2.inserir(40);
        fila2.inserir(50);
        
        FilaVetor<Integer> fila3 = fila.criarFilaConcatenada(fila2);
        
        assertEquals("10,20,30,40,50", fila3.toString());
    }
    
    @Test
    public void q4Teste1() {
        FilaLista<Integer> fila = new FilaLista<Integer>();
        assertEquals(true, fila.estaVazia());
    }
    
    @Test
    public void q4Teste2() {
        FilaLista<Integer> fila = new FilaLista<Integer>();
        fila.inserir(10);
        assertEquals(false, fila.estaVazia());
    }
    
    @Test
    public void q4Teste3() {
        FilaLista<Integer> fila = new FilaLista<Integer>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10,fila.retirar());
        assertEquals(20,fila.retirar());
        assertEquals(30,fila.retirar());
        assertEquals(true, fila.estaVazia());
    }
    
    @Test
    public void q4Teste4() {
        FilaLista<Integer> fila = new FilaLista<Integer>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10,fila.peek());
        assertEquals(10,fila.retirar());
    }
    
    @Test
    public void q4Teste5() {
        FilaLista<Integer> fila = new FilaLista<Integer>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        fila.liberar();
        
        assertEquals(true,fila.estaVazia());
    }
}
