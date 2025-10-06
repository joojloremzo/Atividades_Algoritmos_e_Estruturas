/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.l06;

/**
 *
 * @author zobol
 */
public class FilaVaziaException extends RuntimeException{
    
    public FilaVaziaException(){
        super();
    }
    
    public FilaVaziaException(String mensagem){
        super(mensagem);
    }
    
    public FilaVaziaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
