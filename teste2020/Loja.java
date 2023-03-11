package teste2020;

import java.util.TreeSet;

public class Loja {
    private String nome;
    private String endWeb; //Endereço web da loja
    private TreeSet<Produto> produtos; //Conjunto de produtos da loja em stock

    public Loja(String nome, String endWeb) {
        this.nome = nome;
        this.endWeb = endWeb;
        this.produtos = new TreeSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndWeb() {
        return endWeb;
    }

    public void setEndWeb(String endWeb) {
        this.endWeb = endWeb;
    }

    public TreeSet<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(TreeSet<Produto> produtos) {
        this.produtos = produtos;
    }

    public void add(Livro livro) {
        this.produtos.add(livro);
    }
    
    public void add(Telemovel telemovel) {
        this.produtos.add(telemovel);
    }

    public void add(Eletrodomestico eletrodomestico) {
        this.produtos.add(eletrodomestico);
    }

    public int totalItems(){
        int total = 0;
        for (Produto p : this.produtos) {
            total += p.getQuantidade();
        }
        return total;
    }

}