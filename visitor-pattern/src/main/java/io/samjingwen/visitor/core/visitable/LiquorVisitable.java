package io.samjingwen.visitor.core.visitable;

import io.samjingwen.visitor.core.model.Liquor;
import io.samjingwen.visitor.core.visitor.Visitor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LiquorVisitable implements Visitable {

    private final Liquor liquor;

    public double getPrice(){
        return liquor.getPrice();
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
