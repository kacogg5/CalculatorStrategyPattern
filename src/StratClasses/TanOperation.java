package StratClasses;

import Interfaces.IUnaryOperation;

/**
 * StratClasses.CosOperation:
 * implemented by Kaleb Coggins
 * on 2/18/2021
 *
 * Implements Interfaces.IUnaryOperation, performs cosine operation cos(a).
 */

public class TanOperation implements IUnaryOperation {
    public String name() { return "tan"; }

    public float calculate(float a) {
        return (float)Math.tan(a);
    }
}
