public class Compromisso {
  private String nome;
  private Data dataInicio;
  private Data dataTermino;
  private Horario horarioInicio;
  private Horario horarioTermino;

  // Sobrecarga dois metodos iguais com formas diferentes de instanciacao
  public Compromisso(String nome, Data dataInicio, Data dataTermino,
                     Horario horaInicio, Horario horaTermino) {
    this.nome = nome;
    this.dataInicio = dataInicio;
    this.dataTermino = dataTermino;
    this.horarioInicio = horaInicio;
    this.horarioTermino = horaTermino;
    Agenda.addCompromisso(this);
  }
  public Compromisso(String nome, int diaDataInicial, int mesDataInicial, int anoDataInicial,
                     int diaDataFinal, int mesDataFinal, int anoDataFinal,
                     int horaInicial, int minutosInicial, int horaTermino, int minutosTermino) {
    this.nome = nome;
    this.dataInicio = new Data(diaDataInicial, mesDataInicial, anoDataInicial);
    this.dataTermino =  new Data(diaDataFinal, mesDataFinal, anoDataFinal);
    this.horarioInicio = new Horario(horaInicial,minutosInicial);
    this.horarioTermino = new Horario(horaTermino, minutosTermino);
    Agenda.addCompromisso(this);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Data getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(Data dataInicio) {
    this.dataInicio = dataInicio;
  }

  public Data getDataTermino() {
    return dataTermino;
  }

  public void setDataTermino(Data dataTermino) {
    this.dataTermino = dataTermino;
  }

  public Horario getHoraInicio() {
    return horarioInicio;
  }

  public void setHoraInicio(Horario horaInicio) {
    this.horarioInicio = horaInicio;
  }

  public Horario getHoraTermino() {
    return horarioTermino;
  }

  public void setHoraTermino(Horario horaTermino) {
    this.horarioTermino = horaTermino;
  }

}
