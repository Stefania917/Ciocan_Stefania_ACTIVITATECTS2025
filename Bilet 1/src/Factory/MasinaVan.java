package Factory;

public class MasinaVan extends Masina implements ITipMasina{
    public MasinaVan() {
    }

    public MasinaVan(String marca, String serieSasiu, int nrBoxe) {
        super(marca, serieSasiu, nrBoxe);
    }
}
