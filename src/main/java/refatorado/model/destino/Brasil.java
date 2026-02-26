package refatorado.model.destino;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class Brasil implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia) {
        return 5;
    }
}
