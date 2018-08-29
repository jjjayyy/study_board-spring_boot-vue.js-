package com.mih.board;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

 
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MihBoardJhApplication.class)
@WebAppConfiguration
public class MihBoardJhApplicationTests {
    
    @Autowired
    private SqlSessionFactory sqlSession; //작성
 
    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testSqlSession() throws Exception{//작성
        
        System.out.println("sqlSession : "+sqlSession);
        
    }


}