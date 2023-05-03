public class Main {
  public static void main(String[] args) {

  // CRIAR um compromisso e mostrar
    Compromisso c = new Compromisso(
        "Compromisso Teste", new Data(3,5,2023), new Data(3,5,2023),
        new Horario( 9, 15),  new Horario( 9, 45)
    );

    Menu m = new Menu();

    System.out.println("----------------------------------------");
    System.out.println("--           Volte Sempre!            --");
    System.out.println("--                                    --");
    System.out.println("--               O   O                --");
    System.out.println("--                 o                  --");
    System.out.println("--            <_________>             --");
    System.out.println("--                                    --");
    System.out.println("----------------------------------------");
  }

}
