/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Implementada por Arqueiro, Campones, Cavaleiro, Centro, Elefante, Falange, Guerreiro, Torre
 * @author bruno.191196
 */
public interface InterfaceAtaca {

  /**
   * Ataca um alvo se ele estiver dentro do alcance
   * @param alvo Objeto a ser atacado
   * @param civiAtacada Civilização a ser atacada
   */
  public void atacar(Objetos alvo, Civilizacao civiAtacada);
}
