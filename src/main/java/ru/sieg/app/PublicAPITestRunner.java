package ru.sieg.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.sieg.app.dao.ChequeDAO;

@Component
public class PublicAPITestRunner implements ApplicationRunner {

    @Autowired
    private ChequeDAO chequeDAO;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(chequeDAO.findById(1));
    }
}
