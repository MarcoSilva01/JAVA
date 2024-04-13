package entities;

public class FuncionarioTercerizado extends Funcionario{
    private double adicionalSalario;

    public FuncionarioTercerizado() {
        super();
    }
    public FuncionarioTercerizado(String name, double salarioPorHora, Integer hours, double adicionalSalario) {
        super(name, salarioPorHora, hours);
        this.adicionalSalario = adicionalSalario;
    }

    public double getAdicionalSalario() {
        return adicionalSalario;
    }

    public void setAdicionalSalario(double adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }
    @Override
    public double pagamento(){
        return  super.pagamento() + adicionalSalario * 1.1;
    }
}
