
interface Notificable {
    fun enviarNotificacion()
}

class CorreoElectronico(private val destinatario: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando correo a $destinatario: $mensaje")
    }
}

class MensajeTexto(private val numero: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando SMS a $numero: $mensaje")
    }
}

class NotificacionPush(private val usuario: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        println("Enviando notificación push a $usuario: $mensaje")
    }
}

fun main() {
    val notificaciones: List<Notificable> = listOf(
        CorreoElectronico("usuario@email.com", "Bienvenido a nuestro servicio."),
        MensajeTexto("+123456789", "Tu código de verificación es 1234."),
        NotificacionPush("Usuario123", "Tienes un nuevo mensaje en la app.")
    )

    notificaciones.forEach { it.enviarNotificacion() }
}
