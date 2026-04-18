public class Main {
    public static void main(String[] args) {
        try {
            Caminhao c1 = new Caminhao("ABC1234", "Volvo", 500, 2018, 250000, Combustivel.DIESEL, 10);

            System.out.println("Caminhão:");
            System.out.println(c1);
            System.out.println("--------------------");
            System.out.printf("Aluguel: R$ %.2f%n", c1.alugarVeiculo(12, 3));
            System.out.printf("IPVA: R$ %.2f%n", c1.calcularIPVA());
            System.out.println("--------------------");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();

        try{
            CarroPasseio c2 = new CarroPasseio("XYZ5678", "Fiat", 150, 1999, 20000, Combustivel.GASOLINA);

            System.out.println("Carro:");
            System.out.println(c2);
            System.out.println("--------------------");
            System.out.printf("Aluguel: R$ %.2f%n", c2.alugarVeiculo(0, 5));
            System.out.printf("IPVA: R$ %.2f%n", c2.calcularIPVA());
            System.out.println("--------------------");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();

        try {
            Caminhao c3 = new Caminhao("ABC321", "Scania", -150, 2000, 300000, Combustivel.DIESEL, 12);

            System.out.println("Caminhão:");
            System.out.println(c3);
            System.out.println("--------------------");
            System.out.printf("Aluguel: R$ %.2f%n", c3.alugarVeiculo(15, 5));
            System.out.printf("IPVA: R$ %.2f%n", c3.calcularIPVA());
            System.out.println("--------------------");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
