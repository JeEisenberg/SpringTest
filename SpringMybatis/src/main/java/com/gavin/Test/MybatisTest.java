package com.gavin.Test;

import com.gavin.Pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
@Test
public void findBookByBookId() throws IOException {
    String resource = "mybatis-config.xml";
//    loader config and then  source sqlsession
    InputStream inputStream = Resources.getResourceAsStream(resource);

   // GET  SqlSessionFactory
    SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
   // CREATE  SqlSession  by SqlSessionFactory

    SqlSession sqlSession = build.openSession();
    Book book = sqlSession.selectOne("com.gavin.Mapper.BookMapper.selectBook", 1001);
    System.out.println(book);
    sqlSession.close();
}

}
