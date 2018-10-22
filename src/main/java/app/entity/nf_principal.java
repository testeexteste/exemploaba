package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela NF_PRINCIPAL
 * @generated
 */
@Entity
@Table(name = "\"NF_PRINCIPAL\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"cod_nf" ,"numero_nfe" ,"numero_nfce" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.nf_principal")
public class nf_principal implements Serializable {

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
  @Column(name = "cod_nf", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer cod_nf;

  /**
  * @generated
  */
  @Column(name = "numero_nfe", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.Integer numero_nfe;

  /**
  * @generated
  */
  @Column(name = "numero_nfce", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.Integer numero_nfce;

  /**
  * @generated
  */
  @Column(name = "serie", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String serie;

  /**
  * @generated
  */
  @Column(name = "chave", nullable = true, unique = false, length=44, insertable=true, updatable=true)
  
  private java.lang.String chave;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_emissao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_emissao;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora_emissao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora_emissao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_saida", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_saida;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora_saida", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora_saida;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_conting", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_conting;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora_conting", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora_conting;

  /**
  * @generated
  */
  @Column(name = "situacao", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String situacao;

  /**
  * @generated
  */
  @Column(name = "nat_oper", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer nat_oper;

  /**
  * @generated
  */
  @Column(name = "regime_trib", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String regime_trib;

  /**
  * @generated
  */
  @Column(name = "cod_finalidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cod_finalidade;

  /**
  * @generated
  */
  @Column(name = "cod_indicador_presenca", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer cod_indicador_presenca;

  /**
  * @generated
  */
  @Column(name = "cod_par", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer cod_par;

  /**
  * @generated
  */
  @Column(name = "vendedor", nullable = true, unique = false, length=40, insertable=true, updatable=true)
  
  private java.lang.String vendedor;

  /**
   * Construtor
   * @generated
   */
  public nf_principal(){
  }


  /**
   * Obtém cod_nf
   * return cod_nf
   * @generated
   */
  
  public java.lang.Integer getCod_nf(){
    return this.cod_nf;
  }

  /**
   * Define cod_nf
   * @param cod_nf cod_nf
   * @generated
   */
  public nf_principal setCod_nf(java.lang.Integer cod_nf){
    this.cod_nf = cod_nf;
    return this;
  }

  /**
   * Obtém numero_nfe
   * return numero_nfe
   * @generated
   */
  
  public java.lang.Integer getNumero_nfe(){
    return this.numero_nfe;
  }

  /**
   * Define numero_nfe
   * @param numero_nfe numero_nfe
   * @generated
   */
  public nf_principal setNumero_nfe(java.lang.Integer numero_nfe){
    this.numero_nfe = numero_nfe;
    return this;
  }

  /**
   * Obtém numero_nfce
   * return numero_nfce
   * @generated
   */
  
  public java.lang.Integer getNumero_nfce(){
    return this.numero_nfce;
  }

  /**
   * Define numero_nfce
   * @param numero_nfce numero_nfce
   * @generated
   */
  public nf_principal setNumero_nfce(java.lang.Integer numero_nfce){
    this.numero_nfce = numero_nfce;
    return this;
  }

  /**
   * Obtém serie
   * return serie
   * @generated
   */
  
  public java.lang.String getSerie(){
    return this.serie;
  }

  /**
   * Define serie
   * @param serie serie
   * @generated
   */
  public nf_principal setSerie(java.lang.String serie){
    this.serie = serie;
    return this;
  }

  /**
   * Obtém chave
   * return chave
   * @generated
   */
  
  public java.lang.String getChave(){
    return this.chave;
  }

  /**
   * Define chave
   * @param chave chave
   * @generated
   */
  public nf_principal setChave(java.lang.String chave){
    this.chave = chave;
    return this;
  }

  /**
   * Obtém data_emissao
   * return data_emissao
   * @generated
   */
  
  public java.util.Date getData_emissao(){
    return this.data_emissao;
  }

  /**
   * Define data_emissao
   * @param data_emissao data_emissao
   * @generated
   */
  public nf_principal setData_emissao(java.util.Date data_emissao){
    this.data_emissao = data_emissao;
    return this;
  }

  /**
   * Obtém hora_emissao
   * return hora_emissao
   * @generated
   */
  
  public java.util.Date getHora_emissao(){
    return this.hora_emissao;
  }

  /**
   * Define hora_emissao
   * @param hora_emissao hora_emissao
   * @generated
   */
  public nf_principal setHora_emissao(java.util.Date hora_emissao){
    this.hora_emissao = hora_emissao;
    return this;
  }

  /**
   * Obtém data_saida
   * return data_saida
   * @generated
   */
  
  public java.util.Date getData_saida(){
    return this.data_saida;
  }

  /**
   * Define data_saida
   * @param data_saida data_saida
   * @generated
   */
  public nf_principal setData_saida(java.util.Date data_saida){
    this.data_saida = data_saida;
    return this;
  }

  /**
   * Obtém hora_saida
   * return hora_saida
   * @generated
   */
  
  public java.util.Date getHora_saida(){
    return this.hora_saida;
  }

  /**
   * Define hora_saida
   * @param hora_saida hora_saida
   * @generated
   */
  public nf_principal setHora_saida(java.util.Date hora_saida){
    this.hora_saida = hora_saida;
    return this;
  }

  /**
   * Obtém data_conting
   * return data_conting
   * @generated
   */
  
  public java.util.Date getData_conting(){
    return this.data_conting;
  }

  /**
   * Define data_conting
   * @param data_conting data_conting
   * @generated
   */
  public nf_principal setData_conting(java.util.Date data_conting){
    this.data_conting = data_conting;
    return this;
  }

  /**
   * Obtém hora_conting
   * return hora_conting
   * @generated
   */
  
  public java.util.Date getHora_conting(){
    return this.hora_conting;
  }

  /**
   * Define hora_conting
   * @param hora_conting hora_conting
   * @generated
   */
  public nf_principal setHora_conting(java.util.Date hora_conting){
    this.hora_conting = hora_conting;
    return this;
  }

  /**
   * Obtém situacao
   * return situacao
   * @generated
   */
  
  public java.lang.String getSituacao(){
    return this.situacao;
  }

  /**
   * Define situacao
   * @param situacao situacao
   * @generated
   */
  public nf_principal setSituacao(java.lang.String situacao){
    this.situacao = situacao;
    return this;
  }

  /**
   * Obtém nat_oper
   * return nat_oper
   * @generated
   */
  
  public java.lang.Integer getNat_oper(){
    return this.nat_oper;
  }

  /**
   * Define nat_oper
   * @param nat_oper nat_oper
   * @generated
   */
  public nf_principal setNat_oper(java.lang.Integer nat_oper){
    this.nat_oper = nat_oper;
    return this;
  }

  /**
   * Obtém regime_trib
   * return regime_trib
   * @generated
   */
  
  public java.lang.String getRegime_trib(){
    return this.regime_trib;
  }

  /**
   * Define regime_trib
   * @param regime_trib regime_trib
   * @generated
   */
  public nf_principal setRegime_trib(java.lang.String regime_trib){
    this.regime_trib = regime_trib;
    return this;
  }

  /**
   * Obtém cod_finalidade
   * return cod_finalidade
   * @generated
   */
  
  public java.lang.Integer getCod_finalidade(){
    return this.cod_finalidade;
  }

  /**
   * Define cod_finalidade
   * @param cod_finalidade cod_finalidade
   * @generated
   */
  public nf_principal setCod_finalidade(java.lang.Integer cod_finalidade){
    this.cod_finalidade = cod_finalidade;
    return this;
  }

  /**
   * Obtém cod_indicador_presenca
   * return cod_indicador_presenca
   * @generated
   */
  
  public java.lang.Integer getCod_indicador_presenca(){
    return this.cod_indicador_presenca;
  }

  /**
   * Define cod_indicador_presenca
   * @param cod_indicador_presenca cod_indicador_presenca
   * @generated
   */
  public nf_principal setCod_indicador_presenca(java.lang.Integer cod_indicador_presenca){
    this.cod_indicador_presenca = cod_indicador_presenca;
    return this;
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
  public nf_principal setCod_par(java.lang.Integer cod_par){
    this.cod_par = cod_par;
    return this;
  }

  /**
   * Obtém vendedor
   * return vendedor
   * @generated
   */
  
  public java.lang.String getVendedor(){
    return this.vendedor;
  }

  /**
   * Define vendedor
   * @param vendedor vendedor
   * @generated
   */
  public nf_principal setVendedor(java.lang.String vendedor){
    this.vendedor = vendedor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    nf_principal object = (nf_principal)obj;
    if (cod_nf != null ? !cod_nf.equals(object.cod_nf) : object.cod_nf != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cod_nf == null) ? 0 : cod_nf.hashCode());
    return result;
  }

}
