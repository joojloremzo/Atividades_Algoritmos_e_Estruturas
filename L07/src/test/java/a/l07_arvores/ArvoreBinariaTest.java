/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package a.l07_arvores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ArvoreBinariaTest {
    
    public ArvoreBinariaTest() {
    }

    @Test
    public void q2Teste1() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        
        assertEquals(true, arvore.estaVazia());
    }
    
     @Test
    public void q2Teste2() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        arvore.setRaiz(no5);
        assertEquals(false, arvore.estaVazia());
    }
    
    @Test
    public void q2Teste3() {
    ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
    
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, null);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        arvore.setRaiz(no1);
    
        String esperado = "<1<2<><4<><>>><3<5<><>><6<><>>>>";
        assertEquals(esperado, arvore.toString());
    }
    
    @Test
    public void q2Teste4() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, no5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, null);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no3, no2);
        
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(1));
    }
    
    @Test
    public void q2Teste5() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, no5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, null);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no3, no2);
        
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(3));
    }
    
    @Test
    public void q2Teste6() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, no5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, null);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no3, no2);
        
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(6));
    }
    
    @Test
    public void q2Teste7() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, no5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, null);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no3, no2);
        
        arvore.setRaiz(no1);
        
        assertEquals(false, arvore.pertence(10));
    }
    
    @Test
    public void q2Teste8() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, null, null);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, null);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, no5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, null);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no3, no2);
        
        arvore.setRaiz(no1);
        
        assertEquals(6, arvore.contarNos());
    }
}
