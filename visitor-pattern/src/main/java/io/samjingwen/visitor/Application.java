package io.samjingwen.visitor;

import io.samjingwen.visitor.core.model.Liquor;
import io.samjingwen.visitor.core.model.Necessity;
import io.samjingwen.visitor.core.model.Tobacco;
import io.samjingwen.visitor.core.visitor.TaxVisitor;
import io.samjingwen.visitor.core.visitable.LiquorVisitable;
import io.samjingwen.visitor.core.visitable.NecessityVisitable;
import io.samjingwen.visitor.core.visitable.TobaccoVisitable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
  public static void main(String[] args) {
      TaxVisitor taxCalc = new TaxVisitor();

      NecessityVisitable milk = new NecessityVisitable(new Necessity(3.47));
      LiquorVisitable vodka = new LiquorVisitable(new Liquor(11.99));
      TobaccoVisitable cigar = new TobaccoVisitable(new Tobacco(19.99));

      log.info(milk.accept(taxCalc) + "");
      log.info(vodka.accept(taxCalc) + "");
      log.info(cigar.accept(taxCalc) + "");
  }
}
