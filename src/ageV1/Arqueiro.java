/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Método atacar + Construtor
 * @author Bruno
 */
public class Arqueiro extends Atacam
                      implements InterfaceAtaca{
  private final int alcance;
  
  /**
   * Ataca um alvo se ele estiver dentro do alcance
   * @param alvo Objeto a ser atacado
   * @param civiAtacada Civilização a ser atacada
   */
  @Override
  public void atacar(Objetos alvo, Civilizacao civiAtacada){  //mesmo método atacar mas levando em
    double distanciaX, distanciaY, distancia;                 //consideração o alcance do arqueiro
    distanciaX = x - alvo.x;
    distanciaY = y - alvo.y;
    distanciaX = Math.pow(distanciaX, 2.0);
    distanciaY = Math.pow(distanciaY, 2.0);
    distancia = distanciaX + distanciaY;
    distancia = Math.sqrt(distancia);
    if (distancia<=alcance) {
      if (alvo instanceof Unidades) {
        alvo.vida -= (ataque - ((Unidades) alvo).armadura);
        System.out.println(alvo.imagem + " da civilização " + civiAtacada.nroCivili + " foi atacado(a), pontos de vida: " + alvo.vida);
        if (alvo.vida<=0) {
          alvo.vivo=false;
          System.out.println(alvo.imagem + " da civilização " + civiAtacada.nroCivili + " foi morto(a)");
          civiAtacada.popAtual--;
          if (alvo instanceof Arqueiro) {
            civiAtacada.unidades.get(TipoUnidade.ARQUEIRO).remove((Unidades) alvo);
          } else {
            if (alvo instanceof Campones) {
              civiAtacada.unidades.get(TipoUnidade.CAMPONES).remove((Unidades) alvo);
            } else {
              if (alvo instanceof Cavaleiro) {
                civiAtacada.unidades.get(TipoUnidade.CAVALEIRO).remove((Unidades) alvo);
              } else {
                if (alvo instanceof Elefante) {
                  civiAtacada.unidades.get(TipoUnidade.ELEFANTE).remove((Unidades) alvo);
                } else {
                  if (alvo instanceof Falange) {
                    civiAtacada.unidades.get(TipoUnidade.FALANGE).remove((Unidades) alvo);
                  } else {
                    if (alvo instanceof Guerreiro) {
                      civiAtacada.unidades.get(TipoUnidade.GUERREIRO).remove((Unidades) alvo);
                    } else {
                      civiAtacada.unidades.get(TipoUnidade.SACERDOTE).remove((Unidades) alvo);
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        alvo.vida -= ataque;
        System.out.println(alvo.imagem + " da civilização " + civiAtacada.nroCivili + " foi atacado(a), pontos de vida: " + alvo.vida);
        if (alvo.vida<=0) {
          alvo.vivo=false;
          System.out.println(alvo.imagem + " da civilização " + civiAtacada.nroCivili + " foi destruído(a)");
          if (alvo instanceof Casa) {
            civiAtacada.popMax -= Casa.popMax;
            civiAtacada.construcoes.get(TipoConstrucao.CASA).remove((Construcoes) alvo);
          } else {
            if (alvo instanceof Centro) {
              civiAtacada.popMax -= Centro.popMax;
              civiAtacada.construcoes.get(TipoConstrucao.CENTRO).remove((Construcoes) alvo);
            } else {
              if (alvo instanceof Quartel) {
                civiAtacada.construcoes.get(TipoConstrucao.QUARTEL).remove((Construcoes) alvo);
              } else {
                if (alvo instanceof Templo) {
                  civiAtacada.construcoes.get(TipoConstrucao.TEMPLO).remove((Construcoes) alvo);
                } else {
                  civiAtacada.construcoes.get(TipoConstrucao.TORRE).remove((Construcoes) alvo);
                }
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
            int nroExtintas=0, pos=0;
            for (int i=0; i<Civilizacao.civilizacoes.size(); i++) {
              if (Civilizacao.civilizacoes.get(i).extinta==true) {
                nroExtintas++;
              } else {
                pos=i;
              }
            }
            if (nroExtintas==Civilizacao.civilizacoes.size()-1) {
              System.out.println("A civilização " + pos + " é a vencedora");
            }
          }
        }
      }
    } else {
      System.out.println("O alvo está fora de alcance");
    }
  }
  
  Arqueiro(){
    alcance = 7;
    armadura = 0;
    ataque = 5;
    custoCMO[0] = 40; //comida
    custoCMO[2] = 20; //ouro
    velocidade = 2.0;
    vida = 45;
    imagem = TipoImagem.ARQUEIRO;
  }
}
