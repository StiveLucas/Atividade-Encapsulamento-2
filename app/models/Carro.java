package app.models;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;

    }

    public String getMarca(){
        return marca;

    }

    public String getModelo(){
        return modelo;

    }

    public int getAnoFabricacao(){
        return anoFabricacao;

    }

    public void setMarca(String marca){
        this.marca = marca;

    }

    public void setModelo(String modelo){
        this.modelo = modelo;

    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
        
    }

    public void exibirInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano de Fabricação: "+anoFabricacao);
        System.out.println("-------------------------------------");
        
    }

    
}