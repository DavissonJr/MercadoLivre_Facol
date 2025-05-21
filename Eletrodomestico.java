package src;

public class Eletrodomestico extends Produto {
    private String voltagem;

    public Eletrodomestico(int id, String nome, double preco, int estoque, String voltagem) {
        super(id, nome, preco, estoque);
        this.voltagem = voltagem;
    }

    public Eletrodomestico(int id, String nome) {
        super(id, nome);
        this.voltagem = "220V";
    }

    public Eletrodomestico() {
        super();
        this.voltagem = "110V";
    }

    public String getVoltagem() { return voltagem; }
    public void setVoltagem(String voltagem) { this.voltagem = voltagem; }

    @Override
    public void exibirInfo() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Preço: R$ " + preco + " | Estoque: " + estoque + " | Voltagem: " + voltagem);
    }
}