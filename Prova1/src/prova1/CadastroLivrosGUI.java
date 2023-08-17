
package prova1;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcio Luis
 */


    public class CadastroLivrosGUI {
    private JFrame frame;
    private JComboBox<Autor> autorComboBox;
    private JTextField livroTextField;
    private JButton inserirButton;
    private JButton excluirButton;
    private DefaultListModel<Livro> livroListModel;
    private JList<Livro> livroList; // Remova esta linha

    private LivroDAO livroDAO;

    public CadastroLivrosGUI() {
        livroDAO = new LivroDAO();
        livroListModel = new DefaultListModel<>();
        livroList = new JList<>(livroListModel); // Mantenha esta linha

        frame = new JFrame("Cadastro de Livros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        autorComboBox = new JComboBox<>();
        autorComboBox.addItem(new Autor("Autor 1"));
        autorComboBox.addItem(new Autor("Autor 2"));

        livroTextField = new JTextField(20);

        inserirButton = new JButton("Inserir");
        inserirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String autorSelecionado = ((Autor) autorComboBox.getSelectedItem()).nome;
                String tituloLivro = livroTextField.getText();
                Livro livro = new Livro(tituloLivro, autorSelecionado);
                livroDAO.adicionarLivro(livro);
                livroListModel.addElement(livro);
            }
        });

        excluirButton = new JButton("Excluir");
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = livroList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Livro livroSelecionado = livroListModel.getElementAt(selectedIndex);
                    livroDAO.excluirLivro(livroSelecionado);
                    livroListModel.removeElementAt(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(frame, "Selecione um livro para excluir.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Autor:"));
        panel.add(autorComboBox);
        panel.add(new JLabel("Título do Livro:"));
        panel.add(livroTextField);
        panel.add(inserirButton);
        panel.add(excluirButton);

        frame.getContentPane().add(panel);
        frame.getContentPane().add(new JScrollPane(livroList), "South");

        frame.setVisible(true);
    }
    }



