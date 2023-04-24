package modelo;

import br.com.alura.tdd.modelo.Caculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {


    @Test
    public void deveriSomarDoirNumerosPositivos() {
        Caculadora calc = new Caculadora();
        int somar  = calc.somar(3, 7);

        assertEquals(10, somar);
    }
}
