package com.oceanwood.platform.zuul.controller;

import com.oceanwood.platform.zuul.model.UserCRUDservice;
import com.oceanwood.platform.zuul.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServletRequest;

/**
 * DefaultController
 *
 * @author By TianF
 **/

@RestController
@RequestMapping("/rest/default")
public class DefaultController {
    @Autowired
    private UserCRUDservice crudService;

    @GetMapping("/goLogin/{name}")
    public ResponseEntity<UserInfo> checkLoginInfo(@PathVariable  String username, HttpServletRequest req) throws Exception{

        UserInfo userEntity = crudService.findByUsername(username);
        if (userEntity == null) {
            throw new UnavailableException("没有匹配的用户实体类型");
        }
        else {
            return ResponseEntity.ok(userEntity);
        }

    }
}
