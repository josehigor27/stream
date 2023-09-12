package Teste.Teste02;

public class Pessoa implements Comparable<Pessoa>{
    private Double altura;
    private String nome;

    public Pessoa(Double altura, String nome) {
        this.altura = altura;
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.altura.compareTo(o.getAltura());
    }
}
