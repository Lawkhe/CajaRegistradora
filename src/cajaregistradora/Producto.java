package CajaRegistradora;

/**
 *
 * @author umb-2021
 */
public class Producto {

  private String nombre;
  private int precio;

  public Producto() {
  }

  public Producto(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the precio
   */
  public int getPrecio() {
    return precio;
  }

  /**
   * @param precio the precio to set
   */
  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Producto: ").append(this.nombre).append(".\n")
      .append("Precio: ").append(this.precio).append(".\n")
      .append("________________________");
    return sb.toString();
  }

}
