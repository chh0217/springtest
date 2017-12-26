package my.ch.spring.kt.chapter9.service;

import my.ch.spring.kt.chapter9.model.AddressModel;

/**
 * @author chenh
 * @date 2017/12/26.
 */
public interface IAddressService {
    public void save(AddressModel address);
    public int countAll();
}
