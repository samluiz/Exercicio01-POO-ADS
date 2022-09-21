public class Carro {
    private String nome;
    private Double diaria;
    private Double kmRodados;
    
    
    public Carro(String nome) {
        this.nome = nome;
    }
    
    public Double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getDiaria() {
        return diaria;
    }
    public void setDiaria(Double diaria) {
        this.diaria = diaria;
    }

    public Double calcularDiaria(Integer dias) {
        return this.diaria = dias * 60.00;
    }

    public Double calcularKmRodados(Double kmRodados) {
        return this.kmRodados = kmRodados * 0.15; 
    }

    public Double calcularTotal() {
        return this.diaria + this.kmRodados;
    }

    @Override
    public String toString() {
        return "CARRO: " + this.nome + "\nDIÁRIA: R$" + this.diaria + "\nKmRodado: R$" + this.kmRodados + "\nTOTAL: R$" + calcularTotal();
    }


    
}
