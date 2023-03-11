package teste2020;


public class Eletrodomestico extends Produto {
    private String tipo;
    private String marca;
    private String modelo;
    private double potencia;
    private classeEnergetica classeEnergetica;

    public Eletrodomestico(String tipo, String marca, String modelo, double potencia, double preco) {
        super("E", preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        //this.classeEnergetica = classeEnergetica;
    }

    public Eletrodomestico(String tipo, String marca, String modelo, double preco) {
        super("E", preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public classeEnergetica getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(classeEnergetica classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" + "tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
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
        final Eletrodomestico other = (Eletrodomestico) obj;
        if ((this.tipo == null) ? (other.tipo != null) : !this.tipo.equals(other.tipo)) {
            return false;
        }
        return true;
    }
}
