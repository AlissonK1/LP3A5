import Exercicio3.Círculo;
import Exercicio4.Funcionario;
import Exercicio4.Gerente;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Alisson", 19, "Sp3071286");
        aluno.Apresentar();

        Funcionario funcionario = new Funcionario("Alisson", 1000.00, "TI");
        funcionario.mostrarInformações();

        Gerente gerente = new Gerente("Alisson", 2000.00, "TI", "SenhaTeste");
        gerente.mostrarInformações();
    }
}