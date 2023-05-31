package strategy;

class GerenciadorSalario {
    private float valorSalario;

    public GerenciadorSalario(float valorSalario) {
        this.valorSalario = valorSalario;
    }

    public float calcular(CalculoSalario calculoSalario) {
        return calculoSalario.calcular(valorSalario);
    }
}