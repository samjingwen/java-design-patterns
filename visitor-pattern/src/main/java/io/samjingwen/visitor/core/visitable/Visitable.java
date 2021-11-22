package io.samjingwen.visitor.core.visitable;

import io.samjingwen.visitor.core.visitor.Visitor;

public interface Visitable {
  double accept(Visitor visitor);
}
