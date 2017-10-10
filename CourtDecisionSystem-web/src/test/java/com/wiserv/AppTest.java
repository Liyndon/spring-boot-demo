///*
//package com.wiserv;
//
//import com.anniweiya.fastdfs.FastDFSTemplate;
//import com.anniweiya.fastdfs.exception.FastDFSException;
//import com.github.pagehelper.Page;
//import com.wiserv.common.Assist;
//import com.wiserv.common.PageInfo;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//*
// * Unit test for simple App.
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class AppTest {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private FastDFSTemplate  fastDFSTemplate;
//
//    @Test
//    public void testFastdfs() {
//        try {
//            fastDFSTemplate.deleteFile(null);
//        } catch (FastDFSException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testFindByPage() {
//        Page<User> page = new Page<>();
//        page.setPageNum(1);
//        page.setPageSize(1);
//        Page<User> user = userService.findByPage(page);
//        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
//        PageInfo<User> pageInfo = new PageInfo<>(user);
//        Assert.assertNotNull(user);
//        System.out.println(pageInfo.toString());
//    }
//
//    @Test
//    public void testCacheByPage() {
//        List<User> persons = userService.selectUser(new Assist());
//        Assert.assertNotNull(persons);
//    }
//
//}
//*/
