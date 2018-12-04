package com.joofont.springboot.dao;

import com.joofont.springboot.entity.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cui jun on 2018/12/3.
 * @version 1.0
 */
public interface StoreMapper extends JpaRepository<Store, Long> {

    Store findByUserName(String userName);

    Store findByUserNameOrEmail(String username, String email);

    List<Store> findByUserNameContaining(String username);

    Page<Store> findByUserName(String userName, Pageable pageable);

}
