package refatorado;

import java.util.*;

import refatorado.model.*;
import refatorado.model.cliente.*;
import refatorado.model.transferencia.TransferenciaExpressa;
import refatorado.model.transferencia.TransferenciaPadrao;
import refatorado.service.ProcessandoTransferenciaService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Tipo Cliente:");
        String tipoCliente = scanner.nextLine().toUpperCase();

        System.out.println("Tipo Transferência:");
        String tipoTransferencia = scanner.nextLine().toUpperCase();

        System.out.println("País Origem:");
        String paisOrigem = scanner.nextLine().toUpperCase();

        System.out.println("País Destino:");
        String paisDestino = scanner.nextLine().toUpperCase();

        ProcessarTransferencia transferencia =
                new ProcessarTransferencia(
                        tipoCliente,
                        tipoTransferencia,
                        paisOrigem,
                        paisDestino,
                        valor
                );

        List<CalcularTaxa> taxas = new ArrayList<>();
        taxas.add(new TaxaBase());

        Map<String, CalcularTaxa> mapaClientes = new HashMap<>();
        mapaClientes.put("REGULAR", new ClienteRegular());
        mapaClientes.put("PREMIUM", new ClientePremium());
        mapaClientes.put("EMPRESARIAL", new ClienteEmpresarial());
        mapaClientes.put("GOVERNO", new ClienteGoverno());


        Map<String, CalcularTaxa> mapaTransferencia = new HashMap<>();
        mapaTransferencia.put("PADRAO", new TransferenciaPadrao());
        mapaTransferencia.put("EXPRESSA", new TransferenciaExpressa());

        Map<String, CalcularTaxa> mapaOrigem = new HashMap<>();
        mapaOrigem.put("BRASIL", new refatorado.model.origem.Brasil());
        mapaOrigem.put("EUA", new refatorado.model.origem.EUA());

        Map<String, CalcularTaxa> mapaDestino = new HashMap<>();
        mapaDestino.put("BRASIL", new refatorado.model.destino.Brasil());
        mapaDestino.put("EUA", new refatorado.model.destino.EUA());

        taxas.add(mapaClientes.get(tipoCliente));
        taxas.add(mapaTransferencia.get(tipoTransferencia));
        taxas.add(mapaOrigem.get(paisOrigem));
        taxas.add(mapaDestino.get(paisDestino));

        ProcessandoTransferenciaService service =
                new ProcessandoTransferenciaService();

        double total = service.calcularTotal(transferencia, taxas);

        System.out.println("Total final: " + total);

        scanner.close();
    }
}