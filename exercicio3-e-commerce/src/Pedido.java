import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private LocalDateTime dataHora;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private double frete;
    private double valorTotal;
    private double subtotal;

    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.dataHora = LocalDateTime.now();
        this.itens = new ArrayList<>();
        this.frete = 0.0;
        this.valorTotal = 0.0;
        this.subtotal = 0.0;
    }

    public double fecharPedido(){
        for (ItemPedido item : itens) {
            subtotal += item.getTotal();
        }

        if (subtotal > 250.0) {
            frete = 0.0;
        } else {
            frete = 25.0;
        }

        return valorTotal = subtotal + frete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("--------------")
                    .append("RECIBO")
                    .append("--------------")
                    .append("\nId do pedido: ")
                    .append(this.id)
                    .append("\nData: ")
                    .append(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")))
                    .append("\nCliente: ")
                    .append(cliente.getNome())
                    .append("\nItens: ")
                    .append(getItens().toString())
                    .append("\n");

            sb.append("\nTOTAL DO PEDIDO")
                    .append("\nSubtotal: R$")
                    .append(this.subtotal)
                    .append("\nValor do frete: R$")
                    .append(this.frete)
                    .append("\nValor total do pedido: R$")
                    .append(this.valorTotal)
                    .append("\n");

        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}