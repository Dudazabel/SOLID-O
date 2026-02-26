package refatorado.model.cliente;

import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class ClienteEmpresarial implements CalcularTaxa {

    @Override
    public double calcular(ProcessarTransferencia transferencia){
        return 15;
    }
}
