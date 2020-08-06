# language: es
@ApiGenericOHI
Característica: Tarifación de  convenios
  Como Analista de afiliación
  Quiero que se puedan gestionar  los manuales tarifarios que se tienen en la compañia
  Para dar continuidad al proceso de negociación con los proveedores

   Escenario:Creacion de un manual tarifario existente
    Cuando se solicite la creación de un manual tarifario existente con con un codigo de convenio "PRUEBA_POSTMAN", una descripcion "Prueba Manual tarifario por servicio", moneda "COP" y un tipo de unidad "POR_UNIDAD"
    Entonces no es posible llevar a cabo la creación del manual y se le informa al usuario "GEN-ORA-00001: Este &#34;Manual Tarifario&#34; ya existe"