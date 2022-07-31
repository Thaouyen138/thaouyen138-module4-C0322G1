package vn.codegym.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.phone.model.Phone;
import vn.codegym.phone.service.IPhoneService;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/blog/api/v2")
public class PhoneController {

    @Autowired
    private IPhoneService iPhoneService;
    @GetMapping
    public ResponseEntity<List<Phone>> getPhoneList() {
        List<Phone> phoneList = iPhoneService.findAll();
        if (phoneList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(phoneList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Phone> getBlogId(@PathVariable Integer id) {
        Phone phone = (iPhoneService.findById(id));
        if (phone == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(phone, HttpStatus.OK);
    }

}
