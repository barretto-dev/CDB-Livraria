public class Main {
    public static void main(String[] args) {
        Livro l1 = new LivroFisico("Vidas secas", "Graciliano Ramos",
                "6580210885",49.25, 3.50, 17.20);
        Livro l2 = new Ebook("Minha vida com os garotos Walter", "Ali Novak",
                "6588343531",53.80, 30.00);
        Livro l3 = new LivroFisico("Especulações cinematográficas", "Quentin Tarantino",
                "8551009133",67.22, 3.50, 20.00);
        Livro l4 = new Ebook("O Leão, a feiticeira e o guarda-roupa, cartonado ", "C S. Lewis",
                "6559800741",33.16, 15.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.add(l1);
        carrinho.add(l2);
        carrinho.add(l3);
        carrinho.add(l4);


        for(Livro l : carrinho.getLivros())
            System.out.println(l.toString());

        System.out.println("\nTOTAL: R$"+carrinho.calcularTotal());
    }
}