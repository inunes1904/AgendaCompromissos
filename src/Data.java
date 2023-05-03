import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

  private int dia;
  private int mes;
  private int ano;


  public Data(int dia, int mes, int ano) {
    if (verificarData(ano,mes,dia)) {
      this.ano = ano;
      this.dia = dia;
      this.mes = mes;
    }else{
      System.out.println("Data é inválida");
    }
  }

  public boolean verificarData(int ano, int mes, int dia){
    if (ano < 0 || mes < 0 || mes > 12 || dia > 31 || dia < 0 ) return false;
    int dias = diasPossiveis(mes, ano);
    if ( dia >  dias || dias == 0) return false;
    return true;
  }

  public int diasPossiveis(int mes, int ano){

    int dias = 0;

    List<Integer> dias31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
    List<Integer> dias30 = Arrays.asList(4, 6, 9, 11);

    if (dias31.contains(mes)){
      dias = 31;
    } else if (dias30.contains(mes)){
      dias = 30;
    }else{
      if (!bissexto(ano)){
        dias = 28;
      }else{
        dias = 29;
      }
    }
    return dias;

  }

  boolean bissexto(int ano) {
    return (ano % 400 == 0) || ((ano % 100 != 0) && (ano % 4 == 0));
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
}
