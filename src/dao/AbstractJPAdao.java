package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import model.IEntity;

/**
 *
 * @author hu3diger
 */
public abstract class AbstractJPAdao<T extends IEntity> implements IDao<T>{

    private final Class<T> clazz;

    public AbstractJPAdao() {
        clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    } 

    @Override
    public void save(T t) {
        JpaUtil.getEntityManager().getTransaction().begin();
        if (t.getId() == 0) {
            JpaUtil.getEntityManager().persist(t);
        } else {
            JpaUtil.getEntityManager().merge(t);
        }
        JpaUtil.getEntityManager().getTransaction().commit();
        JpaUtil.closeEntityManager();
    }

    @Override
    public T findById(int id) {
        return JpaUtil.getEntityManager().find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        return JpaUtil.getEntityManager()
                .createQuery("select c from "+clazz.getSimpleName()+"c")
                .getResultList();
    }

    @Override
    public void delete(int id) {
        JpaUtil.getEntityManager().remove(
                JpaUtil.getEntityManager()
                .getReference(clazz, id));
    }

    @Override
    public void delete(T t) {
        delete(t.getId());
    }

}