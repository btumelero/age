/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Métodos criar, temRecursos, gastaRecursosDefinePosicao
 * @author Bruno
 */
public abstract class Criam extends Construcoes{
  
  /**
   * Cria uma unidade. Sobreescrito pelas subclasses
   */
  protected void criar(){
    //todos os métodos atacar seguem a mesma lógica, apenas mudando a unidade criada conforme a construção
    //1º: checa se a civilização não está extinta
    //2º: checa se há recursos suficientes
    //3º: checa se há capacidade para criar a unidade
    //se todas as checagem acima retornarem veradadeiro:
    //4º: gasta os recursos e define a posição da unidade
    //5º: adiciona no array
  }
  
  /**
   * Checa se a civilização possui recursos suficientes para criar
   * @param civili civilização que tera seus recursos checados
   * @param unidade unidade deseja-se criar
   * @return true se há recursos suficiente, senão false
   */
  protected boolean temRecursos(Civilizacao civili, Unidades unidade){
    for (int i=0; i<3; i++) {
      if (civili.recursosCMO[i]<unidade.custoCMO[i]) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * Gasta os recursos para criar a unidade escolhida e atribui a posição da construção usada para criá-la a ela
   * @param civili Civilização que terá seus recursos gastos 
   * @param unidade Unidade cujo custo será descontado dos recursos
   * @param x posição no eixo X onde a unidade será criada
   * @param y posição no eixo Y onde a unidade será criada
   */
  protected void gastaRecursosDefinePosicao(Civilizacao civili, Unidades unidade, double x, double y){
    for (int i=0; i<3; i++) {
      civili.recursosCMO[i] -= unidade.custoCMO[i];
    }
    unidade.x = x;
    unidade.y = y;
  }
  
}
