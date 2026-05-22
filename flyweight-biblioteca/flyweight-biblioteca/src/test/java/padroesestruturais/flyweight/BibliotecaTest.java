package padroesestruturais.flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @BeforeEach
    void limparFactory() throws Exception {
        var field = EditoraFactory.class.getDeclaredField("editoras");
        field.setAccessible(true);
        ((java.util.Map<?, ?>) field.get(null)).clear();
    }

    @Test
    void deveRetornarLivros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro("The Lord of the Rings", "HarperCollins", "Reino Unido");
        biblioteca.adicionarLivro("The Hobbit", "HarperCollins", "Reino Unido");
        biblioteca.adicionarLivro("Designing Data-Intensive Applications", "O'Reilly", "EUA");
        biblioteca.adicionarLivro("MongoDB: The Definitive Guide", "O'Reilly", "EUA");
        biblioteca.adicionarLivro("The Data Warehouse Toolkit", "Wiley", "EUA");
        biblioteca.adicionarLivro("Database System Concepts", "McGraw-Hill", "EUA");

        List<String> saida = Arrays.asList(
                "Livro{titulo='The Lord of the Rings', editora='HarperCollins', pais='Reino Unido'}",
                "Livro{titulo='The Hobbit', editora='HarperCollins', pais='Reino Unido'}",
                "Livro{titulo='Designing Data-Intensive Applications', editora='O'Reilly', pais='EUA'}",
                "Livro{titulo='MongoDB: The Definitive Guide', editora='O'Reilly', pais='EUA'}",
                "Livro{titulo='The Data Warehouse Toolkit', editora='Wiley', pais='EUA'}",
                "Livro{titulo='Database System Concepts', editora='McGraw-Hill', pais='EUA'}");

        assertEquals(saida, biblioteca.obterLivros());
    }

    @Test
    void deveRetornarTotalEditoras() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro("The Lord of the Rings", "HarperCollins", "Reino Unido");
        biblioteca.adicionarLivro("The Hobbit", "HarperCollins", "Reino Unido");
        biblioteca.adicionarLivro("Designing Data-Intensive Applications", "O'Reilly", "EUA");
        biblioteca.adicionarLivro("MongoDB: The Definitive Guide", "O'Reilly", "EUA");
        biblioteca.adicionarLivro("The Data Warehouse Toolkit", "Wiley", "EUA");
        biblioteca.adicionarLivro("Database System Concepts", "McGraw-Hill", "EUA");

        assertEquals(4, EditoraFactory.getTotalEditoras());
    }
}
