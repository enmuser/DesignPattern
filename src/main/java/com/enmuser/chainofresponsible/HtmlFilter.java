package com.enmuser.chainofresponsible;

public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(FilterContext context) {
        context.setContext(context.getContext().replace("<","[").replace(">","]"));
        return true;
    }
}
