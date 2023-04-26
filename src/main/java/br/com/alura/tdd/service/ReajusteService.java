package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.enuns.Desempenho;

import java.math.BigDecimal;

public class ReajusteService {

    private static final String VALORTRES = "0.03";
    private static final String VALORDEZ = "0.10";
    private static final String VALORVINTE = "0.20";

    public Funcionario concederReajuste(Funcionario funcionario, Desempenho aDesejar) {

        BigDecimal valor = funcionario.getSalario();
        BigDecimal resultado;
        BigDecimal resulta;

        switch (aDesejar) {
            case A_DESEJAR:
                BigDecimal valorADesejar = new BigDecimal(VALORTRES);
                resultado = valor.multiply(valorADesejar);
                resulta = resultado.add(funcionario.getSalario());
                funcionario.setSalario(resulta);
                break;
            case BOM:
                BigDecimal valorBom = new BigDecimal(VALORDEZ);
                resultado = valor.multiply(valorBom);
                resulta = resultado.add(funcionario.getSalario());
                funcionario.setSalario(resulta);
                break;
            case OTIMO:
                BigDecimal valorOtimo = new BigDecimal(VALORVINTE);
                resultado = valor.multiply(valorOtimo);
                resulta = resultado.add(funcionario.getSalario());
                funcionario.setSalario(resulta);
                break;
        }

        return funcionario;
    }
}
