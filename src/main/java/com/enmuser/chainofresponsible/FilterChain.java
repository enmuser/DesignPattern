package com.enmuser.chainofresponsible;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();


    public void addFilter(Filter filter){
        filters.add(filter);
    }

    @Override
    public boolean doFilter(FilterContext context) {
        for(Filter filter:filters){
            if(!filter.doFilter(context)) return false;
        }
        return true;
    }
}
