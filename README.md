# SendMessage

Aplicación Android desarrollada en Kotlin para la asignatura DEINT.

## Descripción

SendMessage permite al usuario introducir un mensaje en una primera Activity y enviarlo a una segunda Activity, donde se muestra el texto recibido.

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

1. El usuario introduce un mensaje.
2. Pulsa el botón **Enviar**.
3. `SendActivity` recoge el texto introducido.
4. Se crea un `Intent`.
5. El mensaje se envía mediante `putExtra`.
6. `ViewActivity` recibe el mensaje.
7. El mensaje se muestra en pantalla.

## Estructura principal

- `SendActivity.kt`: gestiona la introducción y envío del mensaje.
- `ViewActivity.kt`: recibe y muestra el mensaje.
- `activity_send.xml`: interfaz de la pantalla de envío.
- `activity_view.xml`: interfaz de la pantalla de visualización.

## Depuración

Se ha comprobado el ciclo de vida de las Activities mediante Logcat y se han utilizado breakpoints para inspeccionar el valor de las variables durante la ejecución.

## Documentación

El código está documentado mediante KDoc y la documentación técnica se genera mediante Dokka.