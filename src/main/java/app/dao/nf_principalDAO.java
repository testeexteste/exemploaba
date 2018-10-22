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
@Repository("nf_principalDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface nf_principalDAO extends JpaRepository<nf_principal, java.lang.Integer> {

  /**
   * Obtém a instância de nf_principal utilizando os identificadores
   * 
   * @param cod_nf
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM nf_principal entity WHERE entity.cod_nf = :cod_nf")
  public nf_principal findOne(@Param(value="cod_nf") java.lang.Integer cod_nf);

  /**
   * Remove a instância de nf_principal utilizando os identificadores
   * 
   * @param cod_nf
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM nf_principal entity WHERE entity.cod_nf = :cod_nf")
  public void delete(@Param(value="cod_nf") java.lang.Integer cod_nf);



}
