
package prova1;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marcio Luis
 */
public class Livro {
    String titulo;
    String  nomeAutor;
    public Livro(String titulo, String nomeAutor){
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
    }
    @Override
    public String toString(){
        return titulo + "(" + nomeAutor +")";
    }
}
