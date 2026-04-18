import java.time.LocalDate;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio{
    private final String placa;
    private final String marca;
    private double valorLocacaoDiaria;
    private final int anoFabricacao;
    private double precoFipe;
    private Combustivel combustivel;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria, int anoFabricacao, double precoFipe, Combustivel combustivel) {
        if (placa == null)
            throw new IllegalArgumentException("A placa não pode ser nula!");
        if (marca == null)
            throw new IllegalArgumentException("A marca não pode ser nula!");
        if (valorLocacaoDiaria <= 0)
            throw new IllegalArgumentException("O valor de locação diária deve ser maior que zero!");
        if (anoFabricacao > LocalDate.now().getYear())
            throw new IllegalArgumentException("Ano de fabricação inválido!");
        if (precoFipe <= 0)
            throw new IllegalArgumentException("O preço FIPE deve ser maior que zero!");
        if (combustivel == null)
            throw new IllegalArgumentException("Combustível inválido!");

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
        this.combustivel = combustivel;
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

    public Combustivel getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
                sb.append("Placa: ")
                        .append(getPlaca())
                        .append("\nMarca: ")
                        .append(getMarca())
                        .append("\nValor da locação diária: R$")
                        .append(String.format("%.2f", getValorLocacaoDiaria()))
                        .append("\nAno de fabricação: ")
                        .append(getAnoFabricacao())
                        .append("\nPreço FIPE: R$")
                        .append(String.format("%.2f", getPrecoFipe()))
                        .append("\nCombustível: ")
                        .append(getCombustivel());
        return sb.toString();
    }
}
