package teste2020;

public class Autor{
    private String nome;
    private int anoNascimento;

    public Autor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }
    
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public int compare(Autor a) {
        return this.nome.compareTo(a.nome);
    }

    @Override
    public String toString() {
        return nome + " (" + anoNascimento + "-)";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.nome != null ? this.nome.hashCode() : 0);
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
        final Autor other = (Autor) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    
}
