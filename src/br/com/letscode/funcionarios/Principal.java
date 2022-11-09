package br.com.letscode.funcionarios;

import java.math.BigDecimal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {




        Scanner sc = new Scanner (System.in);
        System.out.println("Bem vindo digite o nome do funcionário: ");
        String nome = sc.next();
        System.out.println("Digite o numero do CPF: ");
        String cpf = sc.next();
        System.out.println("Digite o numero do Salario: ");
        BigDecimal salario = sc.nextBigDecimal();
        System.out.println("Digite a quantidade de dias trabalhos: ");
        int diasTrabalhados = sc.nextInt();


        Funcionario Funcionario = new Funcionario(nome, cpf, salario);

        BigDecimal salarioCalculado = Funcionario.calcularSalario(diasTrabalhados);

        System.out.printf("O seu salário a receber é de: R$ %.2f  \n" , salarioCalculado);

        System.out.println("Objeto funcionário: " + Funcionario.toString());

        System.out.println("HashCode funcionário: " + Funcionario.hashCode());


    }
}
