package strategy;

class DescontoSalario implements CalculoSalario {
    private float valorDesconto;

    public DescontoSalario(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public float calcular(float salario) {
        return salario - valorDesconto;
    }
}