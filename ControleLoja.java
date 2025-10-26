import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleLoja {

    private List<Instrumento> instrumentos = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private Scanner sc;

    public ControleLoja(Scanner sc){
        this.sc = sc;

    }

    public void criarInstrumentos(){
        Instrumento instrumento = new Instrumento();
        System.out.println("Marca: ");
        String marca = sc.nextLine();

        System.out.println("Modelo: ");
        String modelo = sc.nextLine();

        System.out.println("Valor: ");
        double valor = sc.nextDouble();

        System.out.println("1 - Guitarra / 2- Bateria : ");
        int opcao = sc.nextInt();
        
        if(opcao == 1){

        }



    }

    public void listarInstrumentos(){
        System.out.println("Instrumentos Disponiveis");


    }


}
