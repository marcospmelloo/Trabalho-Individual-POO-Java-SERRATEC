public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcos", "21-99999-8888", "Itaipava, 123");
        Pedido pedido1 = new Pedido("001", cliente1);
        pedido1.getItens().add(new ItemPedido("Notebook", 1, 2000.0));
        pedido1.getItens().add(new ItemPedido("Mouse Gamer", 2, 150.0));
        pedido1.getItens().add(new ItemPedido("Teclado Mecânico", 1, 350.0));
        pedido1.fecharPedido();
        System.out.println(pedido1);

        Cliente cliente2 = new Cliente("Cadu", "21-98888-7777", "Petrópolis, 456");
        Pedido pedido2 = new Pedido("002", cliente2);
        pedido2.getItens().add(new ItemPedido("Monitor", 1, 1800.0));
        pedido2.getItens().add(new ItemPedido("Fone", 1, 50.0));
        pedido2.getItens().add(new ItemPedido("Cabo HDMI", 1, 40.0));
        pedido2.fecharPedido();
        System.out.println(pedido2);

        Cliente cliente3 = new Cliente("Caio", "21-97777-6666", "Bingen, 789");
        Pedido pedido3 = new Pedido("003", cliente3);
        pedido3.getItens().add(new ItemPedido("Suporte monitor", 1, 140.0));
        pedido3.getItens().add(new ItemPedido("Caneta", 2, 2.50));
        pedido3.getItens().add(new ItemPedido("Cabo USB", 1, 30.0));
        pedido3.fecharPedido();
        System.out.println(pedido3);
    }
}
