package com.enmuser.chainofresponsible.v2;

/**
 * @description:
 * @author: enmuser
 * @time: 2020/6/25 17:37
 */
public interface Filter {

    boolean doFilter(Request request,Response response,FilterChain filterChain);
}
