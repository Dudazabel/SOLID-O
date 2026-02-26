package refatorado.model.tranferemcia;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class TransferenciaExpressa implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia){
        return 25;
    }
}
