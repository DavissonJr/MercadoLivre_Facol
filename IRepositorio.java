package src;

import java.util.List;

public interface IRepositorio<T> {
    void cadastrar(T obj);
    void remover(int id);
    T buscar(int id);
    List<T> listar();
    void atualizar(T obj);
}