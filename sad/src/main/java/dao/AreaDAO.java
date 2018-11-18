package dao;

import java.util.List;

import dao.exceptions.AreaDAOException;
import entity.Area;
import entity.Orientador;

public interface AreaDAO {

    void add(Area area) throws AreaDAOException;

    Area get(long id) throws AreaDAOException;

    List<Area> getByOrientador(Orientador orientador) throws AreaDAOException;

    void update(Area area) throws AreaDAOException;

    void remove(Area area) throws AreaDAOException;
     
}