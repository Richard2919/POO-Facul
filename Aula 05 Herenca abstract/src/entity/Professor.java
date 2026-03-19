package entity;

public class Professor extends Pessoa{
   private String dataContratacao;

    public Professor(String nome, String cpf, int idade, Endereco endereco, String dataContratacao) {
        super(nome, cpf, idade, endereco);
        this.dataContratacao = dataContratacao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "dataContratacao='" + dataContratacao + '\'' +
                ", " + super.toString() +
                '}';
    }

    public void darAula(String conteudo){
        this.falar(conteudo);
    }

    public void responderPergunta(String resposta){
        this.falar(resposta);
    }
}
