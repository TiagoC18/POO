public class Client {
    private String nome;
    private String localidade;

    public Client(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    



    @Override
    public String toString() {
        return "Cliente: " + nome + " - " + localidade;
    }

}
