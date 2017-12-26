package my.ch.spring.kt.chapter9.service.impl;

import my.ch.spring.kt.chapter9.dao.IAddressDao;
import my.ch.spring.kt.chapter9.model.AddressModel;
import my.ch.spring.kt.chapter9.service.IAddressService;
import my.ch.spring.kt.chapter9.util.TransactionTemplateUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author chenh
 * @date 2017/12/26.
 */
public class AddressServiceImpl implements IAddressService {
    private IAddressDao addressDao;
    private PlatformTransactionManager txManager;
    public void setAddressDao(IAddressDao addressDao) {
        this.addressDao = addressDao;
    }
    public void setTxManager(PlatformTransactionManager txManager) {
        this.txManager = txManager;
    }
    @Override
    public void save(final AddressModel address) {
        TransactionTemplate transactionTemplate = TransactionTemplateUtils.getDefaultTransactionTemplate(txManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                addressDao.save(address);
            }
        });
    }
    @Override
    public int countAll() {
        return addressDao.countAll();
    }
}
