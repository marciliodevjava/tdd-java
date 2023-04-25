package service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioMuitoAlto(){

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal(24000)));

        assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    void bonusDeveriaSer10ParaFuncionario(){

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal(2500)));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonus(){

        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal(10000)));

        assertEquals(new BigDecimal("0.00"), bonus);
    }
}
