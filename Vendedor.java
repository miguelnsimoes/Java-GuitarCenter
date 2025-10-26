public class Vendedor extends Pessoa{
    private double salario;

    public Vendedor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public Vendedor(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void comicao(Instrumento instrumento) {
        double salarioAtualziado = this.salario + (instrumento.getValorInstrumento() * 0.5);
    }
}
