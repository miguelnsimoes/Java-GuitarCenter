import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Instrumento> estoque = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();


    public Loja(String nome, List<Vendedor> vendedores, List<Instrumento> estoque) {
        this.nome = nome;
        this.vendedores = vendedores;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public List<Instrumento> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Instrumento> estoque) {
        this.estoque = estoque;
    }

    public void adicionarInstrumento(Instrumento inst){
        estoque.add(inst);
    }

    public Instrumento buscarInstrumento(String nome){
        for(Instrumento i : estoque){
            if(i.getModelo().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return null;
    }

    public int quantidadeEstoque(String nome){
        int count = 0;
        for(Instrumento i : estoque){
            if(i.getModelo().equalsIgnoreCase(nome));
            count++;
        }
        return count;
    }


}
