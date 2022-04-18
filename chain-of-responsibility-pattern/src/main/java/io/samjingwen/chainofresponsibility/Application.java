package io.samjingwen.chainofresponsibility;

import io.samjingwen.chainofresponsibility.auth.OAuthTokenProvider;
import io.samjingwen.chainofresponsibility.auth.UsernamePasswordProvider;
import io.samjingwen.chainofresponsibility.core.AuthenticationProcessor;
import io.samjingwen.chainofresponsibility.core.OAuthAuthenticationProcessor;
import io.samjingwen.chainofresponsibility.core.UsernamePasswordProcessor;

public class Application {
  public static void main(String[] args) {
    AuthenticationProcessor authenticationProcessor =
        new OAuthAuthenticationProcessor(new UsernamePasswordProcessor(null));

    authenticationProcessor.isAuthorized(new UsernamePasswordProvider());
    authenticationProcessor.isAuthorized(new OAuthTokenProvider());
  }
}
