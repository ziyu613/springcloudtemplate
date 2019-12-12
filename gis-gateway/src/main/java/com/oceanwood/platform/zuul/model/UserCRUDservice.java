package com.oceanwood.platform.zuul.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * user crud service
 *
 * @author By TianF
 **/

@Service
public class UserCRUDservice implements UserCRUD {

    private UserCRUD usercrud;

    @Override
    public UserInfo findByUsername(String _name) {

        return usercrud.findByUsername(_name);
    }

    @Override
    public <S extends UserInfo> S save(S s) {
        return null;
    }

    @Override
    public <S extends UserInfo> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<UserInfo> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<UserInfo> findAll() {
        return null;
    }

    @Override
    public Iterable<UserInfo> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(UserInfo userInfo) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserInfo> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
