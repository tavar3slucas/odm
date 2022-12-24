package com.lucastavares.odm.domain;

import com.lucastavares.odm.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoBoleto extends Pagamento {

    private static final long serialVersionUID = 1l;
    private Date dataVencimendo;
    private Date dataPagamento;

    public PagamentoBoleto(){}

    public PagamentoBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimendo, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimendo = dataVencimendo;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimendo() {
        return dataVencimendo;
    }

    public void setDataVencimendo(Date dataVencimendo) {
        this.dataVencimendo = dataVencimendo;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
