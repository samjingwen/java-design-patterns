package io.samjingwen.visitor.core.visitor;

import io.samjingwen.visitor.core.visitable.LiquorVisitable;
import io.samjingwen.visitor.core.visitable.NecessityVisitable;
import io.samjingwen.visitor.core.visitable.TobaccoVisitable;

public interface Visitor {
  double visit(LiquorVisitable liquor);

  double visit(TobaccoVisitable tobacco);

  double visit(NecessityVisitable necessity);
}
