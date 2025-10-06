/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l06;

/**
 *
 * @author zobol
 */
public class FilaCheiaException extends RuntimeException{
    
    public FilaCheiaException(){
        super();
    }
    
    public FilaCheiaException(String mensagem){
        super(mensagem);
    }
    
    public FilaCheiaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
