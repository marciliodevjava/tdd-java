package service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enuns.Desempenho;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    private static final String NOME_FUNCIONARIO = "Pedro";
    private static final BigDecimal SALARIO_BASICO = BigDecimal.valueOf(1300);
    private static final BigDecimal SALARIO_MEDIO = BigDecimal.valueOf(2500);
    private static final BigDecimal SALARIO_BOM = BigDecimal.valueOf(4500);

    @Test
    void reajusteFuncionarioADesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario(NOME_FUNCIONARIO, LocalDate.now(), SALARIO_BASICO);

        Funcionario result = service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1339.00"), result.getSalario());
    }

    @Test
    void reajusteFuncionarioBom(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario(NOME_FUNCIONARIO, LocalDate.now(), SALARIO_MEDIO);

        Funcionario result = service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("2750.00"), result.getSalario());
    }

    @Test
    void reajusteFuncionarioOtimo(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario(NOME_FUNCIONARIO, LocalDate.now(), SALARIO_BOM);

        Funcionario result = service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("5400.00"), result.getSalario());
    }
}
