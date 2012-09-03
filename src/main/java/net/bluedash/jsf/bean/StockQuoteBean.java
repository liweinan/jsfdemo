package net.bluedash.jsf.bean;

import javax.faces.bean.ManagedBean;

/**
 * @author Weinan Li
 * @created_at 08 19 2012
 */
@ManagedBean(name = "stockQuote")
public class StockQuoteBean {
    public Float getQuote(float i) {
        return i;
    }
}
