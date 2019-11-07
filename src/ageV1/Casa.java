/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

/**
 * Construtor
 * @author Bruno
 */
public class Casa extends Construcoes{
  protected static int popMax;
  
  Casa(){
    custoCMO[1] = 30;
    vida = 75;
    popMax = 2;
    imagem = TipoImagem.CASA;
  }
}
