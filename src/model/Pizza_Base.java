package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author $martin.ruediger
 */
@Entity
public class Pizza_Base implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @OneToMany(mappedBy = "pizzabase")
    private List<Ingrediente_Pizza_Base> ingrediente_Pizza_Bases;
    @OneToMany(mappedBy = "pizzabase")
    private List<Pizza_Vendida> pizza_Vendidas;

    public Pizza_Base() {
    }

    public Pizza_Base(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    
    

}
