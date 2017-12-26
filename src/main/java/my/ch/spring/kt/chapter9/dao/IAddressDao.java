package my.ch.spring.kt.chapter9.dao;

import my.ch.spring.kt.chapter9.model.AddressModel;

/**
 * @author chenh
 * @date 2017/12/26.
 */
public interface IAddressDao {

    public void save(AddressModel address);

    public int countAll();
}

