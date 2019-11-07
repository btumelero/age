/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Método mover
 * @author Bruno
 */
public abstract class Unidades extends Objetos{
  protected int armadura;
  protected double velocidade;
  
  /**
   * Move a unidade para a direção escolhida
   * @param tipo tipo de movimentação
   */
  public void mover(TipoMovimentacao tipo){ //move a unidade no valor de sua velocidade na direção desejada
    if (tipo==TipoMovimentacao.NORTE) {
      System.out.print("Essa unidade foi movida de Y: " + y);
      y += velocidade;
      System.out.println(" para Y: " + y);
    } else {
      if (tipo==TipoMovimentacao.SUL) {
        System.out.print("Essa unidade foi movida de Y: " + y);
        y -= velocidade;
        System.out.println(" para Y: " + y);
      } else {
        if (tipo==TipoMovimentacao.LESTE) {
          System.out.print("Essa unidade foi movida de X: " + x);
          x += velocidade;
          System.out.println(" para X: " + x);
        } else {
          System.out.print("Essa unidade foi movida de X: " + x);
          x -= velocidade;
          System.out.println(" para X: " + x);
        } 
      }
    }
  }
}
