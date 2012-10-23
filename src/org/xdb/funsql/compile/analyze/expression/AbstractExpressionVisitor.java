package org.xdb.funsql.compile.analyze.expression;

import org.xdb.error.Error;
import org.xdb.funsql.compile.expression.AbstractExpression;
import org.xdb.funsql.compile.expression.AggregationExpression;
import org.xdb.funsql.compile.expression.ComplexExpression;
import org.xdb.funsql.compile.expression.SimpleExpression;

public abstract class AbstractExpressionVisitor implements IExpressionVisitor {

	public abstract Error visit();
	
	@Override
	public Error visit(AbstractExpression expr) {
		Error e = new Error();
		switch (expr.getType()) {
		case SIMPLE_EXPRESSION:
			return this.visitSimpleExpression((SimpleExpression) expr);
		case MULT_EXPRESSION:
			return this.visitMultExpression((ComplexExpression) expr);
		case ADD_EXPRESSION:
			return this.visitAddExpression((ComplexExpression) expr);
		case SIGNED_EXPRESSION:
			return this.visitSignedExpression((ComplexExpression) expr);
		case AGG_EXPRESSION:
			return this.visitAggregationExpression((AggregationExpression) expr);
		}
		return e;
	}
}
