/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l05;

/**
 *
 * @author zobol
 */
public class PilhaCheiaException extends RuntimeException {

    public PilhaCheiaException(){
        super();
    }
    
    public PilhaCheiaException(String mensagem){
        super(mensagem);
    }
    
    public PilhaCheiaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
    
}
