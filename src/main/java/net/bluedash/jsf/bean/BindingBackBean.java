package net.bluedash.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;

/**
 * @author Weinan Li
 * @created_at 08 18 2012
 */
@ManagedBean(name = "bindBean")
public class BindingBackBean {
    private UIInput name;

    public UIInput getName() {
        return name;
    }

    public void setName(UIInput name) {
        this.name = name;
    }

    public String getHello() {

        String msg;
        if (name.getValue() == null) {
            msg = "";
        } else {
            msg = name.getValue().toString();
        }
        return msg;
    }


}
