package com.enmuser.chainofresponsible.v2;

/**
 * @description:
 * @author: enmuser
 * @time: 2020/6/25 17:46
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.str +=  " Step2-request->SensitiveFilter()";
        filterChain.doFilter(request,response,filterChain);
        response.str += "Step2-response->SensitiveFilter()";
        return true;
    }
}
