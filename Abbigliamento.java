public class Abbigliamento extends Articolo {
    private String taglia;
    private String genere;

    public Abbigliamento(String nome, double prezzo, int codiceProdotto, String taglia, String genere) {
        super(nome, prezzo, codiceProdotto);
        this.taglia = taglia;
        this.genere = genere;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String dettagli() {
        return "          " +
                "taglia = '" + taglia + '\'' +
                ", genere = '" + genere + '\'' +
                '}';
    }
}
