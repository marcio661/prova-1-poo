
package prova1;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marcio Luis
 */
public class LivroDAO {
    private List<Livro>livros = new ArrayList<>();
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void excluirLivro(Livro livro){
        livros.remove(livro);
    }
    public List<Livro>getLivros(){
        return livros;
    }
}
