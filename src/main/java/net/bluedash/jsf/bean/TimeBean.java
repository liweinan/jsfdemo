package net.bluedash.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Weinan Li
 * @created_at 08 11 2012
 */
@ManagedBean
@RequestScoped
public class TimeBean {

    public Date getNow() {
        return Calendar.getInstance().getTime();
    }
}
