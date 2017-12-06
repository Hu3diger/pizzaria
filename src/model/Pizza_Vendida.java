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
public class Pizza_Vendida implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Pizza_Base pizzabase;
    @ManyToOne
    private Tamanho tamanho;
    @OneToMany(mappedBy = "pizzavendida")
    private List<Ingrediente_pizza_vendida> ingrediente_pizza_vendidas;
    @OneToMany(mappedBy = "pizzavendida")
    private List<Pizza_Modificada> pizza_Modificadas;

    public Pizza_Vendida() {
    }

    public Pizza_Vendida(int id, Pizza_Base pizzabase, Tamanho tamanho) {
        this.id = id;
        this.pizzabase = pizzabase;
        this.tamanho = tamanho;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
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
