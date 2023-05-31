package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {


    @Test
    public void testSomaSalario() {
        Funcionario funcionario = new Funcionario(5000);

        CalculoSalario acrescimoFerias = new AcrescimoSalario(1000);
        funcionario.somaSalario(acrescimoFerias);

        CalculoSalario acrescimoHorasExtras = new AcrescimoSalario(500);
        funcionario.somaSalario(acrescimoHorasExtras);

        assertEquals(6500, funcionario.getSalario(), 0.01);
    }

    @Test
    public void testSubtrairDescontos() {
        Funcionario funcionario = new Funcionario(5000);

        CalculoSalario descontoImpostos = new DescontoSalario(1000);
        funcionario.subtrairDescontos(descontoImpostos);

        CalculoSalario descontoFaltas = new DescontoSalario(200);
        funcionario.subtrairDescontos(descontoFaltas);

        assertEquals(3800, funcionario.getSalario(), 0.01);
    }

    @Test
    public void testSomarBonificacao() {
        Funcionario funcionario = new Funcionario(5000);

        CalculoSalario participacaoLucros = new BonificacaoSalario(1000);
        funcionario.somarBonificacao(participacaoLucros);

        CalculoSalario bonusProdutividade = new BonificacaoSalario(500);
        funcionario.somarBonificacao(bonusProdutividade);

        assertEquals(6500, funcionario.getSalario(), 0.01);
    }
}