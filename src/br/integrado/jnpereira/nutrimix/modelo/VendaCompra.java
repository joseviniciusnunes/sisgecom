package br.integrado.jnpereira.nutrimix.modelo;

import br.integrado.jnpereira.nutrimix.dao.AutoIncrement;
import br.integrado.jnpereira.nutrimix.dao.Coluna;
import br.integrado.jnpereira.nutrimix.dao.Id;
import br.integrado.jnpereira.nutrimix.dao.Tabela;
import java.util.Date;

@Tabela(nome="venda_compra")
public class VendaCompra {
    @Id
    @AutoIncrement
    @Coluna(nome="cd_movto")
    private Integer cdMovto;
    @Coluna(nome="tp_movto")
    private String tpMovto;
    @Coluna(nome="cd_pessoa")
    private Integer cdPessoa;
    @Coluna(nome="nr_nota")
    private String nrNota;
    @Coluna(nome="cd_serie")
    private String cdSerie;
    @Coluna(nome="dt_emissao")
    private Date dtEmissao;
    @Coluna(nome="vl_desconto")
    private Double vlDesconto;
    @Coluna(nome="vl_adicional")
    private Double vlAdicional;
    @Coluna(nome="vl_frete")
    private Double vlFrete;
    @Coluna(nome="cd_usercad")
    private Integer cdUserCad;
    @Coluna(nome="dt_cadastro")
    private Date dtCadastro;
    @Coluna(nome="cd_atend")
    private Integer cdAtend;
    @Coluna(nome="dt_atend")
    private Date dtAtend;
    @Coluna(nome="vl_total")
    private Double vlTotal;
    @Coluna(nome="cd_pedido")
    private Integer cdPedido;
    @Coluna(nome="in_cancelado")
    private Boolean inCancelado;

    public Integer getCdMovto() {
        return cdMovto;
    }

    public void setCdMovto(Integer cdMovto) {
        this.cdMovto = cdMovto;
    }

    public String getTpMovto() {
        return tpMovto;
    }

    public void setTpMovto(String tpMovto) {
        this.tpMovto = tpMovto;
    }

    public Integer getCdPessoa() {
        return cdPessoa;
    }

    public void setCdPessoa(Integer cdPessoa) {
        this.cdPessoa = cdPessoa;
    }

    public String getNrNota() {
        return nrNota;
    }

    public void setNrNota(String nrNota) {
        this.nrNota = nrNota;
    }

    public String getCdSerie() {
        return cdSerie;
    }

    public void setCdSerie(String cdSerie) {
        this.cdSerie = cdSerie;
    }

    public Double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(Double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public Double getVlAdicional() {
        return vlAdicional;
    }

    public void setVlAdicional(Double vlAdicional) {
        this.vlAdicional = vlAdicional;
    }

    public Double getVlFrete() {
        return vlFrete;
    }

    public void setVlFrete(Double vlFrete) {
        this.vlFrete = vlFrete;
    }

    public Integer getCdUserCad() {
        return cdUserCad;
    }

    public void setCdUserCad(Integer cdUserCad) {
        this.cdUserCad = cdUserCad;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Integer getCdAtend() {
        return cdAtend;
    }

    public void setCdAtend(Integer cdAtend) {
        this.cdAtend = cdAtend;
    }

    public Date getDtAtend() {
        return dtAtend;
    }

    public void setDtAtend(Date dtAtend) {
        this.dtAtend = dtAtend;
    }

    public Double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(Double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public Integer getCdPedido() {
        return cdPedido;
    }

    public void setCdPedido(Integer cdPedido) {
        this.cdPedido = cdPedido;
    }

    public Boolean getInCancelado() {
        return inCancelado;
    }

    public void setInCancelado(Boolean inCancelado) {
        this.inCancelado = inCancelado;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

}
