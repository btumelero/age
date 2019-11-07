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
public class Falange extends Atacam
                     implements InterfaceAtaca{
  
  Falange(){
    armadura = 7;
    ataque = 20;
    custoCMO[0] = 60; //comida
    custoCMO[2] = 40; //ouro
    velocidade = 1.2;
    vida = 120;
    imagem = TipoImagem.FALANGE;
  }
}
