public class Main {
  public static void main(String[] args) {

  // CRIAR um compromisso e mostrar
    Compromisso c = new Compromisso(
        "Compromisso Teste", new Data(3,5,2023), new Data(3,5,2023),
        new Horario( 9, 15),  new Horario( 9, 45)
    );


    Agenda.imprimirCompromissos();

  }

}
