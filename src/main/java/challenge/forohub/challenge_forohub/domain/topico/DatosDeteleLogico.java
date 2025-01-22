package challenge.forohub.challenge_forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosDeteleLogico(
        Long id,
        String autor,
        String titulo,
        LocalDateTime fecha_de_creacion,
        Boolean status
) {
}
