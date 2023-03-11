package teste2021;

public class Organizacao {
    private String contato;

    public Organizacao(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Organizacao{" +
                "contato='" + contato + '\'' +
                '}';
    }
}
