package my.ch.spring.springEL;

import my.ch.spring.cache.dao.UserDao;
import my.ch.spring.cache.domain.User;
import org.springframework.context.expression.MethodBasedEvaluationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Method;
import java.util.GregorianCalendar;

/**
 * Created by chenh on 2017/6/19.
 */
public class ELTest {
    public static void main(String[] args) throws Exception{
        test2();
    }

    private static void test2() throws Exception{
        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);

        User tesla = new User(11L,"Nikola Tesla", "133", "Serbian");

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");
        String name = (String) exp.getValue(tesla);
        System.out.println(name);//Nikola Tesla
    }
    private static void test1(){
        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);

        User tesla = new User(11L,"Nikola Tesla", "133", "Serbian");

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");
        EvaluationContext context = new StandardEvaluationContext(tesla);

        String name = (String) exp.getValue(context);
        System.out.println(name);//Nikola Tesla
    }
}
