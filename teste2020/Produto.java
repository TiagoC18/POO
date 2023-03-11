package teste2020;

public class Produto implements PVP {
    private String codigo;
    private String letra;
    private int numero=156;
    private int quantidade;
    private double precobsi; //Preço base sem impostos em Euros

    public Produto(String codigo, double precobsi) {
        this.codigo = letra + (2+numero);
        
        this.quantidade = 0;
        this.precobsi = precobsi;
    }
    
    public String getcodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void addQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public double getPrecobsi() {
        return precobsi;
    }

    public void setPrecobsi(double precobsi) {
        this.precobsi = precobsi;
    }

    public double precoVendaAoPublico(){
        if(getcodigo().startsWith("L")){
            return getPrecobsi() * 1.06;
        }
        else
            return getPrecobsi()*1.23;
    }

    public enum classeEnergetica{
        A,B,C,D,E,F
    }
    
    

}
