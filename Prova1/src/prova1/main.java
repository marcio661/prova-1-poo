
package prova1;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marcio Luis
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new CadastroLivrosGUI();
            }
        });
    }
    
}
