package refatorado.service;

import java.util.List;
import refatorado.model.CalcularTaxa;
import refatorado.model.ProcessarTransferencia;

public class ProcessandoTransferenciaService {

    public double calcularTotal(ProcessarTransferencia transferencia,
                                List<CalcularTaxa> taxas) {

        double totalTaxas = 0;

        for (CalcularTaxa taxa : taxas) {
            totalTaxas += taxa.calcular(transferencia);
        }

        return transferencia.getValor() + totalTaxas;
    }
}