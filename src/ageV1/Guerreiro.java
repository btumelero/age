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
public class Guerreiro extends Atacam
                       implements InterfaceAtaca{
  
  Guerreiro(){
    armadura = 2;
    ataque = 13;
    custoCMO[0] = 35; //comida
    custoCMO[2] = 15; //ouro
    velocidade = 1.8;
    vida = 160;
    imagem = TipoImagem.GUERREIRO;
  }
}
