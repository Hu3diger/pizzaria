package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author $martin.ruediger
 */
@Entity
public class Pizza_Modificada implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Pizza_Vendida pizzavendida;
    private Double quantidade;
    @OneToMany(mappedBy = "pizzamodifi")
    private List<Modificacoes> modificacoess;

    public Pizza_Modificada() {
    }

    public Pizza_Modificada(int id, Pedido pedido, Pizza_Vendida pizzavendida, Double quantidade) {
        this.id = id;
        this.pedido = pedido;
        this.pizzavendida = pizzavendida;
        this.quantidade = quantidade;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pizza_Vendida getPizzavendida() {
        return pizzavendida;
    }

    public void setPizzavendida(Pizza_Vendida pizzavendida) {
        this.pizzavendida = pizzavendida;
    }

    
}
