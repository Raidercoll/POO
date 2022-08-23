import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cofre c = new Cofre();
        // Moeda u = new Moeda(NomeMoeda.UmReal);
        // Moeda d = new Moeda(NomeMoeda.Dez);
        // Moeda t = new Moeda(NomeMoeda.VinteCinco);
        // Moeda q = new Moeda(NomeMoeda.Cinquenta);
        // Moeda f = new Moeda(NomeMoeda.Cinco);
        // Moeda g = new Moeda(NomeMoeda.Cinquenta);
        // Moeda h = new Moeda(NomeMoeda.Cinco);
        // Moeda i = new Moeda(NomeMoeda.VinteCinco);
        // Moeda j = new Moeda(NomeMoeda.UmReal);
        // Moeda k = new Moeda(NomeMoeda.Dez);

        // c.insere(u);
        // c.insere(d);
        // c.insere(t);
        // c.insere(q);
        // c.insere(f);
        // c.insere(g);
        // c.insere(h);
        // c.insere(i);
        // c.insere(j);
        // c.insere(k);

        // System.out.println("Moedas armazenadas no cofre: " + c.getQuantidadeMoedas());
        // System.out.println("Moedas de um real no cofre: " +c.getQuantidadeMoedasTipo(NomeMoeda.UmReal));
        // System.out.println("Moedas de cinquenta centavos: " + c.getQuantidadeMoedasTipo(NomeMoeda.Cinquenta));
        // System.out.println("Valor em centavos no cofre: " + c.getValorTotalCentavos());
        // System.out.println("Valor total em reais: " + c.getValorTotalReais());
        // c.retira();
        // c.retira();
        // System.out.println("Valor em centavos dps de rwetirar as 2 ultimas moedas: " + c.getValorTotalCentavos());


        //Extra

        Cofre c2 = new Cofre(); 
        while(true){
            System.out.println("Se deseja inserir uma moeda digite 1, se deseja retirar digite 2");
            int opcao = sc.nextInt();
            switch  (opcao){
                case 1:
                System.out.println("Digite qual o valor da moeda");
                String a = sc.next();
                if(a.toUpperCase().equals("UMREAL")){
                    Moeda m1 = new Moeda(NomeMoeda.UmReal);
                    c2.insere(m1);
                    System.out.println(c2.getQuantidadeMoedas());
                    break;
                }else if(a.toUpperCase().equals("CINQUENTA")){
                    Moeda m2 = new Moeda(NomeMoeda.Cinquenta);
                    c2.insere(m2);
                    System.out.println(c2.getQuantidadeMoedas());
                    break;
                }else if(a.toUpperCase().equals("VINTECINCO")){
                    Moeda m3Moeda = new Moeda(NomeMoeda.Cinquenta);
                    c2.insere(m3Moeda);
                    System.out.println(c2.getQuantidadeMoedas());
                    break;
                }else if(a.toUpperCase().equals("CINCO")){
                    Moeda m4Moeda = new Moeda(NomeMoeda.Cinco);
                    c2.insere(m4Moeda);
                    System.out.println(c2.getQuantidadeMoedas());
                    break;
                }else if(a.toUpperCase().equals("DEZ")){
                    Moeda m5Moeda = new Moeda(NomeMoeda.Dez);
                    c2.insere(m5Moeda);
                    System.out.println(c2.getQuantidadeMoedas());
                    break;
                }else if(a.toUpperCase().equals("UM")){
                    Moeda m6Moeda = new Moeda(NomeMoeda.Um);
                    c2.insere(m6Moeda);
                    System.out.println(c2.getQuantidadeMoedas());
                    break;
                }else{
                    System.out.println("Moeda inválida");
                    break;
                }
                    
                case 2:
                    c2.retira();
                    System.out.println("teste");
                    System.out.println(c2.getQuantidadeMoedas());
                    break;

            }
        }


    }
}