package head.first.design.pattern.rule.decorator.old.starbuzz.impl;

import head.first.design.pattern.rule.decorator.old.starbuzz.dp.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
