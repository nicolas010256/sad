package controller;

import java.util.List;

import dao.AreaDAO;
import dao.AreaDAOImpl;
import dao.exceptions.AreaDAOException;
import entity.Area;
import entity.Orientador;

public class AreaController {
    private AreaDAO dao = new AreaDAOImpl();

    public void add(Area area) {
        try {
            dao.add(area);
        } catch (AreaDAOException e) {
            e.printStackTrace();
        }
    }

    public Area get(long id) {
        Area area = null;
        try {
            area = dao.get(id);
        } catch (AreaDAOException e) {
            e.printStackTrace();
        }
        return area;
    }

    public List<Area> getByOrientador(Orientador orientador) {
        List<Area> areas = null;
        try {
            areas = dao.getByOrientador(orientador);
        } catch (AreaDAOException e) {
            e.printStackTrace();
        }
        return areas;
    }

    public List<Area> getAll() {
        List<Area> areas = null;
        try {
            areas = dao.getAll();
        } catch (AreaDAOException e) {
            e.printStackTrace();
        }
        return areas;
    }

    public void update(Area area) {
        try {
            dao.update(area);
        } catch (AreaDAOException e) {
            e.printStackTrace();
        }
    }

    public void remove(Area area) {
        try {
            dao.remove(area);
        } catch (AreaDAOException e) {
            e.printStackTrace();
        }
    }
}