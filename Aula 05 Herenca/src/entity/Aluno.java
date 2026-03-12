package entity;

public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String nome, String cpf, int idade, Endereco endereco, String ra) {
        super(nome, cpf, idade, endereco);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", " + super.toString() +
                '}';
    }

    public void fazerPergunta(String pergunta){
        if (!pergunta.endsWith("?")){
            this.falar(pergunta + "?");
        }else{
            this.falar(pergunta);
        }
    }
}
