package my.ch.spring.kt.chapter9.dao.jdbc;

import my.ch.spring.kt.chapter9.dao.IUserDao;
import my.ch.spring.kt.chapter9.model.UserModel;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

/**
 * @author chenh
 * @date 2017/12/26.
 */
public class UserJdbcDaoImpl extends NamedParameterJdbcDaoSupport implements IUserDao {
    private final String INSERT_SQL = "insert into user(name) values(:name)";
    private final String COUNT_ALL_SQL = "select count(*) from user";

    @Override
    public void save(UserModel user) {
        KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
        getNamedParameterJdbcTemplate().update(INSERT_SQL, paramSource, generatedKeyHolder);
        user.setId(generatedKeyHolder.getKey().intValue());
    }

    @Override
    public int countAll() {
        return getJdbcTemplate().queryForObject(COUNT_ALL_SQL, Integer.class);
    }
}
