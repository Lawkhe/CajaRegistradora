package CajaRegistradora;

/**
 * @author umb-2021
 */
public class Cuenta {

  private int costo;
  private String productos;

  public Cuenta() {
    costo = 0;
    productos = "";
  }

  /**
   * @return the costo
   */
  public int getCosto() {
    return costo;
  }

  /**
   * @param costo the costo to set
   */
  public void setCosto(int costo) {
    this.costo = costo;
  }

  /**
   * @return the productos
   */
  public String getProductos() {
    return productos;
  }

  /**
   * @param productos the productos to set
   */
  public void setProductos(String productos) {
    this.productos = productos;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(this.productos.substring(0, this.productos.length()-1));
    sb.append("\nValor compra: ").append(this.costo);
    return sb.toString();
  }

}
