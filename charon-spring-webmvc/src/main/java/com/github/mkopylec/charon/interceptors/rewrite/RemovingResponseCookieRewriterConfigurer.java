package com.github.mkopylec.charon.interceptors.rewrite;

import com.github.mkopylec.charon.interceptors.RequestForwardingInterceptorConfigurer;

public class RemovingResponseCookieRewriterConfigurer extends RequestForwardingInterceptorConfigurer<RemovingResponseCookieRewriter> {

    private RemovingResponseCookieRewriterConfigurer() {
        super(new RemovingResponseCookieRewriter());
    }

    public static RemovingResponseCookieRewriterConfigurer removingResponseCookieRewriter() {
        return new RemovingResponseCookieRewriterConfigurer();
    }
}