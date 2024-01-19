import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Livro> livros = new ArrayList<Livro>();

    public Double calcularTotal(){
        double valorTotal = 0;

        for(Livro l : livros){
            valorTotal += l.getPreco();
            if( l instanceof LivroFisico)
                valorTotal += ((LivroFisico) l).getFrete();
        }
        return valorTotal;
    }

    public void add(Livro livro){
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
