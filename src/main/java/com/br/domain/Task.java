package com.br.domain;

import java.time.LocalDateTime;
import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;
import com.br.util.DateTimeUtils;

public class Task {

    private String titulo;

    private LocalDateTime criadoAs;

    private Prioridade prioridade;

    private String categoria;

    private Status status;

    public Task() {};

    public Task(String titulo, Prioridade prioridade, String categoria, Status status) {

        this.titulo = titulo;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;

        this.criadoAs = LocalDateTime.now();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public LocalDateTime getCriadoAs() {
        return this.criadoAs;
    }

    // SEM SETTER PARA DATA E HORA

    public Prioridade getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((criadoAs == null) ? 0 : criadoAs.hashCode());
        result = prime * result + ((prioridade == null) ? 0 : prioridade.hashCode());
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (criadoAs == null) {
            if (other.criadoAs != null)
                return false;
        } else if (!criadoAs.equals(other.criadoAs))
            return false;
        if (prioridade != other.prioridade)
            return false;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (status != other.status)
            return false;
        return true;
    }

    @Override
    public String toString() {

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return "Task [titulo=" + titulo + ", criadoAs=" + DateTimeUtils.formatar(criadoAs)
                + ", prioridade=" + prioridade + ", categoria=" + categoria + ", status=" + status
                + "]";
    }


}
