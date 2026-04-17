public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio{
    private final String placa;
    private final String marca;
    private double valorLocacaoDiaria;
    private final int anoFabricacao;
    private double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe) {
        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPrecoFipe() {
        return precoFipe;
    }
}
