public class Main {
    public static void main(String[] args) {
        Elettronica computer = new Elettronica("pavillion", 899.00, 7534,"HP", "computer");
        Abbigliamento maglia = new Abbigliamento("maglia", 12.5, 908, "M", "casual");
        Articolo[] array = {computer, maglia};
        for (Articolo articolo : array) {
            System.out.println(articolo);
            System.out.println(articolo.dettagli());
        }
    }
}
