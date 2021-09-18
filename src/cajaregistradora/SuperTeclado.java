package CajaRegistradora;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author umb-2021
 */
public final class SuperTeclado {

  public static String leerTexto() {
    try {
      return new BufferedReader(
        new InputStreamReader(System.in)
      ).readLine().trim();
    } catch (IOException e) {
      System.out.println("Digite nuevamente el valor");
      return leerTexto();
    }
  }

  public static char leerCaracter() {
    try {
      return new BufferedReader(
        new InputStreamReader(System.in)
      ).readLine().trim().charAt(0);
    } catch (IOException e) {
      System.out.println("Digite nuevamente el valor");
      return leerCaracter();
    }
  }
  
  public static int leerNumero() {
    try {
      return Integer.parseInt(
        new BufferedReader(
          new InputStreamReader(System.in)
        ).readLine().trim()
      );
    } catch (IOException | NumberFormatException e) {
      System.out.println("Digite nuevamente el valor");
      return leerNumero();
    }
  }
  
  public static long leerNumeroLargo() {
    try {
      return Long.parseLong(
        new BufferedReader(
          new InputStreamReader(System.in)
        ).readLine().trim()
      );
    } catch (IOException | NumberFormatException e) {
      System.out.println("Digite nuevamente el valor");
      return leerNumeroLargo();
    }
  }

}
