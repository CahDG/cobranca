package edu.ifmt.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.*;

@Entity // classe que vira tabela no banco
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id gerado pelo banco
    private Long codigo;

    private String descricao;

    @DateTimeFormat(pattern = "dd/MM/yyyy") // aceita data no formato brasileiro
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    @NumberFormat(pattern = "#,##0.00") // aceita vírgula no valor
    private BigDecimal valor;

    @Enumerated(EnumType.STRING) // salva o status como texto
    private StatusTitulo status;

    public Long getCodigo() { return codigo; }
    public void setCodigo(Long codigo) { this.codigo = codigo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Date getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(Date dataVencimento) { this.dataVencimento = dataVencimento; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public StatusTitulo getStatus() { return status; }
    public void setStatus(StatusTitulo status) { this.status = status; }

    @Override
    public int hashCode() { return java.util.Objects.hash(codigo); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return java.util.Objects.equals(codigo, ((Titulo) obj).codigo);
    }
}