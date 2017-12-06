package dao;

import java.util.List;
/**
 *
 * @author hu3diger
 */
public interface IDao<T> { 
    
    public T findById(int id);
    public List<T> findAll() ;
    public void save(T object);
    public void delete(T object);
    public void delete(int id);
    
    
}