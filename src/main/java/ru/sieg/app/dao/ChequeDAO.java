package ru.sieg.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sieg.app.entity.Cheque;

import java.util.List;

@Repository
public interface ChequeDAO extends CrudRepository<Cheque, Long> {

    List<Cheque> findById(long id);
}
