package com.enmuser.chainofresponsible;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(FilterContext context) {

        context.setContext(context.getContext().replace("996","955"));
        return false;
    }
}
