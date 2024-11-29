public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        concessionaria.aggiungiAuto(new Automobile("Model S", "Rosso", "Tesla", 2000, 70000, "ABC123"));
        concessionaria.aggiungiAuto(new Automobile("Panda", "Bianco", "Fiat", 1200, 9000, "DEF456"));
        concessionaria.aggiungiAuto(new Automobile("Civic", "Nero", "Honda", 1800, 20000, "GHI789"));
        concessionaria.aggiungiAuto(new Automobile("500", "Blu", "Fiat", 1300, 8000, "JKL012"));

        System.out.println("Tutte le auto:");
        concessionaria.stampaAuto();

        System.out.println("\nSomma dei prezzi: " + concessionaria.sommaPrezzi());
        System.out.println("Casa produttrice più ricorrente: " + concessionaria.casaProduttricePiuRicorrente());
        System.out.println("Auto con cilindrata minima sotto 10.000€: " + concessionaria.autoCilindrataMinimaPrezzoBasso());
        System.out.println("Auto con cilindrata massima sopra il prezzo medio: " + concessionaria.autoCilindrataMassimaPrezzoAlto());
        System.out.println("Case produttrici con solo prezzi sotto la media: " + concessionaria.caseProduttriciSoloPrezziBassi());
        System.out.println("Case produttrici con tutte le auto della stessa cilindrata: " + concessionaria.caseProduttriciStessaCilindrata());
    }
}
