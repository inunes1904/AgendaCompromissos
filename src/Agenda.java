import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

  public static final List<Compromisso> listaCompromissos = new ArrayList<>();

  // falta verificar se existe conflito
  public static void addCompromisso(Compromisso comp){
    char resposta = 'n';
    if (!verificarDisponibilidade()){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nO compromisso que pretende adicionar" +
                    " sobrepoe um compromisso já existente pretende continuar?\n" +
                            "(digite 's' para sim 'n' para não)");
        resposta = sc.nextLine().toLowerCase().charAt(0);
        sc.close();
    }
    if ( 's' == resposta || verificarDisponibilidade()){
        listaCompromissos.add(comp);
    }

  }

  private static boolean verificarDisponibilidade() {

    return true;
  }

  public static void imprimirCompromissos() {
    System.out.println("Lista de Compromissos:");
    System.out.println("________________________________________");
    for (Compromisso c: listaCompromissos) {
      System.out.println("Nome Compromisso: ");
      System.out.println(c.getNome());
      System.out.println("Data Inicio: ");
      System.out.println(c.getDataInicio().getDia()+"/"+
                  c.getDataInicio().getMes()+"/"+c.getDataInicio().getAno());
      System.out.println("Data Fim: ");
      System.out.println(c.getDataTermino().getDia()+"/"+
        c.getDataTermino().getMes()+"/"+c.getDataTermino().getAno());
      System.out.println("Horario Inicio: ");
      System.out.println(c.getHoraInicio().getHora()+":"+c.getHoraInicio().getMinuto());
      System.out.println("Horario Fim: ");
      System.out.println(c.getHoraTermino().getHora()+":"+c.getHoraTermino().getMinuto());
      System.out.println("________________________________________");
    }

  }
}
