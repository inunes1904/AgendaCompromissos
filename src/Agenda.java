import java.util.ArrayList;
import java.util.List;

public class Agenda {

  public static final List<Compromisso> listaCompromissos = new ArrayList<>();

  // falta verificar se existe conflito
  public static void addCompromisso(Compromisso comp){
      listaCompromissos.add(comp);
  }

  public static void imprimirCompromissos() {
    System.out.println("Lista de Compromissos:");
    System.out.println("_________________________________");
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
      System.out.println(c.getHoraTermino().getHora()+":"+c.getHoraInicio().getMinuto());
      System.out.println("_________________________________");
    }

  }
}
