import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Concessionaria {
    private final List<Automobile> magazzino;

    public Concessionaria() {
        this.magazzino = new ArrayList<>();
    }

    public void aggiungiAuto(Automobile auto) {
        magazzino.add(auto);
    }

    public void rimuoviAuto(String numeroTelaio) {
        magazzino.removeIf(auto -> auto.getNumeroTelaio().equals(numeroTelaio));
    }

    public void stampaAuto() {
        magazzino.forEach(System.out::println);
    }

    public double sommaPrezzi() {
        return magazzino.stream()
            .mapToDouble(Automobile::getPrezzo)
            .sum();
    }

    public String casaProduttricePiuRicorrente() {
        return magazzino.stream()
            .collect(Collectors.groupingBy(Automobile::getMarca, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("Nessuna");
    }

    public Automobile autoCilindrataMinimaPrezzoBasso() {
        return magazzino.stream()
            .filter(auto -> auto.getPrezzo() < 10000)
            .min(Comparator.comparingInt(Automobile::getCilindrata))
            .orElse(null);
    }

    public Automobile autoCilindrataMassimaPrezzoAlto() {
        double prezzoMedio = magazzino.stream()
            .mapToDouble(Automobile::getPrezzo)
            .average()
            .orElse(0);

        return magazzino.stream()
            .filter(auto -> auto.getPrezzo() > prezzoMedio)
            .max(Comparator.comparingInt(Automobile::getCilindrata))
            .orElse(null);
    }

    public List<String> caseProduttriciSoloPrezziBassi() {
        double prezzoMedio = magazzino.stream()
            .mapToDouble(Automobile::getPrezzo)
            .average()
            .orElse(0);

        return magazzino.stream()
            .collect(Collectors.groupingBy(Automobile::getMarca))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue().stream().allMatch(auto -> auto.getPrezzo() < prezzoMedio))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

    public List<String> caseProduttriciStessaCilindrata() {
        return magazzino.stream()
            .collect(Collectors.groupingBy(Automobile::getMarca))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue().stream()
                                .map(Automobile::getCilindrata)
                                .distinct()
                                .count() == 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}


