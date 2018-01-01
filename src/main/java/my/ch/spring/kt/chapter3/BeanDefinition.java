package my.ch.spring.kt.chapter3;

/**
 * @author chenh
 * @date 2017/12/20.
 */
public class BeanDefinition {
    //单例
    public static final String SCOPE_SINGLETON = "singleton";
    //原型
    public static final String SCOPE_PROTOTYPE = "prototype";
    //唯一标识
    private String id;
    //class全限定名
    private String clazz;
    //作用域
    private String scope = SCOPE_SINGLETON;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
