package com.pangan.project.donut;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonutService {
    private List<Donut> _donutList = new ArrayList<Donut>();

    public List<Donut> getAllDonuts() {
        return _donutList;
    }

    public Donut getDonutById(String donutId) {
        for (Donut donut: _donutList) {
            if (donut.getId().equals(donutId))
                return donut;
        }

        return new Donut("defaultDonut", "Default Round Donut");
    }

    public Donut addNewDonut(Donut newDonut) {
        _donutList.add(newDonut);
        return _donutList.get(_donutList.size() - 1);
    }

    public Donut updateDonutById(Donut updatedDonut, String donutId) {
        for (int i = 0; i < _donutList.size(); i++) {
            Donut tempDonut = _donutList.get(i);
            if (tempDonut.getId().equals(donutId)) {
                _donutList.get(i).setId(updatedDonut.getId());
                _donutList.get(i).setName(updatedDonut.getName());
                return _donutList.get(i);
            }
        }

        return null;
    }

    public String deleteDonutById(String donutId) {
        _donutList.removeIf(donut -> donut.getId().equals(donutId));
        return "DONUT DELETED!";
    }
}
