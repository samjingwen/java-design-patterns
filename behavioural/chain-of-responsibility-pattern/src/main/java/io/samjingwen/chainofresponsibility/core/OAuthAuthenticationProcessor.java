package io.samjingwen.chainofresponsibility.core;

import io.samjingwen.chainofresponsibility.auth.AuthenticationProvider;
import io.samjingwen.chainofresponsibility.auth.OAuthTokenProvider;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OAuthAuthenticationProcessor extends AuthenticationProcessor {

  public OAuthAuthenticationProcessor(AuthenticationProcessor next) {
    super(next);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
    if (authenticationProvider instanceof OAuthTokenProvider) {
      log.info("OAuthTokenProvider authenticated");
      return true;
    } else if (next != null) {
      return next.isAuthorized(authenticationProvider);
    } else {
      return false;
    }
  }
}
