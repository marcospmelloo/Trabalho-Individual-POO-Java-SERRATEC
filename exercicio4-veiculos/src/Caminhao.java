public final class Caminhao extends Veiculo{
    private final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe, double capacidadeCargaToneladas){
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }


}
