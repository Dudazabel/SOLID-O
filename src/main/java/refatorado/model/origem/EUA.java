package refatorado.model.origem;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class EUA implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia) {
        return 7;
    }
}
