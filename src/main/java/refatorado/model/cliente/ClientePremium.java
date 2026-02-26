package refatorado.model.cliente;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class ClientePremium implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia){
        return 5;
    }
}
