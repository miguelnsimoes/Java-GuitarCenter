public class Guitarra extends Instrumento{
    private String cordas;
    private String shape;


    public Guitarra(String marca, double valorInstrumento, String modelo, int estoque, String cordas, String shape) {
        super(marca, valorInstrumento, modelo, estoque);
        this.cordas = cordas;
        this.shape = shape;
    }

    public void tocar(){
        System.out.println("pewn newn newn");
    }

}
