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
public class Ingrediente_Pizza_Base implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Pizza_Base pizzabase;
    @ManyToOne
    private Ingrediente ingrediente;
    @OneToMany(mappedBy = "ingpizzabase")
    private List<Ingrediente_pizza_vendida> ingrediente_pizza_vendidas;

    public Ingrediente_Pizza_Base() {
    }

    public Ingrediente_Pizza_Base(int id, Pizza_Base pizzabase, Ingrediente ingrediente) {
        this.id = id;
        this.pizzabase = pizzabase;
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Pizza_Base getPizzabase() {
        return pizzabase;
    }

    public void setPizzabase(Pizza_Base pizzabase) {
        this.pizzabase = pizzabase;
    }
    
    
}
