class FuncionarioTerceirizado extends Funcionario {
    private double adicionalTerceirizado;

    public FuncionarioTerceirizado(String nome, double salarioPorHora, int horasTrabalhadasPorMes, double adicionalTerceirizado) {
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
        this.adicionalTerceirizado = adicionalTerceirizado;
    }

    public double calcularSalarioMensal() {
        return (getSalarioPorHora() * getHorasTrabalhadasPorMes()) + adicionalTerceirizado;
    }
}