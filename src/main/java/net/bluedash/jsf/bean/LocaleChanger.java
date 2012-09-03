package net.bluedash.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.Locale;

/**
 * @author Weinan Li
 * @created_at 09 03 2012
 */
@ManagedBean
@SessionScoped
public class LocaleChanger {

    public String englishAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(Locale.ENGLISH);
        System.out.println("Language set to English.");
        return null;
    }

    public String germanAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(Locale.GERMAN);
        System.out.println("Language set to German.");
        return null;
    }
}
