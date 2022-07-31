package com.github.white.interpreter;

import java.util.Map;

/**
 * AdditionExpression: The type addition expression. 加法解释器
 *
 * @author White
 * @version 1.0
 * @date 2022/08/01 01:18
 */
public class AdditionExpression extends SymbolExpression {

    /**
     * Instantiates a new Symbol expression.
     *
     * @param left  the left
     * @param right the right
     */
    public AdditionExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    /**
     * Interpret int. 处理相加
     *
     * @param map the map
     * @return the int
     */
    @Override
    public int interpret(Map<String, Integer> map) {
        return super.getLeft().interpret(map) + super.getRight().interpret(map);
    }
}
