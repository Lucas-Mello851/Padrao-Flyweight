package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String nomeEditora, String pais) {
        Editora editora = EditoraFactory.getEditora(nomeEditora, pais);
        Livro livro = new Livro(titulo, editora);
        livros.add(livro);
    }

    public List<String> obterLivros() {
        List<String> saida = new ArrayList<>();
        for (Livro livro : this.livros) {
            saida.add(livro.obterLivro());
        }
        return saida;
    }
}
