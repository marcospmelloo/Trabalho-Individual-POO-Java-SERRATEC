public class Main {
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("ABC1234", "Volvo", 500, 2018, 250000, 10);
        CarroPasseio c2 = new CarroPasseio("XYZ5678", "Fiat", 150, 1999, 20000);

        System.out.println("Caminhão:");
        System.out.println("Aluguel: R$" + c1.alugarVeiculo(12, 3));
        System.out.println("IPVA: R$" + c1.calcularIPVA());

        System.out.println();

        System.out.println("Carro:");
        System.out.println("Aluguel: R$" + c2.alugarVeiculo(0, 5));
        System.out.println("IPVA: R$" + c2.calcularIPVA());
    }
}
