package io.samjingwen.chainofresponsibility.core;

import io.samjingwen.chainofresponsibility.auth.AuthenticationProvider;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AuthenticationProcessor {

    protected final AuthenticationProcessor next;

    public abstract boolean isAuthorized(AuthenticationProvider authenticationProvider);

}
