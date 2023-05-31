package strategy;

class AcrescimoSalario implements CalculoSalario {
    private float valorAcrescimo;

    public AcrescimoSalario(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    @Override
    public float calcular(float salario) {
        return salario + valorAcrescimo;
    }
}