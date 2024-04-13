package entities;

public class Funcionario {
    private String name;
    private double salarioPorHora;
    private Integer hours;

    public Funcionario(String name, double salarioPorHora, Integer hours) {
        this.name = name;
        this.salarioPorHora = salarioPorHora;
        this.hours = hours;
    }

    public Funcionario() {

    }

    public double pagamento(){
        return  salarioPorHora * hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
