/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

import java.util.Arrays;

/**
 * Main: Possui todos os testes feitos prontos para execução.
 * Duas civilizações são criadas (uma grega e outra egípcia), e em seguida os seguintes testes são feitos:
 * Criar todos tipos de unidades e construções nas duas civilizações
 * Mover uma unidade em todas as direções
 * Atacar uma construção à distância dentro e fora de alcance
 * Atacar uma unidade corpo-a-corpo dentro e fora de alcance
 * Conversão de uma unidade
 * Colher, cortar e minerar
 * Construindo sem recursos suficientes
 * Criando uma unidade sem recursos suficientes
 * Criar uma unidade sem capacidade suficiente
 * Matar uma unidade
 * Destruir uma onstrução
 * Extinguir uma civilização
 * @author Bruno
 */
public class Age {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Civilizacao civi1 = new Civilizacao(TipoCivilizacao.GREGA);
    Civilizacao civi2 = new Civilizacao(TipoCivilizacao.EGÍPCIA);
    
    for (int i=0; i<Civilizacao.civilizacoes.size(); i++) {
      System.out.println("\nCriando na civilização " + (i+1));
      System.out.println("\nCriando Construções:\n");
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Campones) Civilizacao.civilizacoes.get(i).unidades.get(TipoUnidade.CAMPONES).get(0)).construir(0.0, 0.0, TipoConstrucao.CASA, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Campones) Civilizacao.civilizacoes.get(i).unidades.get(TipoUnidade.CAMPONES).get(0)).construir(0.0, 0.0, TipoConstrucao.CENTRO, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Campones) Civilizacao.civilizacoes.get(i).unidades.get(TipoUnidade.CAMPONES).get(0)).construir(0.0, 0.0, TipoConstrucao.QUARTEL, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Campones) Civilizacao.civilizacoes.get(i).unidades.get(TipoUnidade.CAMPONES).get(0)).construir(0.0, 0.0, TipoConstrucao.TEMPLO, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Campones) Civilizacao.civilizacoes.get(i).unidades.get(TipoUnidade.CAMPONES).get(0)).construir(0.0, 0.0, TipoConstrucao.TORRE, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      
      System.out.println("\nCriando Unidades:\n");
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Centro) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.CENTRO).get(0)).criar(Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.ARQUEIRO, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.CAMPONES, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.CAVALEIRO, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.ELEFANTE, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.FALANGE, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.GUERREIRO, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Quartel) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.QUARTEL).get(0)).criar(TipoUnidade.SACERDOTE, Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      ((Templo) Civilizacao.civilizacoes.get(i).construcoes.get(TipoConstrucao.TEMPLO).get(0)).criar(Civilizacao.civilizacoes.get(i));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(i).recursosCMO));
      
      System.out.println("\nInformações da civilização " + (i+1) + "\n");
      System.out.println(Civilizacao.civilizacoes.get(i).extinta);
      System.out.println(Civilizacao.civilizacoes.get(i).popAtual);
      System.out.println(Civilizacao.civilizacoes.get(i).popMax);
      System.out.println(Civilizacao.civilizacoes.get(i).tipo);
    }
    
    System.out.println("\nMovendo uma unidade:\n");
    System.out.println("Posição Inicial X: " + Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).x);
    System.out.println("Posição Inicial Y: " + Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).y);
    Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).mover(TipoMovimentacao.NORTE);
    Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).mover(TipoMovimentacao.SUL);
    Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).mover(TipoMovimentacao.LESTE);
    Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).mover(TipoMovimentacao.OESTE);
    System.out.println("Posição Final X: " + Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).x);
    System.out.println("Posição Final Y: " + Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).y);
    
    System.out.println("\nAtacando uma Construção à distância:\n");
    
    System.out.println("\nDentro do alcance:\n");
    System.out.println("Vida Inicial da Casa: " + Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CASA).get(0).vida);
    System.out.println("Ataque do Arqueiro: " + ((Arqueiro) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0)).ataque);
    ((Arqueiro) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0)).atacar(Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CASA).get(0), Civilizacao.civilizacoes.get(1));
    
    System.out.println("\nFora do Alcance:\n");
    for (int i=0; i<4; i++) {
      Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0).mover(TipoMovimentacao.NORTE);
    }
    ((Arqueiro) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.ARQUEIRO).get(0)).atacar(Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CASA).get(0), Civilizacao.civilizacoes.get(1));
    
    System.out.println("\nAtacando uma Unidade Corpo-a-corpo:\n");
    
    System.out.println("\nDentro do alcance:\n");
    System.out.println("Vida Inicial do Guerreiro: " + Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).get(0).vida);
    System.out.println("Armadura do Guerreiro: " + Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).get(0).armadura);
    System.out.println("Ataque do Cavaleiro: " + ((Cavaleiro) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAVALEIRO).get(0)).ataque);
    ((Cavaleiro) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAVALEIRO).get(0)).atacar(Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).get(0), Civilizacao.civilizacoes.get(1));
    
    System.out.println("\nFora do alcance:\n");
    Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAVALEIRO).get(0).mover(TipoMovimentacao.NORTE);
    ((Cavaleiro) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAVALEIRO).get(0)).atacar(Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).get(0), Civilizacao.civilizacoes.get(1));
    
    System.out.println("\nTestando Converter do Sacerdote:\n");
    System.out.println("Guerreiros antes da Conversão(civi1)" + Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.GUERREIRO).size());
    System.out.println("Guerreiros antes da Conversão(civi2)" + Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).size());
    ((Sacerdote) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.SACERDOTE).get(0)).converteInimigo(Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).get(0), Civilizacao.civilizacoes.get(1), Civilizacao.civilizacoes.get(0));
    System.out.println("Guerreiros depois da Conversão(civi1)" + Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.GUERREIRO).size());
    System.out.println("Guerreiros depois da Conversão(civi2)" + Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.GUERREIRO).size());
    
    System.out.println("\nTestando métodos do Camponês:\n");
    
    System.out.println("\nTestando Colheita de Recursos:\n");
    System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(0).recursosCMO));
    ((Campones) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAMPONES).get(0)).colher(Civilizacao.civilizacoes.get(0));
    ((Campones) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAMPONES).get(0)).cortar(Civilizacao.civilizacoes.get(0));
    ((Campones) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAMPONES).get(0)).minerar(Civilizacao.civilizacoes.get(0));
    System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(0).recursosCMO));
    
    System.out.println("\nTentando Construir SEM Recursos\n");
    System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(0).recursosCMO));
    for (int i=0; i<3; i++) {
      ((Campones) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.CAMPONES).get(0)).construir(10.0, 10.0, TipoConstrucao.QUARTEL, Civilizacao.civilizacoes.get(0));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(0).recursosCMO));
    }
    
    System.out.println("\nTentando Criar SEM Recursos\n");
    System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(0).recursosCMO));
    for (int i=0; i<6; i++) {
      ((Templo) Civilizacao.civilizacoes.get(0).construcoes.get(TipoConstrucao.TEMPLO).get(0)).criar(Civilizacao.civilizacoes.get(0));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(0).recursosCMO));
    }
    
    System.out.println("\nTentando Criar SEM Capacidade\n");
    System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(1).recursosCMO));
    for (int i=0; i<7; i++) {
      ((Centro) Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CENTRO).get(0)).criar(Civilizacao.civilizacoes.get(0));
      System.out.println("Recursos " + Arrays.toString(Civilizacao.civilizacoes.get(1).recursosCMO));
    }
    
    System.out.println("\nTestando extinguir civilização");
    Civilizacao.civilizacoes.remove(1);
    civi2 = new Civilizacao(TipoCivilizacao.EGÍPCIA);
    
    System.out.println("\nMatando as Unidades:\n");
    //tive que fazer uma gambiarra pra poder fazer o while, porque quando a unidade morria e o método
    //atacar tirava a unidade do array dava indexOutOfBonds porque ele tentava buscar uma informação
    //da unidade pra fazer a checagem a condição pra executar ou não o laço e ela não estava mais lá
    System.out.println("Camponêses antes do ataque: " + Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.CAMPONES).size());
    int life, nroCamponeses = Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.CAMPONES).size();
    int damage = ((Falange) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.FALANGE).get(0)).ataque;
    int armor = ((Campones) Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.CAMPONES).get(0)).armadura;
    for (int i=0; i<nroCamponeses; i++) {
      life = Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.CAMPONES).get(0).vida;
      while (life>0) {
        life = life-(damage-armor);
        ((Falange) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.FALANGE).get(0)).atacar(Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.CAMPONES).get(0), Civilizacao.civilizacoes.get(1));
      }
      System.out.println("Camponêses depois do ataque: " + Civilizacao.civilizacoes.get(1).unidades.get(TipoUnidade.CAMPONES).size());
    }
    
    System.out.println("\nDestruindo uma Construção:\n");
    System.out.println("Centros antes do ataque: " + Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CENTRO).size());
    life = Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CENTRO).get(0).vida;
    while (life>0) {
      life = life-damage;
      ((Falange) Civilizacao.civilizacoes.get(0).unidades.get(TipoUnidade.FALANGE).get(0)).atacar(Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CENTRO).get(0), Civilizacao.civilizacoes.get(1));
    }
    System.out.println("Centros depois do ataque: " + Civilizacao.civilizacoes.get(1).construcoes.get(TipoConstrucao.CENTRO).size());
  }
}
