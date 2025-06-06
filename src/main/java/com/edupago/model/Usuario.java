import org.apache.commons.math3.analysis.function.Identity;

Identity
public class Usuario {
    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;
    private String rol;
}
