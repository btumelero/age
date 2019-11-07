/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Método atacar para unidades de combate corpo-a-corpo
 * @author Bruno
 */
public abstract class Atacam extends Unidades{

  protected int ataque;
  
  /**
   * Ataca um alvo se ele estiver dentro do alcance
   * @param alvo Objeto a ser atacado
   * @param civiAtacada Civilização a ser atacada
   */
  public void atacar(Objetos alvo, Civilizacao civiAtacada){
    double distanciaX, distanciaY, distancia;
    distanciaX = x - alvo.x;
    distanciaY = y - alvo.y;
    distanciaX = Math.pow(distanciaX, 2.0);
    distanciaY = Math.pow(distanciaY, 2.0); //Se estiver dentro do alcance de unidades corpo-a-corpo 
    distancia = distanciaX + distanciaY;    //E o alvo for uma unidade, faz o calculo de dano usando 
    distancia = Math.sqrt(distancia);       //armadura. Se a unidade morrer, setta como morta, tira 
    if (distancia<=2) {                     //do array e diminui a popatual da civ atacada
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
      } else {                //Se o alvo for construção, faz o calculo sem armadura, setta como morta
        alvo.vida -= ataque;  //caso ela tenha morrido, tira do array, e diminui popmax se for casa/centro
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
      if (civiAtacada.popAtual==0 && civiAtacada.popMax==0) {                 //se os arrays de unidades e
        if (civiAtacada.construcoes.get(TipoConstrucao.QUARTEL).isEmpty() &&  //construções estiverem vazios
            civiAtacada.construcoes.get(TipoConstrucao.TEMPLO).isEmpty() &&   //setta como extinta e depois
            civiAtacada.construcoes.get(TipoConstrucao.TORRE).isEmpty()) {    //checa se o jogo acabou 
          civiAtacada.extinta=true;                                           //(só uma civ restando)
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
}
