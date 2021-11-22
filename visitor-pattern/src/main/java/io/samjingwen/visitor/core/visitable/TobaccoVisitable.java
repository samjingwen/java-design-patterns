package io.samjingwen.visitor.core.visitable;

import io.samjingwen.visitor.core.visitor.Visitor;
import io.samjingwen.visitor.core.model.Tobacco;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TobaccoVisitable implements Visitable {

    private final Tobacco tobacco;

    public double getPrice(){
        return tobacco.getPrice();
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
