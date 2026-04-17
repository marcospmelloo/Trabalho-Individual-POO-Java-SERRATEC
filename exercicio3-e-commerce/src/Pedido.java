import java.time.LocalDateTime;
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
            System.out.println("Frete grátis para pedidos acima de R$250,00");
        } else {
            frete = 25.0;
            System.out.println("Frete de R$25,00");
        }

        return valorTotal = subtotal + frete;
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