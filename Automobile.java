public class Automobile {
    
    String modello;
    String colore;
    String marca;
    int cilindrata;
    double prezzo;
    String numeroT;

    public Automobile(String modello, String colore, String marca, int cilindrata, double prezzo, String numeroT){
        this.modello = modello;
        this.colore = colore;
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
        this.numeroT = numeroT;
    }

    public String getMarca(){
        return marca;
    }

    public int getCilindrata(){
        return cilindrata;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public String getNumeroTelaio(){
        return numeroT;
    }

    @Override
    public String toString() {
        return String.format("Modello: %s, Colore: %s, Casa: %s, Cilindrata: %d, Prezzo: %.2f, Telaio: %s",
        modello, colore, marca, cilindrata, prezzo, numeroT);
    }
}
