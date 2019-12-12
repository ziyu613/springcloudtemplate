package com.oceanwood.platform.zuul.model;

import org.springframework.data.repository.CrudRepository;

/**
 * user crud
 *
 * @author By TianF
 **/
public interface UserCRUD extends CrudRepository<UserInfo, Integer> {

    UserInfo findByUsername(String _name);
}
