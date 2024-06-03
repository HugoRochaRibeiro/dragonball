
import java.util.HashMap;
import java.util.Map;

public class Namekuseijin extends PersonagemDragonBall {
    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public int calcularPoder() {
        return (int) (ki * (1 + (podeCurar ? 0.2 : 0)));
    }

    public String fazerDesejo(String desejo) {
        Map<String, String> traducao = new HashMap<>();
        traducao.put("paz", "gurra");
        traducao.put("força", "thorra");
        traducao.put("vida", "thoria");
        traducao.put("amor", "lovra");
        traducao.put("dinheiro", "donira");
        traducao.put("saúde", "sana");

        String[] palavras = desejo.split(" ");
        StringBuilder desejoNamekusei = new StringBuilder();
        for (String palavra : palavras) {
            desejoNamekusei.append(traducao.getOrDefault(palavra, palavra)).append(" ");
        }
        return desejoNamekusei.toString().trim();
    }

    @Override
    public String toString() {
        return "Namekuseijin{" +
                "quantidadeEsferas=" + quantidadeEsferas +
                ", podeCurar=" + podeCurar +
                ", " + super.toString() +
                '}';
    }
}
