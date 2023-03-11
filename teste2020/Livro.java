package teste2020;

import java.util.List;
import java.util.TreeSet;

public class Livro extends Produto {
    private String titulo;
    private TreeSet<Autor> autores;

    public Livro(String titulo, double precobsi) {
        super("L", precobsi);
        this.titulo = titulo;
        this.autores = new TreeSet<>();

    }

    public Livro(String titulo, double precobsi, List<Autor> autores) {
        super("L", precobsi);
        this.titulo = titulo;
        this.autores = new TreeSet<>(Autor::compare);
        this.autores.addAll(autores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TreeSet<Autor> getAutores() {
        return autores;
    }

    public void setAutores(TreeSet<Autor> autores) {
        this.autores = autores;
    }

    public void add(Autor autor) {
        this.autores.add(autor);
    }

    public int numeroAutores() {
        return autores.size();
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autores=" + autores + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        return true;
    }
    

}