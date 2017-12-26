package my.ch.spring.kt.chapter9.dao;

import my.ch.spring.kt.chapter9.model.UserModel;

/**
 * @author chenh
 * @date 2017/12/26.
 */
public interface IUserDao {

    public void save(UserModel user);

    public int countAll();

}
