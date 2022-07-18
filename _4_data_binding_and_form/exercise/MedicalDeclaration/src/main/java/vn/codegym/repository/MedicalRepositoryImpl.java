package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Medical;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements IMedicalRepository {
    static List<Medical> medicalList = new ArrayList<>();

    static {
        medicalList.add(new Medical("hao", "1999-07-08", "nam", "lào", "123321", "ô tô", "1", "2", "2022-08-08", "2022-09-09"));
        medicalList.add(new Medical("uyên", "1999-08-13", "nữ", "viet nam", "123321", "ô tô", "1", "2", "2022-08-08", "2022-09-09"));
        medicalList.add(new Medical("trung", "2003-07-18", "nam", "campuchia", "123321", "ô tô", "1", "2", "2022-08-08", "2022-09-09"));
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
