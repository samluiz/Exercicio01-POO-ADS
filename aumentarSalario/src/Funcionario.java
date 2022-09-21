public class Funcionario {
    
    private String nome;
    private String matricula;
    private Double salario;
    
    public Funcionario() {
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(Double porcentagem) {
        this.salario += salario * (porcentagem / 100);
    }

    
}
