package GlobalSurveys.Entity;

import GlobalSurveys.Entity.Sesion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-13T17:20:43")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> passwd;
    public static volatile SingularAttribute<Usuario, Long> idUsuario;
    public static volatile SingularAttribute<Usuario, Boolean> admin;
    public static volatile SingularAttribute<Usuario, String> nomUsuario;
    public static volatile ListAttribute<Usuario, Sesion> sesionList;

}