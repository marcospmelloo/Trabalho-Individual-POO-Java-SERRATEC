import java.time.LocalDate;
import java.util.Date;

public final class Caminhao extends Veiculo{
    private final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe, double capacidadeCargaToneladas){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        double total = getValorLocacaoDiaria() * dias;
        if (pesoCarga > capacidadeCargaToneladas) {
            total += total * 0.10;
        }
        return total;
    }

    @Override
    public double calcularIPVA() {
        if(getAnoFabricacao() < (LocalDate.now().getYear() - 20)){
            return 0.0;
        }
        else {
            return getPrecoFipe() * 0.015;
        }
    }

}
