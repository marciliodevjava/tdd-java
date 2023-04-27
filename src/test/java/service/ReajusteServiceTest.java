package service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enuns.Desempenho;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    private static final String NOME_FUNCIONARIO = "Pedro";
    private static final BigDecimal SALARIO_BASICO = BigDecimal.valueOf(1300);
    private static final BigDecimal SALARIO_MEDIO = BigDecimal.valueOf(2500);
    private static final BigDecimal SALARIO_BOM = BigDecimal.valueOf(4500);
    private final ReajusteService service = new ReajusteService();
    private Funcionario funcionario;
    private static int teste = 1;

    @BeforeAll
    public static void antesDeTodos(){
        System.out.println("Inicializando o teste ReajusteServiceTest");
    }

    @BeforeEach
    public void inicializar(){
        System.out.println("Teste Inicializado Nº: " + teste);
        teste += 1;
    }

    @BeforeAll
    public static void finalizar(){
        System.out.println("Teste Inicializado.");
    }
    @AfterAll
    public static void fimDeTodos(){
        System.out.println("Finalizado os teste ReajusteServiceTest");
    }

    @Test
    void reajusteFuncionarioADesejar(){
        funcionario = new Funcionario(NOME_FUNCIONARIO, LocalDate.now(), SALARIO_BASICO);

        Funcionario result = service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1339.00"), result.getSalario());
    }

    @Test
    void reajusteFuncionarioBom(){
        funcionario = new Funcionario(NOME_FUNCIONARIO, LocalDate.now(), SALARIO_MEDIO);

        Funcionario result = this.service.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("2750.00"), result.getSalario());
    }

    @Test
    void reajusteFuncionarioOtimo(){
        funcionario = new Funcionario(NOME_FUNCIONARIO, LocalDate.now(), SALARIO_BOM);

        Funcionario result = service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("5400.00"), result.getSalario());
    }
}
