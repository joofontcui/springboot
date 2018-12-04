package com.joofont.springboot;

import com.joofont.springboot.dao.StoreMapper;
import com.joofont.springboot.entity.Store;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author cui jun on 2018/12/3.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StoreTests {

    @Autowired
    private StoreMapper storeMapper;

    @Transactional(rollbackFor = Exception.class)
    @Test
    public void testJPA() {
//        Store store = storeMapper.findByUserName("李白");
//        System.out.println("[book:]" + store);
//
//        store.setId(null);
//        Store s = storeMapper.save(store);
//        System.out.println("[s:]" + s);
//
//        List<Store> storeList =storeMapper.findAll();
//        System.out.println("[storeList:]" + storeList);
//
//        Store store1 = storeMapper.findOne(1L);
//        System.out.println("[store1:]" + store1);
//
//        storeMapper.delete(store);
//
//        long count = storeMapper.count();
//        System.out.println("[count:]" + count);
//
//        boolean isExists = storeMapper.exists(1L);
//        System.out.println("[isExists:]" + isExists);

        int page=0, size=10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(page, size, sort);
        Page<Store> storeList = storeMapper.findByUserName("李白", pageable);
        System.out.println("storeList" + storeList);
    }

}
