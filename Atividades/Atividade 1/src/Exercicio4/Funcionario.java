package Exercicio4;

public class Funcionario {
    protected String Nome;
    protected Double Salario;
    protected String Departamento;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public Funcionario(String nome, Double salario, String departamento) {
        Nome = nome;
        Salario = salario;
        Departamento = departamento;
    }

    public void mostrarInformações(){
        System.out.println(
                "Nome: " + this.Nome +
                "\nSalário: " + this.Salario +
                "\nDepartamento: " + this.Departamento);
    }
}
