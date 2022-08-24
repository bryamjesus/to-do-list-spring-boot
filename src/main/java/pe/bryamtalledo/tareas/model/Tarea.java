package pe.bryamtalledo.tareas.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Tarea {
    @Id
    private String id;
    private String nombre;
    private Boolean completado;
}
