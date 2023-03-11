package teste2020;

import java.util.TreeSet;

public class Telemovel extends Produto {
    private String marca;
    private String modelo;
    private TreeSet<String> notas; //lista de notas
    
    public Telemovel(String marca, String modelo, double preco) {
        super("T", preco);
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TreeSet<String> getNotas() {
        return notas;
    }

    public void setNotas(TreeSet<String> notas) {
        this.notas = notas;
    }

    public void addNota(String nota) {
        this.notas.add(nota);
    }

    @Override
    public String toString() {
        return "Telemovel{" + "marca=" + marca + ", modelo=" + modelo + ", notas=" + notas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.marca != null ? this.marca.hashCode() : 0);
        hash = 97 * hash + (this.modelo != null ? this.modelo.hashCode() : 0);
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
        final Telemovel other = (Telemovel) obj;
        if ((this.marca == null) ? (other.marca != null) : !this.marca.equals(other.marca)) {
            return false;
        }
        if ((this.modelo == null) ? (other.modelo != null) : !this.modelo.equals(other.modelo)) {
            return false;
        }
        return true;
    }
}
