package dio.gof.facade;

public class TesteFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("André", "39400000");
    }
}
