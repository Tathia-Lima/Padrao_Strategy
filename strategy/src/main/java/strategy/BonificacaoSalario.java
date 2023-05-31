package strategy;

class BonificacaoSalario implements CalculoSalario {
    private float valorBonificacao;

    public BonificacaoSalario(float valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public float calcular(float salario) {
        return salario + valorBonificacao;
    }
}