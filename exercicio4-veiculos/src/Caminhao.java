import java.time.LocalDate;

public final class Caminhao extends Veiculo{
    private final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe, double capacidadeCargaToneladas){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
        if (capacidadeCargaToneladas <= 0)
            throw new IllegalArgumentException("A capacidade de carga deve ser maior que zero!");
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (pesoCarga < 0)
            throw new IllegalArgumentException("O peso da carga não pode ser negativo!");
        if (dias <= 0)
            throw new IllegalArgumentException("O número de dias deve ser maior do que zero!");
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

    @Override
    public String toString() {
        return super.toString() + "\nCapacidade de toneladas: " + capacidadeCargaToneladas;
    }
}
