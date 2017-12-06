package model;

import java.io.Serializable;

/**
 *
 * @author martin.ruediger
 */
public interface IEntity extends Serializable{

    public int getId();
    public void setId(int id);
    
}