/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Método converteInimigo + Construtor
 * @author Bruno
 */
public class Sacerdote extends Unidades{
  int alcance;
  
  /**
   * Converte uma unidade ou construção inimiga para a civilização do sacerdote
   * @param alvo alvo a ser convertido
   * @param civiAtacada civilização alvo da conversão
   * @param civiSacer civilização convertendo
   */
  public void converteInimigo(Objetos alvo, Civilizacao civiAtacada, Civilizacao civiSacer){
    double distanciaX, distanciaY, distancia; //se o alvo a ser convertido estiver dentro do alcance e
    distanciaX = x - alvo.x;                  //se houver popmax suficiente, adiciona o alvo para o array
    distanciaY = y - alvo.y;                  //da civ do sacerdote e remove o mesmo do array da civ atacada
    distanciaX = Math.pow(distanciaX, 2.0);   //mudando as popatual das duas no processo se for unidade
    distanciaY = Math.pow(distanciaY, 2.0);   //ou popmax se for casa/centro.
    distancia = distanciaX + distanciaY;      //também é checado se a civ atacada foi extinta
    distancia = Math.sqrt(distancia);
    if (distancia<=alcance) {
      if (alvo instanceof Unidades) {
        if (civiSacer.popAtual<civiSacer.popMax) {
          civiSacer.popAtual++;
          civiAtacada.popAtual--;
          if (alvo instanceof Arqueiro) {
            civiSacer.unidades.get(TipoUnidade.ARQUEIRO).add((Unidades) alvo);
            civiAtacada.unidades.get(TipoUnidade.ARQUEIRO).remove((Unidades) alvo);
            System.out.println("Um Arqueiro foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
          } else {
            if (alvo instanceof Campones) {
              civiSacer.unidades.get(TipoUnidade.CAMPONES).add((Unidades) alvo);
              civiAtacada.unidades.get(TipoUnidade.CAMPONES).remove((Unidades) alvo);
              System.out.println("Um Camponês foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
            } else {
              if (alvo instanceof Cavaleiro) {
                civiSacer.unidades.get(TipoUnidade.CAVALEIRO).add((Unidades) alvo);
                civiAtacada.unidades.get(TipoUnidade.CAVALEIRO).remove((Unidades) alvo);
                System.out.println("Um Cavaleiro foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
              } else {
                if (alvo instanceof Elefante) {
                  civiSacer.unidades.get(TipoUnidade.ELEFANTE).add((Unidades) alvo);
                  civiAtacada.unidades.get(TipoUnidade.ELEFANTE).remove((Unidades) alvo);
                  System.out.println("Um Elefante foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
                } else {
                  if (alvo instanceof Falange) {
                    civiSacer.unidades.get(TipoUnidade.FALANGE).add((Unidades) alvo);
                    civiAtacada.unidades.get(TipoUnidade.FALANGE).remove((Unidades) alvo);
                    System.out.println("Uma Falange foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
                  } else {
                    if (alvo instanceof Guerreiro) {
                      civiSacer.unidades.get(TipoUnidade.GUERREIRO).add((Unidades) alvo);
                      civiAtacada.unidades.get(TipoUnidade.GUERREIRO).remove((Unidades) alvo);
                      System.out.println("Um Guerreiro foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
                    } else {
                      civiSacer.unidades.get(TipoUnidade.SACERDOTE).add((Unidades) alvo);
                      civiAtacada.unidades.get(TipoUnidade.SACERDOTE).remove((Unidades) alvo);
                      System.out.println("Um Sacerdote foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
                    }
                  }
                }
              }
            }
          }
        } else {
          System.out.println("Você não possui espaço para adicionar mais unidades");
        }
      } else {
        if (alvo instanceof Casa) {
          civiSacer.popMax += Casa.popMax;
          civiAtacada.popMax -= Casa.popMax;
          civiSacer.construcoes.get(TipoConstrucao.CASA).add((Construcoes) alvo);
          civiAtacada.construcoes.get(TipoConstrucao.CASA).remove((Construcoes) alvo);
          System.out.println("Uma Casa foi convertida da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
        } else {
          if (alvo instanceof Centro) {
            civiSacer.popMax += Centro.popMax;
            civiAtacada.popMax -= Centro.popMax;
            civiSacer.construcoes.get(TipoConstrucao.CENTRO).add((Construcoes) alvo);
            civiAtacada.construcoes.get(TipoConstrucao.CENTRO).remove((Construcoes) alvo);
            System.out.println("Um Centro da Cidade foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
          } else {
            if (alvo instanceof Quartel) {
              civiSacer.construcoes.get(TipoConstrucao.QUARTEL).add((Construcoes) alvo);
              civiAtacada.construcoes.get(TipoConstrucao.QUARTEL).remove((Construcoes) alvo);
              System.out.println("Um Quartel foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
            } else {
              if (alvo instanceof Templo) {
                civiSacer.construcoes.get(TipoConstrucao.TEMPLO).add((Construcoes) alvo);
                civiAtacada.construcoes.get(TipoConstrucao.TEMPLO).remove((Construcoes) alvo);
                System.out.println("Um Templo foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
              } else {
                civiSacer.construcoes.get(TipoConstrucao.TORRE).add((Construcoes) alvo);
                civiAtacada.construcoes.get(TipoConstrucao.TORRE).remove((Construcoes) alvo);
                System.out.println("Uma Torre foi convertido da civilização " + civiAtacada.nroCivili + " para a civilização " + civiSacer.nroCivili);
              }
            }
          }
        }
      }
      if (civiAtacada.popAtual==0 && civiAtacada.popMax==0) {
        if (civiAtacada.construcoes.get(TipoConstrucao.QUARTEL).isEmpty() &&
            civiAtacada.construcoes.get(TipoConstrucao.TEMPLO).isEmpty() &&
            civiAtacada.construcoes.get(TipoConstrucao.TORRE).isEmpty()) {
          civiAtacada.extinta=true;
          System.out.println("A civilização " + civiAtacada.nroCivili + " foi extinta!");
          if (civiAtacada.extinta==true) {
            int nroExtintas=0;
            for (int i=0; i<Civilizacao.civilizacoes.size(); i++) {
              if (Civilizacao.civilizacoes.get(i).extinta==true) {
                nroExtintas++;
              }
            }
            if (nroExtintas==Civilizacao.civilizacoes.size()-1) {
              System.out.println("A civilização " + civiSacer.nroCivili + " é a vencedora");
            }
          }
        }
      }
    } else {
      System.out.println("O alvo está fora de alcance");
    }
  }
  
  Sacerdote(){
    alcance = 10;
    armadura = 0;
    custoCMO[2] = 125; //ouro
    velocidade = 1.0;
    vida = 25;
    imagem = TipoImagem.SACERDOTE;
  }
}
