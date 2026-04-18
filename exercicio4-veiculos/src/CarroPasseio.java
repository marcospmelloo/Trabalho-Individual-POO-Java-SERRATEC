import java.time.LocalDate;

public final class CarroPasseio extends Veiculo{

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
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
