public class Elettronica extends Articolo{
    private String marca;
    private String tipoDispositivo;

    public Elettronica(String nome, double prezzo, int codiceProdotto, String marca, String tipoDispositivo) {
        super(nome, prezzo, codiceProdotto);
        this.marca = marca;
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    @Override
    public String dettagli() {
        return  "          " +
                "marca = '" + marca + '\'' +
                ", tipoDispositivo = '" + tipoDispositivo + '\'' +
                '}';
    }
}
