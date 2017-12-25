package my.ch.spring.kt.chapter7;

/**
 * @author chenh
 * @date 2017/12/22.
 */
public class TraditionalJdbcTest {
//    @Test
//    public void test() throws Exception {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        try {
//            conn = getConnection();              //1.获取JDBC连接
//            //2.声明SQL
//            String sql = "select * from INFORMATION_SCHEMA.SYSTEM_TABLES";
//            pstmt = conn.prepareStatement(sql);    //3.预编译SQL
//            ResultSet rs = pstmt.executeQuery();   //4.执行SQL
//            process(rs);                       //5.处理结果集
//            closeResultSet(rs);                 //5.释放结果集
//            closeStatement(pstmt);              //6.释放Statement
//            conn.commit();                    //8.提交事务
//        } catch (Exception e) {
//            //9.处理异常并回滚事务
//            conn.rollback();
//            throw e;
//        } finally {
//            //10.释放JDBC连接，防止JDBC连接不关闭造成的内存泄漏
//            closeConnection(conn);
//        }
//    }
}
