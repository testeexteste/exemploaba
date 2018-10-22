package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("parceirosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface parceirosDAO extends JpaRepository<parceiros, java.lang.Integer> {

  /**
   * Obtém a instância de parceiros utilizando os identificadores
   * 
   * @param cod_par
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM parceiros entity WHERE entity.cod_par = :cod_par")
  public parceiros findOne(@Param(value="cod_par") java.lang.Integer cod_par);

  /**
   * Remove a instância de parceiros utilizando os identificadores
   * 
   * @param cod_par
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM parceiros entity WHERE entity.cod_par = :cod_par")
  public void delete(@Param(value="cod_par") java.lang.Integer cod_par);



}
