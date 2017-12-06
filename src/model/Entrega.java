package model;

import java.sql.Date;
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
public class Entrega implements IEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data_entrega;
    @ManyToOne
    private Entregador entregador;

    public Entrega() {
    }

    public Entrega(int id, Date data_entrega, Entregador entregador) {
        this.id = id;
        this.data_entrega = data_entrega;
        this.entregador = entregador;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }
    
    
}
