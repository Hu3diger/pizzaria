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
public class Modificacoes implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Pizza_Modificada pizzamodifi;
    @ManyToOne
    private Ingrediente ingrediente;
    private Double quantidade;

    public Modificacoes() {
    }

    public Modificacoes(int id, Pizza_Modificada pizzamodifi, Ingrediente ingrediente, Double quantidade) {
        this.id = id;
        this.pizzamodifi = pizzamodifi;
        this.ingrediente = ingrediente;
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

    public Pizza_Modificada getPizzamodifi() {
        return pizzamodifi;
    }

    public void setPizzamodifi(Pizza_Modificada pizzamodifi) {
        this.pizzamodifi = pizzamodifi;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    
}
