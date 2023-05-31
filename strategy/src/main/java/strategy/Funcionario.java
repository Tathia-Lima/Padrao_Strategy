package strategy;

public class Funcionario {
    private float salario;

    public Funcionario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void somaSalario(CalculoSalario calculo) {
        GerenciadorSalario gerenciadorSalario = new GerenciadorSalario(salario);
        salario = gerenciadorSalario.calcular(calculo);
    }

    public void subtrairDescontos(CalculoSalario calculo) {
        GerenciadorSalario gerenciadorSalario = new GerenciadorSalario(salario);
        salario = gerenciadorSalario.calcular(calculo);
    }

    public void somarBonificacao(CalculoSalario calculo) {
        GerenciadorSalario gerenciadorSalario = new GerenciadorSalario(salario);
        salario = gerenciadorSalario.calcular(calculo);
    }
}
