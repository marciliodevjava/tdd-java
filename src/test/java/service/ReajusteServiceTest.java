package service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enuns.Desempenho;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    @Test
    void reajusteFuncionarioADesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("1300"));

        Funcionario result = service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1339.00"), result.getSalario());
    }

    @Test
    void reajusteFuncionarioBom(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("2500"));

        Funcionario result = service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("2750.00"), result.getSalario());
    }

    @Test
    void reajusteFuncionarioOtimo(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("4500"));

        Funcionario result = service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("5400.00"), result.getSalario());
    }
}
