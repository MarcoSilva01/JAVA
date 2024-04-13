package Program;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite a quantidade de funcionarios: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionario " + i + ": ");
            System.out.print("Funcionario Tercerizado?(y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            if(ch == 'y') {
                System.out.print("Digite taxa adicional: ");
                double adicionalTaxa = sc.nextDouble();
                Funcionario funcionario = new FuncionarioTercerizado(name,valorHora,horas,adicionalTaxa);
                funcionarios.add(funcionario);
            }else{
                Funcionario funcionario = new Funcionario(name,valorHora,horas);
                funcionarios.add(funcionario);
            }
        }
        System.out.println();
        System.out.println("Pagamentos");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getName() + " - $ " + funcionario.pagamento());
        }
        sc.close();

    }
}
