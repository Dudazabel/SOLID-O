package refatorado.model;

public class TaxaBase implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia){
        return 20;
    }
}
