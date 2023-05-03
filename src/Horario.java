public class Horario {

  private int hora;
  private int minuto;


  public Horario(int hora, int minuto) {
    if (verificarHorario(hora,minuto)) {
      this.hora = hora;
      this.minuto = minuto;
    }else{
      System.out.println("Horário é inválido");
    }
  }

  private boolean verificarHorario(int hora, int minuto) {
    if (hora >= 0 && hora <= 23 &&
      minuto >= 0 && minuto <= 59) return true;
    return false;
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }


}
