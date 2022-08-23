public class App {
    public static void main(String[] args) throws Exception {
        Carta c = new Carta(Naipe.ESPADAS,Valor.NOVE);

        System.out.println(c);

        Naipe[] naipes = Naipe.values();
        for(int i=0;i<naipes.length;i++){
            System.out.println(naipes[i]);
        }

    }
}
