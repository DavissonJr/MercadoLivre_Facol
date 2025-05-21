package src;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio implements IRepositorio<Produto> {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void cadastrar(Produto p) {
        produtos.add(p);
    }

    @Override
    public void remover(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }

    @Override
    public Produto buscar(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Produto> listar() {
        return produtos;
    }

    @Override
    public void atualizar(Produto novo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == novo.getId()) {
                produtos.set(i, novo);
                return;
            }
        }
    }
}