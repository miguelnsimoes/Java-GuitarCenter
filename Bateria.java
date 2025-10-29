public class Bateria extends  Instrumento{
    private String tipo;
    private int voltagem;

    public Bateria(String tipo, int voltagem) {
        this.tipo = tipo;
        this.voltagem = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando bateria: bum, tch!");
    }
}
