package my.ch.spring.cache;

import org.springframework.context.expression.AnnotatedElementKey;
import org.springframework.util.ObjectUtils;

/**
 * Created by chenh on 2017/6/19.
 */
public class ExpressionKey implements Comparable<ExpressionKey> {

        private final AnnotatedElementKey element;

        private final String expression;

        protected ExpressionKey(AnnotatedElementKey element, String expression) {
            this.element = element;
            this.expression = expression;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpressionKey)) {
                return false;
            }
            ExpressionKey otherKey = (ExpressionKey) other;
            return (this.element.equals(otherKey.element) &&
                    ObjectUtils.nullSafeEquals(this.expression, otherKey.expression));
        }

        @Override
        public int hashCode() {
            return this.element.hashCode() + (this.expression != null ? this.expression.hashCode() * 29 : 0);
        }

        @Override
        public String toString() {
            return this.element + (this.expression != null ? " with expression \"" + this.expression : "\"");
        }

        @Override
        public int compareTo(ExpressionKey other) {
            int result = this.element.toString().compareTo(other.element.toString());
            if (result == 0 && this.expression != null) {
                result = this.expression.compareTo(other.expression);
            }
            return result;
        }
}
