public class Loja {
    private String nome;
    private Vendedor vendedor;
    private Instrumento instrumento;

    public Loja(String nome, Instrumento instrumento, Vendedor vendedor) {
        this.nome = nome;
        this.instrumento = instrumento;
        this.vendedor = vendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

}
