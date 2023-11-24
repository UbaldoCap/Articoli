public abstract class Articolo {
    private String nome;
    private double prezzo;
    private int codiceProdotto;

    public Articolo(String nome, double prezzo, int codiceProdotto) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.codiceProdotto = codiceProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(int codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    @Override
    public String toString() {
        return "Articolo {" +
                "nome = '" + nome + '\'' +
                ", prezzo = " + prezzo +
                ", codiceProdotto = " + codiceProdotto +
                '}';
    }

    public abstract String dettagli();
}
