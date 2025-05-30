package Singleton;

import Factory.AMasina;

public class Service implements IService{

    private static final Service instance  = new Service();
    private AMasina masinaAflataInService;


    private Service() {
    }

    public AMasina getMasinaAflataInService() {
        return masinaAflataInService;
    }


    public static Service getInstance(){
        return  instance;
    }

    @Override
    public void preluareMasina(AMasina masina) {
        this.masinaAflataInService = masina;
    }
}
