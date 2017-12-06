package model;

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
public class Ingrediente_pizza_vendida implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Ingrediente_Pizza_Base ingpizzabase;
    @ManyToOne
    private Pizza_Vendida pizzavendida;
    private Double quantidade;

    public Ingrediente_pizza_vendida() {
    }

    public Ingrediente_pizza_vendida(int id, Ingrediente_Pizza_Base ingpizzabase, Pizza_Vendida pizzavendida, Double quantidade) {
        this.id = id;
        this.ingpizzabase = ingpizzabase;
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

    public Ingrediente_Pizza_Base getIngpizzabase() {
        return ingpizzabase;
    }

    public void setIngpizzabase(Ingrediente_Pizza_Base ingpizzabase) {
        this.ingpizzabase = ingpizzabase;
    }

    public Pizza_Vendida getPizzavendida() {
        return pizzavendida;
    }

    public void setPizzavendida(Pizza_Vendida pizzavendida) {
        this.pizzavendida = pizzavendida;
    }
    
    
}
