package model;

import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author $martin.ruediger
 */
@Entity
public class Bairro implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Time tempo_espera;
    @ManyToOne
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(int id, String nome, Time tempo_espera, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.tempo_espera = tempo_espera;
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTempo_espera() {
        return tempo_espera;
    }

    public void setTempo_espera(Time tempo_espera) {
        this.tempo_espera = tempo_espera;
    }
    
    
}
