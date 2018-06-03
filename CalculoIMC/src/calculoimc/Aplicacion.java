
package calculoimc;


public class Aplicacion {
    
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setAltura(1.70F);
        u.setPeso(65);
        
        CalculoIMC c= new CalculoIMC();
        c.setUsuario1(u);
        
          System.out.println(c.AplicarFormula());
        
    }
}
