package net.bluedash.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloPB {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Say hello + name that was entered.
     *
     * @return
     */
    public String getHello() {
        if (name == null || name.length() < 1) {
            return null;
        }
        return "Hello " + name;
    }
}




