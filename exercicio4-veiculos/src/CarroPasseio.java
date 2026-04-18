import java.time.LocalDate;

public final class CarroPasseio extends Veiculo{

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (pesoCarga < 0)
            throw new IllegalArgumentException("O peso da carga não pode ser negativo!");
        if (dias <= 0)
            throw new IllegalArgumentException("O número de dias deve ser maior do que zero!");
        return getValorLocacaoDiaria() * dias;
    }

    @Override
    public double calcularIPVA() {
        if (getAnoFabricacao() < (LocalDate.now().getYear() - 20)) {
            return 0.0;
        } else {
            return getPrecoFipe() * 0.04;
        }
    }
}
