
public class PersonagemFactory {
    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 33, "Masculino", "Dragon Ball Z", 1000, "Kienzan", "Terra", "Cidade do Leste");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 35, "Masculino", "Dragon Ball Z", 5000, "Kamehameha", 5, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 25, "Masculino", "Dragon Ball Z", 4500, "Masenko", 3, true);
    }

    public static Namekuseijin criarDende() {
        return new Namekuseijin("Dendê", 30, "Masculino", "Dragon Ball Z", 3000, "Curar", 7, true);
    }
}
