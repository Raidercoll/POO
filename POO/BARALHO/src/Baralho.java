public class Baralho {
    public final int TAM_BARALHO = 52;
    private Carta[] cartas;
    private int ultOcupada;

    public Baralho() {
        cartas = new Carta[TAM_BARALHO];
        ultOcupada = 0;

        Naipe[] naipes = Naipe.values();
        Valor[] valores = Valor.values();

        for (int i = 0; i < naipes.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                Carta carta = new Carta(naipes[i], valores[j]);
                cartas[ultOcupada] = carta;
                ultOcupada++;
            }
        }
    }

    // Embaralha as cartas que estão no arranjo
    public void embaralha() {

    }

    // Retira a carta que esta "em cima" do baralho e retorna
    // Podem considerar a que esta "em cima" como sendo a última do arranjo
    // Retorna null se o arranjo estiver vazio
    public Carta topo() {
        return null;
    }
}
