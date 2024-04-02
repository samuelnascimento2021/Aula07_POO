class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadasPorMes;

    public Funcionario(String nome, double salarioPorHora, int horasTrabalhadasPorMes) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNomeFuncionario(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadasPorMes() {
        return horasTrabalhadasPorMes;
    }

    public void setHorasTrabalhadasPorMes(int horasTrabalhadasPorMes) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }
}