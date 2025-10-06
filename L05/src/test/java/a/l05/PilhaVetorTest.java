/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class PilhaVetorTest {
    
    public PilhaVetorTest() {
    }

    @Test
    public void q2teste1() {
        Pilha p = new PilhaVetor<Integer>(10);
        
        assertEquals(true,p.estaVazia());
    }
    
    @Test
    public void q2teste2() {
        Pilha p = new PilhaVetor<Integer>(5);
        p.push(10);
        
        assertEquals(false,p.estaVazia());
    }
    
    @Test
    public void q2teste3() {
        Pilha p = new PilhaVetor<Integer>(10);
        p.push(10);
        p.push(20);
        p.push(30);
        
        assertEquals(30,p.pop());
        assertEquals(20,p.pop());
        assertEquals(10,p.pop());
        assertEquals(true,p.estaVazia());
    }
    
    @Test
    public void q2teste4() {
        Pilha p = new PilhaVetor<Integer>(3);
        p.push(10);
        p.push(20);
        p.push(30);
        
        try {
            p.push(40);
            fail("");
        } catch (PilhaCheiaException e) {
            assertTrue(true);
        }
    }
    
    @Test
    public void q2teste5() {
        Pilha p = new PilhaVetor<Integer>(3);
        
        try {
            p.pop();
            fail("");
        } catch (PilhaVaziaException e) {
            assertTrue(true);
        }
    }
    
    @Test
    public void q2teste6() {
        Pilha p = new PilhaVetor<Integer>(5);
        p.push(10);
        p.push(20);
        p.push(30);
        
        assertEquals(30,p.peek());
        assertEquals(30,p.pop());
    }
    
    @Test
    public void q2teste7() {
        Pilha p = new PilhaVetor<Integer>(5);
        p.push(10);
        p.push(20);
        p.push(30);
        p.liberar();
        
        assertEquals(true,p.estaVazia());
    }
    
    @Test
    public void q2teste8() {
        PilhaVetor<Integer> p = new PilhaVetor<Integer>(5);
        p.push(10);
        p.push(20);
        p.push(30);
        
        PilhaVetor<Integer> p2 = new PilhaVetor<Integer>(2);
        p2.push(40);
        p2.push(50);
        
        p.concatenar(p2);
        
        assertEquals("50,40,30,20,10",p.toString());
    }
    
    @Test
    public void q4teste1() {
        PilhaLista<Integer> p = new PilhaLista<Integer>();
        
        assertEquals(true,p.estaVazia());
    }
    
    @Test
    public void q4teste2() {
        PilhaLista<Integer> p = new PilhaLista<Integer>();
        p.push(10);
        
        assertEquals(false,p.estaVazia());
    }
    
    @Test
    public void q4teste3() {
        PilhaLista<Integer> p = new PilhaLista<Integer>();
        p.push(10);
        p.push(20);
        p.push(30);
        
        assertEquals(30,p.pop());
        assertEquals(20,p.pop());
        assertEquals(10,p.pop());
        assertEquals(true,p.estaVazia());
    }
    
    @Test
    public void q4teste4() {
        PilhaLista<Integer> p = new PilhaLista<Integer>();
        p.push(10);
        p.push(20);
        p.push(30);
        
        assertEquals(30,p.peek());
        assertEquals(30,p.pop());
    }
    
    @Test
    public void q4teste5() {
        PilhaLista<Integer> p = new PilhaLista<Integer>();
        p.push(10);
        p.push(20);
        p.push(30);
        
        p.liberar();
        
        assertEquals(true,p.estaVazia());
    }
}
