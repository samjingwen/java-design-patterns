package io.samjingwen.visitor.core.visitable;

import io.samjingwen.visitor.core.model.Necessity;
import io.samjingwen.visitor.core.visitor.Visitor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NecessityVisitable implements Visitable {

    private final Necessity necessity;

    public double getPrice(){
        return necessity.getPrice();
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
