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
public class Quartel extends Criam{
  
  /**
   * Cria a unidade desejada na civilização escolhida 
   * @param civili Civilização que receberá a nova unidade
   * @param tipo Tipo de unidade a ser criada
   */
  public void criar(TipoUnidade tipo, Civilizacao civili){ //comentários na classe Criam
    if (civili.extinta==false) {
      if (civili.popAtual<civili.popMax) {
        if (tipo==TipoUnidade.ARQUEIRO) {
          Arqueiro arqueiro = new Arqueiro();
          if (temRecursos(civili, arqueiro)==true) {
            gastaRecursosDefinePosicao(civili, arqueiro, x, y);
            civili.popAtual++;
            civili.unidades.get(TipoUnidade.ARQUEIRO).add(arqueiro);
            System.out.println("Um Arqueiro foi criado na civilização " + civili.nroCivili);
          } else {
            System.out.println("Você não possui recursos suficientes");
          }
        } else {
          if (tipo==TipoUnidade.CAVALEIRO) {
            Cavaleiro cavaleiro = new Cavaleiro();
            if (temRecursos(civili, cavaleiro)==true) {
              gastaRecursosDefinePosicao(civili, cavaleiro, x, y);
              civili.popAtual++;
              civili.unidades.get(TipoUnidade.CAVALEIRO).add(cavaleiro);
              System.out.println("Um Cavaleiro foi criado na civilização " + civili.nroCivili);
            } else {
              System.out.println("Você não possui recursos suficientes");
            }
          } else {
            if (tipo==TipoUnidade.ELEFANTE) {
              if (civili.tipo==TipoCivilizacao.EGÍPCIA) {
                Elefante elefante = new Elefante();
                if (temRecursos(civili, elefante)==true) {
                  gastaRecursosDefinePosicao(civili, elefante, x, y);
                  civili.popAtual++;
                  civili.unidades.get(TipoUnidade.ELEFANTE).add(elefante);
                  System.out.println("Um Elefante foi criado na civilização " + civili.nroCivili);
                } else {
                  System.out.println("Você não possui recursos suficientes");
                }
              } else {
                System.out.println("Apenas Egípcios podem criar elefantes");
              }
            } else {
              if (tipo==TipoUnidade.FALANGE) {
                if (civili.tipo==TipoCivilizacao.GREGA) {
                  Falange falange = new Falange();
                  if (temRecursos(civili, falange)==true) {
                    gastaRecursosDefinePosicao(civili, falange, x, y);
                    civili.popAtual++;
                    civili.unidades.get(TipoUnidade.FALANGE).add(falange);
                    System.out.println("Uma Falange foi criada na civilização " + civili.nroCivili);
                  } else {
                    System.out.println("Você não possui recursos suficientes");
                  }
                } else {
                  System.out.println("Apenas Gregos podem criar falanges");
                }
              } else {
                if (tipo==TipoUnidade.GUERREIRO) {
                  Guerreiro guerreiro = new Guerreiro();
                  if (temRecursos(civili, guerreiro)==true) {
                    gastaRecursosDefinePosicao(civili, guerreiro, x, y);
                    civili.popAtual++;
                    civili.unidades.get(TipoUnidade.GUERREIRO).add(guerreiro);
                    System.out.println("Um Guerreiro foi criado na civilização " + civili.nroCivili);
                  } else {
                    System.out.println("Você não possui recursos suficientes");
                  }
                } else {
                  System.out.println("Esta construção não pode criar esta unidade");
                }
              }
            }
          }
        }
      } else {
        System.out.println("Você não possui espaço para adicionar mais unidades");
      }
    } else {
      System.out.println("Uma civilização extinta não pode criar novas unidades");
    }
  }
  
  
  Quartel(){
    custoCMO[1] = 125; //madeira
    vida = 600;
    imagem = TipoImagem.QUARTEL;
  }
}
