public class Aluno extends Pessoa{

    public String Matricula;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        Matricula = matricula;
    }
    @Override
    public void Apresentar() {
        System.out.println("Olá, eu sou o aluno " + this.Nome + " com matrícula " + this.Matricula + " e tenho " + this.Idade + " anos.");
    }
}
