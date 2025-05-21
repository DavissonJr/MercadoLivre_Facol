package src;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected int estoque;

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(int id, String nome) {
        this(id, nome, 0.0, 0);
    }

    public Produto() {
        this(0, "Desconhecido", 0.0, 0);
    }

    public abstract void exibirInfo();

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }
}