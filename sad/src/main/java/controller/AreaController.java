package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Area;

public class AreaController implements Controller<Area>{
    private List<Area> areas = new ArrayList<Area>();
    private static long count = 1;

    @Override
    public void add(Area area) {
        area.setId(count);
        areas.add(area);
        count++;
    }

    @Override
    public Area get(long id) {
        for (Area area : areas) {
            if (area.getId() == id) {
                return area;
            }
        }
        return null;
    }

    @Override
    public List<Area> getAll() {
        return areas;
    }

    @Override
    public void update(Area area) {
        Area a = get(area.getId());
        if (a != null) {
            a.setNome(area.getNome());
        }
    }

    @Override
    public void remove(Area area) {
        Area a = get(area.getId());
        areas.remove(a);
    }
}