package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PARCEIROS
 * @generated
 */
@Entity
@Table(name = "\"PARCEIROS\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"cod_par" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.parceiros")
public class parceiros implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cod_emp", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer cod_par;

  /**
  * @generated
  */
  @Column(name = "razao", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String razao;

  /**
  * @generated
  */
  @Column(name = "fantazia", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String fantazia;

  /**
  * @generated
  */
  @Column(name = "cnpj_cpf", nullable = true, unique = false, length=17, insertable=true, updatable=true)
  
  private java.lang.String cnpj_cpf;

  /**
  * @generated
  */
  @Column(name = "rg_ie", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String rg_ie;

  /**
  * @generated
  */
  @Column(name = "im", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String im;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "endereco", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String endereco;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String numero;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "cod_cid", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cod_cid;

  /**
  * @generated
  */
  @Column(name = "telefone1", nullable = true, unique = false, length=13, insertable=true, updatable=true)
  
  private java.lang.String telefone1;

  /**
  * @generated
  */
  @Column(name = "telefone2", nullable = true, unique = false, length=13, insertable=true, updatable=true)
  
  private java.lang.String telefone2;

  /**
  * @generated
  */
  @Column(name = "fax", nullable = true, unique = false, length=13, insertable=true, updatable=true)
  
  private java.lang.String fax;

  /**
  * @generated
  */
  @Column(name = "orgao", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String orgao;

  /**
  * @generated
  */
  @Column(name = "tipo_pessoa", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String tipo_pessoa;

  /**
  * @generated
  */
  @Column(name = "tipo_par_cont", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean tipo_par_cont;

  /**
  * @generated
  */
  @Column(name = "tipo_par_emit", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean tipo_par_emit;

  /**
  * @generated
  */
  @Column(name = "tipo_par_clie", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean tipo_par_clie;

  /**
  * @generated
  */
  @Column(name = "perc_carga_media", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double perc_carga_media;

  /**
  * @generated
  */
  @Column(name = "cod_tip_contribuinte", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cod_tip_contribuinte;

  /**
  * @generated
  */
  @Column(name = "consumidor_final", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean consumidor_final;

  /**
   * Construtor
   * @generated
   */
  public parceiros(){
  }


  /**
   * Obtém cod_par
   * return cod_par
   * @generated
   */
  
  public java.lang.Integer getCod_par(){
    return this.cod_par;
  }

  /**
   * Define cod_par
   * @param cod_par cod_par
   * @generated
   */
  public parceiros setCod_par(java.lang.Integer cod_par){
    this.cod_par = cod_par;
    return this;
  }

  /**
   * Obtém razao
   * return razao
   * @generated
   */
  
  public java.lang.String getRazao(){
    return this.razao;
  }

  /**
   * Define razao
   * @param razao razao
   * @generated
   */
  public parceiros setRazao(java.lang.String razao){
    this.razao = razao;
    return this;
  }

  /**
   * Obtém fantazia
   * return fantazia
   * @generated
   */
  
  public java.lang.String getFantazia(){
    return this.fantazia;
  }

  /**
   * Define fantazia
   * @param fantazia fantazia
   * @generated
   */
  public parceiros setFantazia(java.lang.String fantazia){
    this.fantazia = fantazia;
    return this;
  }

  /**
   * Obtém cnpj_cpf
   * return cnpj_cpf
   * @generated
   */
  
  public java.lang.String getCnpj_cpf(){
    return this.cnpj_cpf;
  }

  /**
   * Define cnpj_cpf
   * @param cnpj_cpf cnpj_cpf
   * @generated
   */
  public parceiros setCnpj_cpf(java.lang.String cnpj_cpf){
    this.cnpj_cpf = cnpj_cpf;
    return this;
  }

  /**
   * Obtém rg_ie
   * return rg_ie
   * @generated
   */
  
  public java.lang.String getRg_ie(){
    return this.rg_ie;
  }

  /**
   * Define rg_ie
   * @param rg_ie rg_ie
   * @generated
   */
  public parceiros setRg_ie(java.lang.String rg_ie){
    this.rg_ie = rg_ie;
    return this;
  }

  /**
   * Obtém im
   * return im
   * @generated
   */
  
  public java.lang.String getIm(){
    return this.im;
  }

  /**
   * Define im
   * @param im im
   * @generated
   */
  public parceiros setIm(java.lang.String im){
    this.im = im;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public parceiros setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  
  public java.lang.String getEndereco(){
    return this.endereco;
  }

  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public parceiros setEndereco(java.lang.String endereco){
    this.endereco = endereco;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.String getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public parceiros setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public parceiros setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém cod_cid
   * return cod_cid
   * @generated
   */
  
  public java.lang.Integer getCod_cid(){
    return this.cod_cid;
  }

  /**
   * Define cod_cid
   * @param cod_cid cod_cid
   * @generated
   */
  public parceiros setCod_cid(java.lang.Integer cod_cid){
    this.cod_cid = cod_cid;
    return this;
  }

  /**
   * Obtém telefone1
   * return telefone1
   * @generated
   */
  
  public java.lang.String getTelefone1(){
    return this.telefone1;
  }

  /**
   * Define telefone1
   * @param telefone1 telefone1
   * @generated
   */
  public parceiros setTelefone1(java.lang.String telefone1){
    this.telefone1 = telefone1;
    return this;
  }

  /**
   * Obtém telefone2
   * return telefone2
   * @generated
   */
  
  public java.lang.String getTelefone2(){
    return this.telefone2;
  }

  /**
   * Define telefone2
   * @param telefone2 telefone2
   * @generated
   */
  public parceiros setTelefone2(java.lang.String telefone2){
    this.telefone2 = telefone2;
    return this;
  }

  /**
   * Obtém fax
   * return fax
   * @generated
   */
  
  public java.lang.String getFax(){
    return this.fax;
  }

  /**
   * Define fax
   * @param fax fax
   * @generated
   */
  public parceiros setFax(java.lang.String fax){
    this.fax = fax;
    return this;
  }

  /**
   * Obtém orgao
   * return orgao
   * @generated
   */
  
  public java.lang.String getOrgao(){
    return this.orgao;
  }

  /**
   * Define orgao
   * @param orgao orgao
   * @generated
   */
  public parceiros setOrgao(java.lang.String orgao){
    this.orgao = orgao;
    return this;
  }

  /**
   * Obtém tipo_pessoa
   * return tipo_pessoa
   * @generated
   */
  
  public java.lang.String getTipo_pessoa(){
    return this.tipo_pessoa;
  }

  /**
   * Define tipo_pessoa
   * @param tipo_pessoa tipo_pessoa
   * @generated
   */
  public parceiros setTipo_pessoa(java.lang.String tipo_pessoa){
    this.tipo_pessoa = tipo_pessoa;
    return this;
  }

  /**
   * Obtém tipo_par_cont
   * return tipo_par_cont
   * @generated
   */
  
  public java.lang.Boolean getTipo_par_cont(){
    return this.tipo_par_cont;
  }

  /**
   * Define tipo_par_cont
   * @param tipo_par_cont tipo_par_cont
   * @generated
   */
  public parceiros setTipo_par_cont(java.lang.Boolean tipo_par_cont){
    this.tipo_par_cont = tipo_par_cont;
    return this;
  }

  /**
   * Obtém tipo_par_emit
   * return tipo_par_emit
   * @generated
   */
  
  public java.lang.Boolean getTipo_par_emit(){
    return this.tipo_par_emit;
  }

  /**
   * Define tipo_par_emit
   * @param tipo_par_emit tipo_par_emit
   * @generated
   */
  public parceiros setTipo_par_emit(java.lang.Boolean tipo_par_emit){
    this.tipo_par_emit = tipo_par_emit;
    return this;
  }

  /**
   * Obtém tipo_par_clie
   * return tipo_par_clie
   * @generated
   */
  
  public java.lang.Boolean getTipo_par_clie(){
    return this.tipo_par_clie;
  }

  /**
   * Define tipo_par_clie
   * @param tipo_par_clie tipo_par_clie
   * @generated
   */
  public parceiros setTipo_par_clie(java.lang.Boolean tipo_par_clie){
    this.tipo_par_clie = tipo_par_clie;
    return this;
  }

  /**
   * Obtém perc_carga_media
   * return perc_carga_media
   * @generated
   */
  
  public java.lang.Double getPerc_carga_media(){
    return this.perc_carga_media;
  }

  /**
   * Define perc_carga_media
   * @param perc_carga_media perc_carga_media
   * @generated
   */
  public parceiros setPerc_carga_media(java.lang.Double perc_carga_media){
    this.perc_carga_media = perc_carga_media;
    return this;
  }

  /**
   * Obtém cod_tip_contribuinte
   * return cod_tip_contribuinte
   * @generated
   */
  
  public java.lang.Integer getCod_tip_contribuinte(){
    return this.cod_tip_contribuinte;
  }

  /**
   * Define cod_tip_contribuinte
   * @param cod_tip_contribuinte cod_tip_contribuinte
   * @generated
   */
  public parceiros setCod_tip_contribuinte(java.lang.Integer cod_tip_contribuinte){
    this.cod_tip_contribuinte = cod_tip_contribuinte;
    return this;
  }

  /**
   * Obtém consumidor_final
   * return consumidor_final
   * @generated
   */
  
  public java.lang.Boolean getConsumidor_final(){
    return this.consumidor_final;
  }

  /**
   * Define consumidor_final
   * @param consumidor_final consumidor_final
   * @generated
   */
  public parceiros setConsumidor_final(java.lang.Boolean consumidor_final){
    this.consumidor_final = consumidor_final;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    parceiros object = (parceiros)obj;
    if (cod_par != null ? !cod_par.equals(object.cod_par) : object.cod_par != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cod_par == null) ? 0 : cod_par.hashCode());
    return result;
  }

}
