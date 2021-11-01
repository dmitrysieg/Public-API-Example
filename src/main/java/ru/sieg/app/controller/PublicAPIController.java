package ru.sieg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.sieg.app.dao.ChequeDAO;
import ru.sieg.app.entity.Cheque;

import java.util.Collection;

@RestController
public class PublicAPIController {

    @Autowired
    private ChequeDAO chequeDAO;

    @GetMapping("/cheque")
    public Collection<Cheque> getChequeById(@RequestParam final long id) {
        return chequeDAO.findById(id);
    }
}
