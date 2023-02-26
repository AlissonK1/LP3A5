public class Pessoa {
    protected String Nome;
    protected int Idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public Pessoa(String nome, int idade) {
        Nome = nome;
        this.Idade = idade;
    }

    public void Apresentar(){
        System.out.println("Olá, eu sou " + this.Nome + " e tenho " + this.Idade + " anos.");
    }
}
