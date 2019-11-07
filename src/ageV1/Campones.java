/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Métodos Construir, Colher, Cortar, Minerar, temRecursos, gastaRecursosDefinePosicao + Construtor
 * @author Bruno
 */
public class Campones extends Atacam
                      implements InterfaceAtaca{
  
  /**
   * Cria uma construção em uma posição designada para a civilização escolhida 
   * @param x posição no eixo X onde a construção será feita
   * @param y posição no eixo Y onde a construção será feita
   * @param tipo tipo de construção que será feita
   * @param civili civilização em será construida
   */
  public void construir(double x, double y, TipoConstrucao tipo, Civilizacao civili){
    if (tipo==TipoConstrucao.CASA) {          //Se tiver recursos para criar a construção, gasta os
      Casa casa = new Casa();                 //recursos e define a posição, coloca no array e 
      if (temRecursos(civili, casa)==true) {  //aumenta popmax caso seja casa/centro
        gastaRecursosDefinePosicao(civili, casa, x, y);
        civili.construcoes.get(TipoConstrucao.CASA).add(casa);
        civili.popMax += Casa.popMax;
        System.out.println("Uma Casa foi construída na civilização " + civili.nroCivili);
      } else {
        System.out.println("Você não possui recursos suficientes");
      }
    } else {
      if (tipo==TipoConstrucao.CENTRO) {
        Centro centro = new Centro();
        if (temRecursos(civili, centro)==true) {
          gastaRecursosDefinePosicao(civili, centro, x, y);
          civili.construcoes.get(TipoConstrucao.CENTRO).add(centro);
          civili.popMax += Centro.popMax;
          System.out.println("Um Centro da Cidade foi construído na civilização " + civili.nroCivili);
        } else {
          System.out.println("Você não possui recursos suficientes");
        }
      } else {
        if (tipo==TipoConstrucao.QUARTEL) {
          Quartel quartel = new Quartel();
          if (temRecursos(civili, quartel)==true) {
            gastaRecursosDefinePosicao(civili, quartel, x, y);
            civili.construcoes.get(TipoConstrucao.QUARTEL).add(quartel);
            System.out.println("Um Quartel foi construído na civilização " + civili.nroCivili);
          } else {
            System.out.println("Você não possui recursos suficientes");
          }
        } else {
          if (tipo==TipoConstrucao.TEMPLO) {
            Templo templo = new Templo();
            if (temRecursos(civili, templo)==true) {
              gastaRecursosDefinePosicao(civili, templo, x, y);
              civili.construcoes.get(TipoConstrucao.TEMPLO).add(templo);
              System.out.println("Um Templo foi construído na civilização " + civili.nroCivili);
            } else {
              System.out.println("Você não possui recursos suficientes");
            }
          } else {
            Torre torre = new Torre();
            if (temRecursos(civili, torre)==true) {
              gastaRecursosDefinePosicao(civili, torre, x, y);
              civili.construcoes.get(TipoConstrucao.TORRE).add(torre);
              System.out.println("Uma Torre foi construída na civilização " + civili.nroCivili);
            } else {
              System.out.println("Você não possui recursos suficientes");
            }
          }
        }
      }
    }
  }
  
  /**
   * Colhe uma unidade de comida
   * @param civili civilização que receberá o recurso
   */
  public void colher(Civilizacao civili){
    civili.recursosCMO[0]++;
    System.out.println("Camponês colheu uma unidade de comida na civilização " + civili.nroCivili);
  }
  
  /**
   * Colhe uma unidade de madeira
   * @param civili civilização que receberá o recurso
   */
  public void cortar(Civilizacao civili){
    civili.recursosCMO[1]++;
    System.out.println("Camponês cortou uma unidade de madeira na civilização " + civili.nroCivili);
  }
  
  /**
   * Colhe uma unidade de ouro
   * @param civili civilização que receberá o recurso
   */
  public void minerar(Civilizacao civili){
    civili.recursosCMO[2]++;
    System.out.println("Camponês minerou uma unidade de ouro na civilização " + civili.nroCivili);
  }
  
  /**
   * Checa se a civilização possui recursos suficientes para construir
   * @param civili civilização que tera seus recursos checados
   * @param construcao Construção deseja-se construir
   * @return true se há recursos suficiente, senão false
   */
  private boolean temRecursos(Civilizacao civili, Construcoes construcao){
    for (int i=0; i<3; i++) {
      if (civili.recursosCMO[i]<construcao.custoCMO[i]) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * Gasta os recursos para construir a construção escolhida e atribui a posição escolhida para ela
   * @param civili Civilização que terá seus recursos gastos 
   * @param construcao Construção cujo custo será descontado dos recursos
   * @param x posição no eixo X onde a construção será feita
   * @param y posição no eixo Y onde a construção será feita
   */
  private void gastaRecursosDefinePosicao(Civilizacao civili, Construcoes construcao, double x, double y){
    for (int i=0; i<3; i++) {
      civili.recursosCMO[i] -= construcao.custoCMO[i];
    }
    construcao.x = x;
    construcao.y = y;
  }
  
  Campones(){
    armadura = 0;
    ataque = 3;
    custoCMO[0] = 50; //comida
    velocidade = 2.0;
    vida = 50;
    imagem = TipoImagem.CAMPONES;
  }
}
