public abstract class Instrumento {
    private String tipoInstrumento;
    private String marca;
    private double valorInstrumento;

    public Instrumento(){

    }

    public Instrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public double getValorInstrumento() {
        return valorInstrumento;
    }

    public void setValorInstrumento(double valorInstrumento) {
        this.valorInstrumento = valorInstrumento;
    }
}
