package teste2021;

import java.util.Objects;

public class Restaurante {
    private String nome;
    private TipoComida tipoComida;

    public Restaurante(String nome, TipoComida TipoComida) {
        this.nome = nome;
        this.tipoComida = TipoComida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    
   

    @Override
    public String toString() {
        return "Restaurante{" +
                "nome='" + nome + '\'' +
                ", tipoComida=" + tipoComida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante restaurante = (Restaurante) o;
        return nome.equals(restaurante.nome) &&
                tipoComida == restaurante.tipoComida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipoComida);
    }

}
