/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Método criar + Construtor
 * @author Bruno
 */
public class Templo extends Criam{
  
  /**
   * cria um sacerdote na civilização escolhida
   * @param civili Civilização que receberá a nova unidade
   */
  public void criar(Civilizacao civili){  //comentários na classe Criam
    Sacerdote sacerdote = new Sacerdote();
    if (civili.extinta==false) {
      if (temRecursos(civili, sacerdote)==true) {
        if (civili.popAtual<civili.popMax) {
          gastaRecursosDefinePosicao(civili, sacerdote, x, y);
          civili.popAtual++;
          civili.unidades.get(TipoUnidade.SACERDOTE).add(sacerdote);
          System.out.println("Um Sacerdote foi criado na civilização " + civili.nroCivili);
        } else {
          System.out.println("Você não possui espaço para adicionar mais unidades");
        }
      } else {
        System.out.println("Você não possui recursos suficientes");
      }
    } else {
      System.out.println("Uma civilização extinta não pode criar novas unidades");
    }
  }
  
  Templo(){
    custoCMO[1] = 250;
    vida = 350;
    imagem = TipoImagem.TEMPLO;
  }
}
