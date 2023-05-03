public class Compromisso {

  private String nome;
  private Data dataInicio;
  private Data dataTermino;
  private Horario horaInicio;
  private Horario horaTermino;

  public Compromisso(String nome, Data dataInicio, Data dataTermino,
                     Horario horaInicio, Horario horaTermino) {
    this.nome = nome;
    this.dataInicio = dataInicio;
    this.dataTermino = dataTermino;
    this.horaInicio = horaInicio;
    this.horaTermino = horaTermino;
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
    return horaInicio;
  }

  public void setHoraInicio(Horario horaInicio) {
    this.horaInicio = horaInicio;
  }

  public Horario getHoraTermino() {
    return horaTermino;
  }

  public void setHoraTermino(Horario horaTermino) {
    this.horaTermino = horaTermino;
  }

}
