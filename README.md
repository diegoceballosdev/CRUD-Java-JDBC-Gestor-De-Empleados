# CRUD-Java-JDBC-Gestor-De-Empleados
Proyecto CRUD con IGU haciendo uso de Java, JDBC, Maven, EclipseLink y MySQL.

# Contexto del Proyecto
Se necesita de un formulario para almacenar los datos de los empleados de una empresa.

Para ello, se pide el desarrollo de una aplicación que sea capaz de registrar los siguientes datos por cada empleado: ID, Nombre, Apellido, Edad, Sueldo.

Para poder registrar de manera sencilla y que sea atractiva para el usuario, el cliente solicita una interfaz grafica.

Como los datos deben permanecer en el tiempo y a futuro, se requiere que cada uno de los registros sean almacenados en una base de datos.

A partir de éste relevamiento de requerimientos:

- Realizar el desarrollo de una aplicación de escritorio que sea capaz de registrar, en una base de datos, los datos de los empleados que se ingresen desde una interfaz gráfica de usuario.
- Los datos registrados deben poder editarse y eliminarse de forma sencilla por parte del usuario.
- Dada la posibilidad de un incremento exponencial en la cantidad de empleados, se recomienda una opcion de busqueda para hallar facilmente a los empleados mediante su ID.
- Los errores deben manejarse de forma optima, tal que el usuario sea informado de los inconvenientes cuando se produzca algun error en la operaciones CRUD.
- La lista de empleados debe ser visible todo el tiempo desde la interfaz.
- Como adicional se pide que tambien sea visible de forma constante: la cantidad total de empleados de la empresa y el costo total (suma) del sueldo de todos los empleados.

# Aplicación Desarrollada
> Al iniciar la aplicacion se muestra la siguiente pantalla de inicio:

![gestempleados](https://github.com/diegoceballosdev/CRUD-Java-JDBC-Gestor-De-Empleados/assets/122060010/49cf38ec-1360-4ca2-92d1-ef91368f2b2e)

> La carga de los empleados se realiza llenando los campos con la informacion correspondiente (ID esta deshabilitado porque es un valor autoincremental), y presionando el boton "Agregar". Tras esto, inmediatamente se actualizara la lista de empleados y los indicadores de la cantidad de empleados y del total de los sueldos. En caso de que al presionar el boton "agregar" los campos del formulario no se llenen por completo, o se coloquen letras en los campos edad y sueldo, o directamente esten todos los campos vacios, entonces se mostrar el sigueinte mensaje de error:

![error](https://github.com/diegoceballosdev/CRUD-Java-JDBC-Gestor-De-Empleados/assets/122060010/ab17bc41-6af6-4b3b-b31d-5fb76c68b8ba)

> El boton "Buscar" tiene la funcion de encontrar un empleado por su ID, y tambien sera necesario para modificar y actualizar los datos de un empleado. Al presionar en el boton "Buscar" se abre una pequeña ventana para ingresar un ID, y aqui se debe ingresar el ID del empleado que queremos modificar (es facil saber el ID ya que la lista de empleados es visible todo el tiempo). Se mostrara un mensaje de error ante un fallo al ingresar el ID:

![BUSCAR](https://github.com/diegoceballosdev/CRUD-Java-JDBC-Gestor-De-Empleados/assets/122060010/0ea7fe35-59b0-47e1-9370-a6d3ee697b43)

> Posterior a esto, los campos del formularion se llenaran con los datos de este empleado y podras modificar estos datos. Luego de realizar los cambios deseados, se presiona el boton "Actualizar". Tras esto, inmediatamente se actualizara la lista de empleados (con las nuevas modificaciones) y el indicador del total de los sueldos (si es que modificamos el sueldo del empleado). Se mostrara un mensaje de error si se dan las mismas situaciones invalidas que se dan cuando se trata de agregar un empleado.

![error](https://github.com/diegoceballosdev/CRUD-Java-JDBC-Gestor-De-Empleados/assets/122060010/ab17bc41-6af6-4b3b-b31d-5fb76c68b8ba)

> Para eliminar los datos de un empleado, sera necesario conocer el ID de este de antemano (nuevamente facil, ya que la lista de empleados es visible todo el tiempo). Al presionar el boton "Eliminar" se pedira el ingreso del ID, si es correcto el empleado se elimina de la base de datos y toda la informacion en pantalla se actualiza (lista e indicadores). Si no se ingresa un ID o si este no existe, se mostraran los correspondientes mensajes de error:

![elim](https://github.com/diegoceballosdev/CRUD-Java-JDBC-Gestor-De-Empleados/assets/122060010/23ed9c3a-f103-4237-8057-fefa059bde74)

> En cuanto al boton "Limpíar" su funcion es vaciar los campos del formulario.

> La tabla (lista) de empleados que se visualiza, como ya se mencionó antes, se actualiza inmediatamente tras agregar, modificar o eliminar empleados. Y los indicadores de cantidad de empleados y total de sueldos lo haran tras agregar, eliminar, o cuando se actualizen los datos de salario de algun empleado.

He tratado de resumir de forma simple y superficial los apartados de la apliación, sin embargo pueden observar los detalles de implementación en el propio codigo. Invito a todos aquellos que estan en su proceso de aprendizaje a implementar este CRUD, clonar este repositorio y jugar con el código.

Gracias por leer esta contribución!!!
