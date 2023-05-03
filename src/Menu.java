import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

        boolean programOn = true;
        public Scanner sc = new Scanner(System.in);
        int op;

        public Menu() {

          while (programOn) {

            System.out.println("----------------------------------------");
            System.out.println(" 1 - Mostrar todos os compromissos");
            System.out.println(" 2 - Adicionar Compromisso");
            System.out.println(" 0 - Sair");
            System.out.println("----------------------------------------");

            op = sc.nextInt();
            menuSwitch();
          }
        }
        public void menuSwitch(){
            switch (op){
              case 1:
                Agenda.imprimirCompromissos();
                return;
              case 2:
                menuNovoCompromisso();
                return;
              case 0:
                sc.close();
                this.programOn = false;
              default:
                break;
            }
          }

  private void menuNovoCompromisso() {

    try {
    System.out.println("----------------------------------------");
    System.out.print("Introduz o nome do compromisso: ");
    String nomeCompromisso = sc.nextLine();
    sc.next();
    System.out.print("Data de inicio no seguinte formato(d/m/A):");
    String[] dataInicio = sc.nextLine().split("/");
    System.out.print("Data de termino no formato(d/m/A): ");
    String[] dataFim = sc.nextLine().split("/");
    System.out.print("Horario inicio no formato (H:M):");
    String[] horarioInicio = sc.nextLine().split(":");
    System.out.print("Horario termino no formato (H:M):");
    String[] horarioFim = sc.nextLine().split(":");
    System.out.println("----------------------------------------");
      Compromisso n = new Compromisso(
        nomeCompromisso, // nome
        Integer.parseInt(dataInicio[0]) , Integer.parseInt(dataInicio[1]), Integer.parseInt(dataInicio[2]), //data inicio
        Integer.parseInt(dataFim[0]) , Integer.parseInt(dataFim[1]), Integer.parseInt(dataFim[2]), // data fim
        Integer.parseInt(horarioInicio[0]), Integer.parseInt(horarioInicio[1]), // horario inicio
        Integer.parseInt(horarioFim[0]), Integer.parseInt(horarioFim[1]) // horario fim
      );
    } catch (Exception e) {
      System.out.println("Não foi possivel adicionar o novo compromisso tente novamente");
    }
  }

}
