package com.example.memorydb.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T, ID> extends Repository<T, ID>{

    //CREATE, UPDATE
    //기존의 데이터가 있으면 UPDATE 없으면 SAVE
    T save(T data);

    //READ
    Optional<T> findById(ID id);


    List<T> findAll();

    //DELETE
    void delete(ID id);
}
