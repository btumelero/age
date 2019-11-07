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
public class Elefante extends Atacam
                      implements InterfaceAtaca{
  
  Elefante(){
    armadura = 2;
    ataque = 18;
    custoCMO[0] = 170; //comida
    custoCMO[2] = 40; //ouro
    velocidade = 1.0;
    vida = 600;
    imagem = TipoImagem.ELEFANTE;
  }
}
