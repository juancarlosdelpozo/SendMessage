# SendMessage

Aplicación Android desarrollada en Kotlin para la asignatura DEINT.

## Descripción

SendMessage permite al usuario introducir el nombre de un remitente y un mensaje en una primera Activity. Los datos se almacenan en un objeto `Message`, que contiene un objeto `Person`, y se envían mediante un `Intent` a una segunda Activity, donde se muestran el remitente y el texto recibido.

## Tecnologías utilizadas

- Android Studio
- Kotlin
- XML
- Android SDK
- Intents
- Logcat
- KDoc
- Dokka

## Funcionamiento

1. El usuario introduce el nombre del remitente y un mensaje.
2. Pulsa el botón **Enviar**.
3. `SendActivity` recoge los datos introducidos.
4. Se crea un objeto `Person` con el nombre del remitente.
5. Se crea un objeto `Message` que contiene el texto y el objeto `Person`.
6. El objeto `Message` se envía mediante un `Intent` usando `putExtra`.
7. `ViewActivity` recupera el objeto serializable.
8. Se muestran en pantalla el remitente y el mensaje.

## Estructura principal

- `SendActivity.kt`: gestiona la introducción y envío del mensaje.
- `ViewActivity.kt`: recibe y muestra el mensaje.
- `activity_send.xml`: interfaz de la pantalla de envío.
- `activity_view.xml`: interfaz de la pantalla de visualización.
- - `Person.kt`: representa al remitente y es serializable.
- `Message.kt`: representa el mensaje y contiene un objeto `Person`.

## Depuración

Se ha comprobado el ciclo de vida de las Activities mediante Logcat y se han utilizado breakpoints para inspeccionar el valor de las variables durante la ejecución.

## Documentación

El código está documentado mediante KDoc y la documentación técnica se genera mediante Dokka.

## Capturas de pantalla

### Pantalla de envío

En esta pantalla el usuario introduce el nombre del remitente y el mensaje que desea enviar.

![Pantalla de envío](screenshots/send_screen.png)

### Pantalla de visualización

La segunda pantalla recibe un objeto `Message` serializable que contiene el texto del mensaje y un objeto `Person` con los datos del remitente.

![Pantalla de visualización](screenshots/view_screen.png)