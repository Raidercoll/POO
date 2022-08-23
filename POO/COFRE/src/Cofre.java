public class Cofre{
    private final int TAM_COFRE = 100;
    private Moeda[] moedas;
    private int proxInt = 0;
    private int quantidadeMoedas = 0;

    public Cofre (){
        this.moedas = new Moeda[TAM_COFRE];
    }

    public boolean insere(Moeda moeda){
        if(proxInt > TAM_COFRE){
            return false;
        }else{
            moedas[proxInt] = moeda;
            proxInt++;
            quantidadeMoedas++;
            return true;
        }
    }

    public Moeda retira(){
        if(proxInt <= 0){
            return null;
        }else{
            Moeda aux = moedas[proxInt-1];
            moedas[proxInt-1] = null;
            proxInt--;
            quantidadeMoedas--;
            return aux;
        }
    }

    public int getQuantidadeMoedas(){
        return quantidadeMoedas;
    }

    public int getQuantidadeMoedasTipo(NomeMoeda nomeMoeda){
        int valor = 0;
        for(int i = 0; i < proxInt; i ++){
            if(moedas[i].getNomeMoeda().equals(nomeMoeda)){
                valor++;
            }
        }
        return valor;
    }

    // public int getValorTotalCentavos(){
    //     int valor = 0;
    //     for(int i = 0; i < proxInt; i ++){
    //         valor += moedas[i].getValorCentavos();
    //     }
    //     return valor;
    // }

    
    // For each
    public int getValorTotalCentavos(){
        int valor = 0;
        for(Moeda count : moedas){
            if(count == null){
                continue;
            }
            valor += count.getValorCentavos();
        }
        return valor;
    }

    public double getValorTotalReais(){
        double valor = 0;
        for(Moeda count : moedas){
            if(count == null){
                continue;
            }
            valor += count.getValorReais();
        }
        return valor;
    }
}