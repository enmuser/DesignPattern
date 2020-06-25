package com.enmuser.chainofresponsible;

public class FilterContext {
    String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FilterContext{");
        sb.append("context='").append(context).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
