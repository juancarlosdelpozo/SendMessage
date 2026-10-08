# Historial de cambios

Las entradas siguientes describen la evolución del ejercicio SendMessage.

## 08/10/2026 - Actualización de documentación y entrega

- Se incorporó la carpeta `.opencode` proporcionada en clase, con las skills de documentación y licencia.
- Se reorganizó y amplió el README con descripción, características, arquitectura, puesta en marcha, pruebas, documentación y evidencias.
- Se añadió `MANUAL_USUARIO.md`.
- Se añadió una carpeta `documentacion/imagenes` con capturas reales del proyecto.
- Se copió a la raíz `app-release.apk`, usando el APK release firmado que ya se había generado previamente.
- Se añadió un workflow para generar Dokka y publicar la documentación mediante GitHub Pages.
- Se reforzó el workflow de Android CI para ejecutar pruebas unitarias y compilar la aplicación y sus pruebas instrumentadas.

## 06/10/2026 - Modelos, KDoc, recursos y pruebas

- Se documentaron con KDoc `SendActivity`, `ViewActivity`, `Message` y `Person`.
- Se añadieron recursos reutilizables en `strings.xml`, `dimens.xml`, `colors.xml` y `styles.xml`.
- Se añadió el estilo `MessageText` para reutilizar tipografía, color y tamaño de texto.
- Se añadió `MessageSerializationTest` para comprobar la serialización del objeto anidado.
- Se añadió `MessageFlowTest` con Espresso para comprobar remitente, mensaje, icono, vuelta a la pantalla inicial y campos vacíos.
- Dokka quedó configurado para generar la documentación HTML en la carpeta `docs` de la raíz del proyecto.
- Se activó el plugin Kotlin Parcelize como en el proyecto de referencia de clase, manteniendo el paso de datos mediante `Serializable`.

## 03/10/2026 - GitHub Actions

- Se configuró Android CI en GitHub Actions para comprobar el proyecto tras cada push a `master`.

## 30/09/2026 - Remitente y objeto serializable

- Se añadió un campo para escribir el remitente.
- Se crearon los modelos `Person` y `Message`, ambos serializables.
- El Intent transporta el objeto `Message` con el texto y su `Person` remitente.
- La segunda pantalla recupera el objeto y muestra ambos datos.

## v1.0 - Configuración inicial

- Creación del proyecto SendMessage.
- Creación de `SendActivity` y `ViewActivity`.
- Diseño de interfaces mediante XML.
- Comunicación entre Activities mediante Intent.
- Comprobación del ciclo de vida mediante Logcat.
- Depuración mediante breakpoints.
- Documentación mediante KDoc y Dokka.
