package my.ch.spring.cache;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.lang.reflect.Method;

/**
 * Created by chenh on 2017/6/9.
 */
public class MyKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
//        if(params.length == 0){
//            System.out.println("key1   "+target.getClass().getName()+":"+ SimpleKey.EMPTY);
//            return target.getClass().getName()+":"+ SimpleKey.EMPTY;
//        }
//        System.out.println("key2   "+target.getClass().getName()+":"+params[0]);

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");
        String name ="12314455";//
        // String name = (String) exp.getValue(context);
        return target.getClass().getName()+":"+name;
    }

//    Object generateKey(Object result) {
//        EvaluationContext evaluationContext = createEvaluationContext(result);
//    }
//    private EvaluationContext createEvaluationContext(Object result) {
//        return evaluator.createEvaluationContext(this.caches, this.metadata.method, this.args,
//                this.target, this.metadata.targetClass, result, beanFactory);
//    }
//
//    protected Expression getExpression(Map<ExpressionKey, Expression> cache,
//                                       AnnotatedElementKey elementKey, String expression) {
//
//        ExpressionKey expressionKey = createKey(elementKey, expression);
//        Expression expr = cache.get(expressionKey);
//        if (expr == null) {
//            expr = getParser().parseExpression(expression);
//            cache.put(expressionKey, expr);
//        }
//        return expr;
//    }
//
//    private CachedExpressionEvaluator.ExpressionKey createKey(AnnotatedElementKey elementKey, String expression) {
//        return new CachedExpressionEvaluator.ExpressionKey(elementKey, expression);
//    }
}
