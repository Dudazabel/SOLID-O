package refatorado.model.base;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTranferencia;

public class TaxaBase implements CalcularTaxa {

    public double calcular(ProcessarTranferencia tranferencia){
        return 20;
    }
}
