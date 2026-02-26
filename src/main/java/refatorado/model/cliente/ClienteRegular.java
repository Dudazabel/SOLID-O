package refatorado.model.cliente;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class ClienteRegular implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia){
        return 10;
    }
}
