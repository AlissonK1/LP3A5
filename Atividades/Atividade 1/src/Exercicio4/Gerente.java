package Exercicio4;

public class Gerente extends Funcionario{

    private String Senha;

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Gerente(String nome, Double salario, String departamento, String senha) {
        super(nome, salario, departamento);
        Senha = senha;
    }

    @Override
    public void mostrarInformações() {
        super.mostrarInformações();
        System.out.println("Senha: " + this.Senha);
    }
}
