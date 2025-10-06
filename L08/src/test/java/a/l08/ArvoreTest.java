/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ArvoreTest {
    
    public ArvoreTest() {
    }

    @Test
    public void q2Teste1() {
        NoArvore<Integer> no5 = new NoArvore<Integer>(5);
        NoArvore<Integer> no6 = new NoArvore<Integer>(6);
        NoArvore<Integer> no7 = new NoArvore<Integer>(7);
        
        NoArvore<Integer> no2 = new NoArvore<Integer>(2);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);
        
        NoArvore<Integer> no8 = new NoArvore<Integer>(8);
        
        NoArvore<Integer> no3 = new NoArvore<Integer>(3);
        no3.inserirFilho(no8);
        
        NoArvore<Integer> no9 = new NoArvore<Integer>(9);
        NoArvore<Integer> no10 = new NoArvore<Integer>(10);
        
        NoArvore<Integer> no4 = new NoArvore<Integer>(4);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);
        
        NoArvore<Integer> no1 = new NoArvore<Integer>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);
        
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.setRaiz(no1);
        
        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());
    }
    
    @Test
    public void q2Teste2() {
        NoArvore<Integer> no5 = new NoArvore<Integer>(5);
        NoArvore<Integer> no6 = new NoArvore<Integer>(6);
        NoArvore<Integer> no7 = new NoArvore<Integer>(7);
        
        NoArvore<Integer> no2 = new NoArvore<Integer>(2);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);
        
        NoArvore<Integer> no8 = new NoArvore<Integer>(8);
        
        NoArvore<Integer> no3 = new NoArvore<Integer>(3);
        no3.inserirFilho(no8);
        
        NoArvore<Integer> no9 = new NoArvore<Integer>(9);
        NoArvore<Integer> no10 = new NoArvore<Integer>(10);
        
        NoArvore<Integer> no4 = new NoArvore<Integer>(4);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);
        
        NoArvore<Integer> no1 = new NoArvore<Integer>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);
        
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(7));
    }
    
    @Test
    public void q2Teste3() {
        NoArvore<Integer> no5 = new NoArvore<Integer>(5);
        NoArvore<Integer> no6 = new NoArvore<Integer>(6);
        NoArvore<Integer> no7 = new NoArvore<Integer>(7);
        
        NoArvore<Integer> no2 = new NoArvore<Integer>(2);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);
        
        NoArvore<Integer> no8 = new NoArvore<Integer>(8);
        
        NoArvore<Integer> no3 = new NoArvore<Integer>(3);
        no3.inserirFilho(no8);
        
        NoArvore<Integer> no9 = new NoArvore<Integer>(9);
        NoArvore<Integer> no10 = new NoArvore<Integer>(10);
        
        NoArvore<Integer> no4 = new NoArvore<Integer>(4);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);
        
        NoArvore<Integer> no1 = new NoArvore<Integer>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);
        
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.setRaiz(no1);
        
        assertEquals(false, arvore.pertence(55));
    }
    
    @Test
    public void q2Teste4() {
        NoArvore<Integer> no5 = new NoArvore<Integer>(5);
        NoArvore<Integer> no6 = new NoArvore<Integer>(6);
        NoArvore<Integer> no7 = new NoArvore<Integer>(7);
        
        NoArvore<Integer> no2 = new NoArvore<Integer>(2);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);
        
        NoArvore<Integer> no8 = new NoArvore<Integer>(8);
        
        NoArvore<Integer> no3 = new NoArvore<Integer>(3);
        no3.inserirFilho(no8);
        
        NoArvore<Integer> no9 = new NoArvore<Integer>(9);
        NoArvore<Integer> no10 = new NoArvore<Integer>(10);
        
        NoArvore<Integer> no4 = new NoArvore<Integer>(4);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);
        
        NoArvore<Integer> no1 = new NoArvore<Integer>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);
        
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.setRaiz(no1);
        
        assertEquals(10, arvore.contarNos());
    }
}
