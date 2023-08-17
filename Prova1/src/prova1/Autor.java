
package prova1;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marcio Luis
 */
public class Autor {
    String nome;
    
    public Autor(String nome){
        this.nome=nome;
    }
    @Override
    public String toString(){
        return nome;
    }
}
