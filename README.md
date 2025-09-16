# evaluacion final mod 4 
Título del proyecto
App de Libros
Una aplicación móvil desarrollada en Android Studio que simula una tienda de libros. Permite a los usuarios navegar por un catálogo de libros, ver descripciones detalladas y agregar libros a un carrito de compras virtual.

Características de la aplicación
📚 Catálogo de Libros: Muestra una lista de libros con sus títulos, autores e imágenes en un RecyclerView.
📖 Vista de Detalle: Al seleccionar un libro, se navega a una nueva pantalla que muestra su descripción completa.
🛒 Carrito de Compras: Los usuarios pueden agregar libros a un carrito. El carrito muestra la lista de ítems, el total de libros y el precio total.
➡️ Navegación: La aplicación utiliza el componente de navegación de Android (Navigation Component) y una barra de navegación inferior (BottomNavigationView) para moverse entre las diferentes pantallas.

Estructura y Funcionamiento del Proyecto
El proyecto se basa en la arquitectura de Fragmentos y el Navigation Component para gestionar las pantallas de la aplicación.

MainActivity.java: La actividad principal que configura la navegación. Utiliza el NavHostFragment para albergar los fragmentos y conecta la BottomNavigationView para manejar la navegación entre LibrosFragment, CarritoFragment y DescripcionFragment.

LibrosFragment.java: Este fragmento muestra la lista principal de libros. Utiliza un RecyclerView y el LibroAdapter para poblar la vista. Cuando un usuario hace clic en un libro, se navega al DescripcionFragment, y cuando se hace clic en el botón "Agregar", se añade el libro al carrito.

DescripcionFragment.java: Muestra los detalles de un libro específico. Recibe los datos (título, autor, descripción, etc.) a través de argumentos de navegación (Bundle).

CarritoFragment.java: Muestra los libros agregados por el usuario. También utiliza un RecyclerView con su propio CarritoAdapter. Calcula y muestra la cantidad total de libros y el precio total.

Libro.java y Carrito.java: Son clases POJO (Plain Old Java Object) que modelan los datos de un libro y un ítem en el carrito, respectivamente.

LibroAdapter.java y CarritoAdapter.java: Son adaptadores para los RecyclerViews. Son responsables de inflar las vistas de los ítems y de vincular los datos del modelo a las vistas (onBindViewHolder).

CarritoManager.java: Implementado como un Singleton para gestionar el estado del carrito de compras. Esta decisión permite que el carrito sea accesible desde cualquier parte de la aplicación (por ejemplo, desde el LibroAdapter), aunque se reconoce que una solución con ViewModel sería una mejor práctica para manejar el ciclo de vida y evitar fugas de memoria en aplicaciones más complejas.

Cómo ejecutar el proyecto
Para correr el proyecto, necesitas tener Android Studio instalado.

Clonar el repositorio:
git clone https://github.com/tu-usuario/nombre-del-repositorio.git

Abrir en Android Studio:

Abre Android Studio y selecciona File -> Open.

Navega a la carpeta donde clonaste el proyecto y haz clic en OK.

Sincronizar Gradle:

Android Studio debería iniciar una sincronización de Gradle de forma automática para descargar las dependencias. Si no lo hace, haz clic en el botón "Sync Project with Gradle Files"  en la barra de herramientas.

Ejecutar en un emulador o dispositivo físico:

Conecta un dispositivo Android por USB o crea un emulador de Android.

Haz clic en el botón "Run"  (el ícono del triángulo verde) en la barra de herramientas para compilar e instalar la aplicación en el dispositivo o emulador seleccionado.

