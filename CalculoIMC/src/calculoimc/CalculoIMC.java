

package calculoimc;


public class CalculoIMC {

private Usuario usuario1;

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }
    
    public float AplicarFormula(){
    //Este metodo tiene logica
    //Todo lo declarado dentro de un metodo solo se puede usar en el metodo
    float resultado=usuario1.getPeso()/(usuario1.getAltura()*usuario1.getAltura());
     return resultado;
}
    
}
