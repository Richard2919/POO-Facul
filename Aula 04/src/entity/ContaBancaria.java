package entity;

public class ContaBancaria {
    private String numeroConta;
    private String agencia;
    private double saldo;

    public ContaBancaria(){
    }

    public ContaBancaria(String numeroConta, String agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        if(agencia == null || agencia.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: valor digitado inválido");
        }
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

   public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor invalido");
            return;
        }
        this.saldo += valor;
   }

   public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
       this.saldo -= valor;
   }
}
