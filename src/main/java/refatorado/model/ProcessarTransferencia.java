package refatorado.model;

public class ProcessarTransferencia {

    private String tipoCliente;
    private String tipoTransferencia;
    private String paisOrigem;
    private String paisDestino;
    private double valor;

    public ProcessarTransferencia(String tipoCliente, String tipoTransferencia, String paisOrigem, String paisDestino, double valor) {
        this.tipoCliente = tipoCliente;
        this.tipoTransferencia = tipoTransferencia;
        this.paisOrigem = paisOrigem;
        this.paisDestino = paisDestino;
        this.valor = valor;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
