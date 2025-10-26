public class Instrumento {
    private String marca;
    private double valorInstrumento;
    private String modelo;

    public Instrumento(){

    }

    public Instrumento(String marca, double valorInstrumento) {
        this.marca = marca;
        this.valorInstrumento = valorInstrumento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public double getValorInstrumento() {
        return valorInstrumento;
    }

    public void setValorInstrumento(double valorInstrumento) {
        this.valorInstrumento = valorInstrumento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
