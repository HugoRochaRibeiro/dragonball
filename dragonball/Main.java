
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();

        // Evoluindo Goku para Super Sayajin 5
        goku.transformar(5);

        // Evoluindo Gohan para Super Sayajin 5, se não for possível, evoluir para níveis inferiores
        for (int nivel = 1; nivel <= 5; nivel++) {
            gohan.transformar(nivel);
        }

        // Fazendo um desejo com Dendê
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu desejo: ");
        String desejo = scanner.nextLine();
        
        String desejoNamekusei = dende.fazerDesejo(desejo);
        System.out.println("Desejo em Namekusei: " + desejoNamekusei);
        
        scanner.close();
    }
}
