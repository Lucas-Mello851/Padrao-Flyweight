package padroesestruturais.flyweight;

public class Editora {

    private String nome;
    private String pais;

    public Editora(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
}
