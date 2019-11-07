/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Construtor
 * @author Bruno
 */
public class Civilizacao {
  public static ArrayList<Civilizacao> civilizacoes = new ArrayList<>();
  private static int cont=0;
  protected int[] recursosCMO;
  protected int popAtual, popMax, nroCivili;
  protected boolean extinta;
  protected TipoCivilizacao tipo;
  
  protected Map<TipoUnidade, ArrayList<Unidades>> unidades;
  protected Map<TipoConstrucao, ArrayList<Construcoes>> construcoes;

  Civilizacao(TipoCivilizacao tipo){
    this.extinta = false;
    this.recursosCMO = new int[]{1000, 1000, 1000};
    this.tipo = tipo;
    
    unidades = new HashMap();
    
    unidades.put(TipoUnidade.ARQUEIRO, new ArrayList<>());
    unidades.put(TipoUnidade.CAMPONES, new ArrayList<>());
    unidades.put(TipoUnidade.CAVALEIRO, new ArrayList<>());
    unidades.put(TipoUnidade.ELEFANTE, new ArrayList<>());
    unidades.put(TipoUnidade.FALANGE, new ArrayList<>());
    unidades.put(TipoUnidade.GUERREIRO, new ArrayList<>());
    unidades.put(TipoUnidade.SACERDOTE, new ArrayList<>());
    
    construcoes = new HashMap();
    
    construcoes.put(TipoConstrucao.CASA, new ArrayList<>());
    construcoes.put(TipoConstrucao.CENTRO, new ArrayList<>());
    construcoes.put(TipoConstrucao.QUARTEL, new ArrayList<>());
    construcoes.put(TipoConstrucao.TEMPLO, new ArrayList<>());
    construcoes.put(TipoConstrucao.TORRE, new ArrayList<>());
    
    
    construcoes.get(TipoConstrucao.CENTRO).add(new Centro());
    construcoes.get(TipoConstrucao.CENTRO).get(0).x = 0;
    construcoes.get(TipoConstrucao.CENTRO).get(0).y = 0;
    popMax = 10;
    for (int i=0; i<4; i++){
      unidades.get(TipoUnidade.CAMPONES).add(new Campones());
      unidades.get(TipoUnidade.CAMPONES).get(i).x = construcoes.get(TipoConstrucao.CENTRO).get(0).x;
      unidades.get(TipoUnidade.CAMPONES).get(i).y = construcoes.get(TipoConstrucao.CENTRO).get(0).y;
    }
    popAtual=4;
    
    cont++;
    nroCivili = cont;
    civilizacoes.add(this);
  }
}
