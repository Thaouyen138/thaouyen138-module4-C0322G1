package vn.codegym.service;

import org.springframework.stereotype.Service;


@Service
public class SpiceServiceImpl implements ISpiceService {

    @Override
    public String[] displaySpice(String[] listSpice) {
        if (listSpice == null) {
            return listSpice = new String[]{"nothing!"};
        } else {
            return listSpice;
        }
    }
}
