package teste2021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Gastronomia extends Atividade{
    public List<Restaurante> restaurantes= new ArrayList<Restaurante>();

    public Gastronomia(int numero, String nome) {
        super(numero, nome);
    }

    public Gastronomia(int numero, String nome, List<Restaurante> restaurantes) {
        super(numero, nome);
        for (Restaurante restaurante : restaurantes) {
            this.restaurantes.add(restaurante);
        }
    }

    public List<Restaurante> getLista() {
        return restaurantes;
    }

    public void add(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    public int totalRestaurantes() {
        return restaurantes.size();
    }

    @Override
    public Collection<String> locais() {
        Collection<String> locais = new ArrayList<String>();
        for (Restaurante restaurante : restaurantes) {
            locais.add(restaurante.toString());
        }
        return locais;
    }

    @Override
    public String toString() {
        return "Gastronomia{" +
                "restaurantes=" + restaurantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gastronomia gastronomia = (Gastronomia) o;
        return restaurantes.equals(gastronomia.restaurantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurantes);
    }

    


}