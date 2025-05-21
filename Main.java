package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoRepositorio repo = new ProdutoRepositorio();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Mini Mercado Livre ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Comprar Produto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Estoque: ");
                    int estoque = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Voltagem: ");
                    String voltagem = sc.nextLine();
                    repo.cadastrar(new Eletrodomestico(id, nome, preco, estoque, voltagem));
                    break;
                case 2:
                    for (Produto p : repo.listar()) p.exibirInfo();
                    break;
                case 3:
                    System.out.print("ID do produto para remover: ");
                    repo.remover(sc.nextInt());
                    break;
                case 4:
                    System.out.print("ID do produto: ");
                    int idUp = sc.nextInt();
                    sc.nextLine();
                    Produto existente = repo.buscar(idUp);
                    if (existente != null) {
                        System.out.print("Novo nome: ");
                        String nomeUp = sc.nextLine();
                        System.out.print("Novo preço: ");
                        double precoUp = sc.nextDouble();
                        System.out.print("Novo estoque: ");
                        int estoqueUp = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nova voltagem: ");
                        String voltagemUp = sc.nextLine();
                        repo.atualizar(new Eletrodomestico(idUp, nomeUp, precoUp, estoqueUp, voltagemUp));
                    }
                    break;
                case 5:
                    System.out.print("ID do produto para compra: ");
                    int idCompra = sc.nextInt();
                    Produto prodCompra = repo.buscar(idCompra);
                    if (prodCompra != null && prodCompra.getEstoque() > 0) {
                        prodCompra.setEstoque(prodCompra.getEstoque() - 1);
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Produto não disponível em estoque.");
                    }
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}