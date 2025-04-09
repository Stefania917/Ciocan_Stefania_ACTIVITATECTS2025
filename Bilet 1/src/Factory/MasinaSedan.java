package Factory;

public class MasinaSedan extends Masina implements ITipMasina{

    public MasinaSedan() {
        super();
    }

    public MasinaSedan(String marca, String serieSasiu, int nrBoxe) {
        super(marca, serieSasiu, nrBoxe);
    }
}