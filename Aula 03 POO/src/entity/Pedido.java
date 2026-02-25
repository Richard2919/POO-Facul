package entity;

public class Pedido {
    private String nome;
    private int valor;
    private String[] adicionais = new String[3];
    private int qtdAdicionais = 0;

    public Pedido(){
    }

    public Pedido(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void adicionarItem(String nomeItem, int valorItem){
        if(qtdAdicionais < 3){
            this.adicionais[qtdAdicionais] = nomeItem;
            this.valor += valorItem;
            this.qtdAdicionais++;
            System.out.println(nomeItem + " adicionado com sucesso");
        }else {
            System.out.println("Limite maximo de itens");
        }
    }

    public void imprimirResumo() {
        System.out.println("Lanche principal: " + this.nome);

        if (qtdAdicionais > 0) {
            System.out.println("Adicionais:");
            for (int i = 0; i < qtdAdicionais; i++) {
                System.out.println(" + " + adicionais[i]);
            }
        } else {
            System.out.println("Adicionais: Nenhum.");
        }

        System.out.println("VALOR TOTAL: R$ " + this.valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
