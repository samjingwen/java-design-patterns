package io.samjingwen.visitor.core.visitor;

import io.samjingwen.visitor.core.visitable.LiquorVisitable;
import io.samjingwen.visitor.core.visitable.NecessityVisitable;
import io.samjingwen.visitor.core.visitable.TobaccoVisitable;
import java.text.DecimalFormat;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TaxVisitor implements Visitor {

  DecimalFormat decimalFormat = new DecimalFormat("#.##");
  double taxRate = 0.18;

  @Override
  public double visit(LiquorVisitable liquor) {
    log.info("Liquor item: Price with Tax");
    return Double.parseDouble(decimalFormat.format(liquor.getPrice() * (1 + taxRate)));
  }

  @Override
  public double visit(TobaccoVisitable tobacco) {
    log.info("Tobacco item: Price with Tax");
    return Double.parseDouble(decimalFormat.format(tobacco.getPrice() * (1 + taxRate)));
  }

  @Override
  public double visit(NecessityVisitable necessity) {
    log.info("Necessity item: Price with Tax");
    return Double.parseDouble(decimalFormat.format(necessity.getPrice() * (1 + taxRate)));
  }
}
