
package operaciones;

import hibernate.Factura;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;




public class Operaciones {
    
    public String generarNroFactura(int dato){
        
        int cont = 1;
        String numero = "";
        int cant = 0;
        
        if(dato >= 10000000){
            
            numero = ""+dato;
        }
        if((dato >= 1000000) && (dato < 10000000)){
            
            numero = "0"+dato;
        }
        if((dato >= 100000) && (dato < 1000000)){
            
            numero = "00"+dato;
        }
        if((dato >= 10000) && (dato < 100000)){
            
            numero = "000"+dato;
        }
        if((dato >= 1000) && (dato < 10000)){
            
            numero = "0000"+dato;
        }
        if((dato >= 100) && (dato < 1000)){
            
            numero = "00000"+dato;
        }
        if((dato >= 10) && (dato < 100)){
            
            numero = "000000"+dato;
        }
        if(dato < 9){
            
            numero = "0000000"+dato;
        }
        return numero;
    }
    
    public void guardarFactura(Factura factura) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(factura);
        t.commit();
        s.close();
        
    }
    
       
    public List<Factura> listaFactura() {

        List<Factura> l = null;

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        l = s.createQuery("FROM Factura").list();

        return l;
    }
    
    public double peso(){
    
    double p = 0;
        try {
            String peso = JOptionPane.showInputDialog("Peso: ");
            p = Double.parseDouble(peso);
            
        } catch (Exception e) {

        }
        return p;
    }
    
    public void actualizarFactura(Factura f) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.update(f);
        t.commit();
        s.close();
        
    }
    
    //metodo para eliminar alumno
    public void eliminar(Factura factura) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.delete(factura);
        t.commit();
        s.close();
    }
    
    //metodo para ver si existe el usuario en la BD, y si existe que devuelva el objeto
    public Factura existeFactura(int nroFactura) {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s;
        s = sf.openSession();
        Transaction t = s.beginTransaction();

        try {
            Factura busqueda = (Factura) s.createCriteria(Factura.class).add(Restrictions.eq("idFactura", nroFactura)).uniqueResult();
            if (busqueda != null) {
                return busqueda;
            }
        } catch (Exception e) {
            s.getTransaction().rollback();
        }
        t.commit();
        s.close();
        return null;
    }
}
    

