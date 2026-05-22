package padroesestruturais.flyweight;

public class Livro {

    private String titulo;
    private Editora editora;

    public Livro(String titulo, Editora editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String obterLivro() {
        return "Livro{" +
                "titulo='" + this.titulo + '\'' +
                ", editora='" + editora.getNome() + '\'' +
                ", pais='" + editora.getPais() + '\'' +
                '}';
    }
}
