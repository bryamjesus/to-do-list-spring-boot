package pe.bryamtalledo.tareas.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import pe.bryamtalledo.tareas.model.Tarea;

public interface TareaRepository extends MongoRepository<Tarea, String> {
}
