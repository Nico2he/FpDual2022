public class ProductoCongelado extends Producto{

    protected float temperaturaCongelacion;

    public ProductoCongelado(float temperaturaCongelacion, String fechaCaducidad, int numLote) {
        
        super(fechaCaducidad, numLote);
        this.temperaturaCongelacion = temperaturaCongelacion;

    }

}