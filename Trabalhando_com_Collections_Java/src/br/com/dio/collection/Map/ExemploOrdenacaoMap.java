package br.com.dio.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatoria\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições para o Seculo 21", 432));
        }};
        meusLivros.entrySet();

        System.out.println("--\tOrdem Inserção\t--");
        System.out.println("--\tOrdem Alfabetica autores\t--");
        System.out.println("--\tOrdem Alfabetica nomes dos livros\t--");
        System.out.println("--\tOrdem numero de paginas\t--");
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
