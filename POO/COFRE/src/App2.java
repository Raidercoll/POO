public class App2 {
    public static void main(String[] args) {
        Cofre c = new Cofre();
        Moeda u = new Moeda(NomeMoeda.UmReal);
        Moeda d = new Moeda(NomeMoeda.Dez);
        Moeda t = new Moeda(NomeMoeda.VinteCinco);
        Moeda q = new Moeda(NomeMoeda.Cinquenta);
        Moeda f = new Moeda(NomeMoeda.Cinco);
        Moeda g = new Moeda(NomeMoeda.Cinquenta);
        Moeda h = new Moeda(NomeMoeda.Cinco);
        Moeda i = new Moeda(NomeMoeda.VinteCinco);
        Moeda j = new Moeda(NomeMoeda.UmReal);
        Moeda k = new Moeda(NomeMoeda.Dez);

        c.insere(u);
        c.insere(d);
        c.insere(t);
        c.insere(q);
        c.insere(f);
        c.insere(g);
        c.insere(h);
        c.insere(i);
        c.insere(j);
        c.insere(k);

        System.out.println("Moedas armazenadas no cofre: " + c.getQuantidadeMoedas());
        System.out.println("Moedas de um real no cofre: " +c.getQuantidadeMoedasTipo(NomeMoeda.UmReal));
        System.out.println("Moedas de cinquenta centavos: " + c.getQuantidadeMoedasTipo(NomeMoeda.Cinquenta));
        System.out.println("Valor em centavos no cofre: " + c.getValorTotalCentavos());
        System.out.println("Valor total em reais: " + c.getValorTotalReais());
        c.retira();
        c.retira();
        System.out.println("Valor em centavos dps de rwetirar as 2 ultimas moedas: " + c.getValorTotalCentavos());

    }
}
