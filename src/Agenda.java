import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

  public static final List<Compromisso> listaCompromissos = new ArrayList<>();

  public static void addCompromisso(Compromisso c){
    char resposta = 'n';
    if (!verificarDisponibilidade(c)){

        System.out.println("\n\nO compromisso que pretende adicionar" +
                    " sobrepoe um compromisso já existente pretende continuar?\n" +
                            "(digite 's' para sim 'n' para não)");
        resposta = Menu.sc.nextLine().toLowerCase().charAt(0);
      System.out.println("\n\n\n"+resposta+"\n\n\n");
    }
    if ( 's' ==  resposta || verificarDisponibilidade(c) ){
        listaCompromissos.add(c);
    }

  }

  private static boolean verificarDisponibilidade(Compromisso comp) {
    for ( Compromisso c: listaCompromissos) {
      if (comp.getDataInicio().getDia() == c.getDataInicio().getDia() &&
        comp.getDataInicio().getMes() == c.getDataInicio().getMes() &&
        comp.getDataInicio().getAno() == c.getDataInicio().getAno() &&
        comp.getHoraInicio().getHora() == c.getHoraInicio().getHora() &&
        comp.getHoraInicio().getMinuto() >= c.getHoraInicio().getMinuto() ){
        return false;
      }
    }
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
