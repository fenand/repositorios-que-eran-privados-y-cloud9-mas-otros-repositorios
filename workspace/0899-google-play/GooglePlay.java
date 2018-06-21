import java.util.ArrayList;

public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    
    public GooglePlay()
    {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
    }

    public int getNumeroUsuarios()
    {
        return usuarios.size();
    }
    
    public void addUsuario(Usuario nuevoUsuario)
    {
        usuarios.add(nuevoUsuario);
    }
    
    public void addProducto(Producto nuevoProducto)
    {
        productos.add(nuevoProducto);
    }
    
    public int getNumeroProductos()
    {
        return productos.size();
    }
    
    public double comprar(String usuario, String producto)
    {
        double aDevolver = -1;
        
        //Buscamos si existe el usuario
        Usuario usuarioABuscar = null;
        int contador = 0;
        while (contador < usuarios.size() && usuarioABuscar == null) {
            if (usuarios.get(contador).getNombreCuenta().equals(usuario)) {
                usuarioABuscar = usuarios.get(contador);
            }
            contador++;
        }
       
       //Buscamos si existe el producto
        Producto productoABuscar = null;       
        contador = 0;
        while (contador < productos.size() && productoABuscar == null) {
            if (productos.get(contador).getIdentificador().equals(producto)) {
                productoABuscar = productos.get(contador);
            }
            contador++;
        }
        
        
        //Si el producto y el usuario existen, se procede a la compra
        
        if (usuarioABuscar != null && productoABuscar != null) {
            aDevolver = productoABuscar.getPrecio();
            productoABuscar.vender();
            usuarioABuscar.comprar(productoABuscar);
        }
        
        return aDevolver;
    }
    
    
    
    
    
}
