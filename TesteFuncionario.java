public class TesteFuncionario {

    public static void main(String[] args) {

        FuncionarioRegular r1 = new FuncionarioRegular("Marcos", 40.0, 280);
        FuncionarioRegular r2 = new FuncionarioRegular("Vitória", 55.0, 200);

        System.out.println("Detalhes dos Funcionários Regulares:");
        System.out.println("Nome: " + r1.getNome() +
                ", Salário Mensal: R$" + r1.calcularSalarioMensal());
        System.out.println("Nome: " + r2.getNome() +
                ", Salário Mensal: R$" + r2.calcularSalarioMensal());

        FuncionarioTerceirizado t1 = new FuncionarioTerceirizado("José", 44.0, 170, 2000);
        FuncionarioTerceirizado t2 = new FuncionarioTerceirizado("Jaqueline", 50.0, 200, 3000);

        System.out.println("\nDetalhes dos funcionários terceirizados:");
        System.out.println("Nome: " + t1.getNome() + ", Salário Mensal: R$" + t1.calcularSalarioMensal());
        System.out.println("Nome: " + t2.getNome() + ", Salário Mensal: R$" + t2.calcularSalarioMensal());
    }
}