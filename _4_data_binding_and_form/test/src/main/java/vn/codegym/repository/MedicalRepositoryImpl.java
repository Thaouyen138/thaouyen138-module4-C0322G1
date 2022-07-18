package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Medical;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements IMedicalRepository {
    static List<Medical> medicalList = new ArrayList<>();

    static {
        medicalList.add(new Medical("hảo", "1999-07-08", "Tàu bay", "2022-07-07", "2022-08-08", "không"));
        medicalList.add(new Medical("uyên", "1999-08-13", "Tàu thuyền", "2022-07-07", "2022-08-08", "không"));
        medicalList.add(new Medical("trung", "2003-07-18", "Ô tô", "2022-07-07", "2022-08-08", "có"));
    }

    @Override
    public List<Medical> findAll() {
        return medicalList;
    }

    @Override
    public void create(Medical medical) {
        medicalList.add(medical);
    }
}
