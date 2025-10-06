/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l05;

/**
 *
 * @author zobol
 */
public class PilhaVaziaException extends RuntimeException {

    public PilhaVaziaException() {
        super();
    }
    
    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
    
    public PilhaVaziaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
    
}
