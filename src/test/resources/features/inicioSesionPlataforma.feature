# language: es
Característica: Autenticación satisfactoria en las aplicaciones relacionadas con la afiliación de una persona a la ARL
  Como Analista de afiliación
  Quiero ingresar a las plataformas solución de afiliación a la ARL
  Para iniciar un proceso de afiliación

  Esquema del escenario: Autenticación satisfactoria para iniciar a operar sobre la plataforma
    Cuando el <rol> se encuentre autenticado en <plataforma>
    Entonces se habilita el inicio de la plataforma
    Ejemplos:
    |rol   |plataforma|
    |Admin |OIPA      |
    |Devops|OHI       |