package com.danieltepeque.manegedBeans;

import com.danieltepeque.entities.Motivoreservacion;
import com.danieltepeque.manegedBeans.util.JsfUtil;
import com.danieltepeque.manegedBeans.util.JsfUtil.PersistAction;
import com.danieltepeque.sessionsBeans.MotivoreservacionFacadeLocal;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("motivoreservacionController")
@SessionScoped
public class MotivoreservacionController implements Serializable {

    @EJB
    private MotivoreservacionFacadeLocal ejbFacade;
    private List<Motivoreservacion> items = null;
    private Motivoreservacion selected;

    public MotivoreservacionController() {
    }

    public Motivoreservacion getSelected() {
        return selected;
    }

    public void setSelected(Motivoreservacion selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private MotivoreservacionFacadeLocal getFacade() {
        return ejbFacade;
    }

    public Motivoreservacion prepareCreate() {
        selected = new Motivoreservacion();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("MotivoreservacionCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("MotivoreservacionUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("MotivoreservacionDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Motivoreservacion> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Motivoreservacion getMotivoreservacion(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Motivoreservacion> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Motivoreservacion> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Motivoreservacion.class)
    public static class MotivoreservacionControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            MotivoreservacionController controller = (MotivoreservacionController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "motivoreservacionController");
            return controller.getMotivoreservacion(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Motivoreservacion) {
                Motivoreservacion o = (Motivoreservacion) object;
                return getStringKey(o.getIdmotivoreservacion());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Motivoreservacion.class.getName()});
                return null;
            }
        }

    }

}
