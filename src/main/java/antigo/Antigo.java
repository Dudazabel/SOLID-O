package antigo;

public class Antigo {
        public class ServicoTransferencia {

            public double processarTransferencia(String tipoCliente,
                                                 String tipoTransferencia,
                                                 String paisOrigem,
                                                 String paisDestino,
                                                 double valor) {

                double taxa = 0;

                // Taxa base fixa
                taxa += 20;

                // Taxa por tipo de cliente
                if (tipoCliente.equals("REGULAR")) {
                    taxa += 10;
                } else if (tipoCliente.equals("PREMIUM")) {
                    taxa += 5;
                } else if (tipoCliente.equals("EMPRESARIAL")) {
                    taxa += 15;
                } else if (tipoCliente.equals("GOVERNO")) {
                    taxa += 2;
                }

                // Taxa por tipo de transferência
                if (tipoTransferencia.equals("PADRAO")) {
                    taxa += 10;
                } else if (tipoTransferencia.equals("EXPRESSA")) {
                    taxa += 25;
                }

                // Taxa por país de origem
                if (paisOrigem.equals("BRASIL")) {
                    taxa += 5;
                } else if (paisOrigem.equals("EUA")) {
                    taxa += 7;
                }

                // Taxa por país de destino
                if (paisDestino.equals("BRASIL")) {
                    taxa += 5;
                } else if (paisDestino.equals("EUA")) {
                    taxa += 7;
                }

                // Resultado final
                double total = valor + taxa;

                System.out.println("Valor original: " + valor);
                System.out.println("Taxas: " + taxa);
                System.out.println("Total final: " + total);

                return total;
            }
        }
}