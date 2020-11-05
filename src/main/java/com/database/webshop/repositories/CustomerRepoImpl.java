package com.database.webshop.repositories;

import com.database.webshop.controller.CustomerController;
import com.database.webshop.models.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

//@Repository("CustomerRepo")
public class CustomerRepoImpl {

    Logger log = Logger.getLogger(CustomerRepoImpl.class.getName());

    /*@Override
    public <S extends Products> S save(S s) {
        return save(s);
    }

    @Override
    public <S extends Products> Iterable<S> saveAll(Iterable<S> iterable) {
        return saveAll(iterable);
    }

    @Override
    public Optional<Products> findById(Long aLong) {
        return findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return existsById(aLong);
    }

    @Override
    public Iterable<Products> findAll() {
        return findAll();
    }

    @Override
    public Iterable<Products> findAllById(Iterable<Long> iterable) {
        return findAllById(iterable);
    }

    @Override
    public long count() {
        return count();
    }

    @Override
    public void deleteById(Long aLong) {
        deleteById(aLong);
    }

    @Override
    public void delete(Products products) {
        delete(products);
    }

    @Override
    public void deleteAll(Iterable<? extends Products> iterable) {
        deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        deleteAll();
    }*/

    /*@PersistenceContext
    private EntityManager em;

    @Override
    public Iterable<Products> getProductList(int amount, int page_no) {
        StoredProcedureQuery findByProductProcedure =
                em.createNamedStoredProcedureQuery("getProductList").setParameter(amount, Products.class).setParameter(page_no, Products.class);
        return findByProductProcedure.getResultList();
    }*/
}
