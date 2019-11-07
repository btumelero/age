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
public class Cavaleiro extends Atacam
                       implements InterfaceAtaca{
  
  Cavaleiro(){
    armadura = 3;
    ataque = 12;
    custoCMO[0] = 70; //comida
    custoCMO[2] = 80; //ouro
    velocidade = 4.0;
    vida = 180;
    imagem = TipoImagem.CAVALEIRO;
  }
}
