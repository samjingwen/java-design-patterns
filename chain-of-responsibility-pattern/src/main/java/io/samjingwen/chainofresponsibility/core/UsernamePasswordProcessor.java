package io.samjingwen.chainofresponsibility.core;

import io.samjingwen.chainofresponsibility.auth.AuthenticationProvider;
import io.samjingwen.chainofresponsibility.auth.UsernamePasswordProvider;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsernamePasswordProcessor extends AuthenticationProcessor {
  public UsernamePasswordProcessor(AuthenticationProcessor next) {
    super(next);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
    if (authenticationProvider instanceof UsernamePasswordProvider) {
      log.info("UsernamePasswordProvider authenticated");
      return true;
    } else if (next != null) {
      return next.isAuthorized(authenticationProvider);
    } else {
      return false;
    }
  }
}
