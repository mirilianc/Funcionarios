package br.com.letscode.funcionarios;

import java.math.BigDecimal;
import java.util.Objects;
import java.math.RoundingMode;

public class Funcionario extends Object{

    private String nomeFuncionario;
    private String cpfFuncionario;
    private BigDecimal salarioFuncionario;

    public Funcionario(String nomeFuncionario, String cpfFuncionario, BigDecimal salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public BigDecimal calcularSalario (int diasTrabalhados){

        BigDecimal salarioCalculado = salarioFuncionario.divide(BigDecimal.valueOf(30), 4, RoundingMode.HALF_EVEN)
                .multiply(BigDecimal.valueOf(diasTrabalhados))
                .setScale(2, RoundingMode.HALF_EVEN);

        return salarioCalculado;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nomeFuncionario='").append(nomeFuncionario).append('\'');
        sb.append(", cpfFuncionario='").append(cpfFuncionario).append('\'');
        sb.append(", salarioFuncionario=").append(salarioFuncionario);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return cpfFuncionario.equals(that.cpfFuncionario);
    }



    @Override
    public int hashCode() {
        return Objects.hash(nomeFuncionario, cpfFuncionario, salarioFuncionario);
    }


    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public BigDecimal getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(BigDecimal salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
