package entity;

public class Endereco {
    private String nomeRua;
    private int numero;
    private int CEP;

    public Endereco(String nomeRua, int numero, int CEP) {
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.CEP = CEP;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "nomeRua='" + nomeRua + '\'' +
                ", numero=" + numero +
                ", CEP=" + CEP +
                '}';
    }
}
