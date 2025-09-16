evaluacion final mod 4


App de Libros


Una aplicación móvil desarrollada en Android Studio que simula una tienda de libros. Permite a los usuarios navegar por un catálogo, ver descripciones detalladas y agregar libros a un carrito de compras virtual.

## Características de la aplicación 📖
### Catálogo de Libros: Muestra una lista de libros con sus títulos, autores e imágenes en un RecyclerView.

### Vista de Detalle: Al seleccionar un libro, se navega a una nueva pantalla que muestra su descripción completa.

### Carrito de Compras: Los usuarios pueden agregar libros a un carrito. El carrito muestra la cantidad total de ítems y el precio total.

### Navegación: La aplicación utiliza el componente de navegación de Android (Navigation Component) y una barra de navegación inferior (BottomNavigationView) para moverse entre las diferentes pantallas.

Estructura y funcionamiento del proyecto ⚙️
El proyecto se basa en la arquitectura de Fragmentos y el Navigation Component para gestionar las pantallas de la aplicación.

MainActivity.java: La actividad principal que configura la navegación y la BottomNavigationView.

LibrosFragment.java: Fragmento que muestra la lista de libros y maneja la navegación a la descripción y la adición al carrito.

DescripcionFragment.java: Muestra los detalles de un libro, recibiendo los datos a través de argumentos de navegación (Bundle).

CarritoFragment.java: Fragmento que muestra la lista de libros en el carrito, junto con el total de ítems y el precio.

Libro.java y Carrito.java: Clases de modelo que representan un libro y un ítem del carrito.

LibroAdapter.java y CarritoAdapter.java: Adaptadores para los RecyclerViews que enlazan los datos con la interfaz de usuario.

CarritoManager.java: Implementado como un Singleton para gestionar el estado del carrito de compras.

Decisiones de diseño 💡
La aplicación se diseñó con un enfoque en la modularidad, utilizando fragmentos para separar la interfaz de usuario. Se usó Data Binding y View Binding para acceder a las vistas de manera segura y eficiente, reduciendo el riesgo de errores.

La decisión de usar un Singleton para el CarritoManager fue una elección pragmática para la simplicidad de este proyecto. Sin embargo, en aplicaciones más grandes, una mejor práctica sería utilizar un ViewModel para gestionar los datos de la interfaz de usuario, lo que ayudaría a prevenir fugas de memoria y a mejorar el manejo del ciclo de vida de los datos.

Cómo ejecutar el proyecto 🚀
Para correr el proyecto, necesitas tener Android Studio instalado.

Clonar el repositorio:

Bash

git clone https://github.com/cristian-miranda-ben/eval_final_mod4.git
Abrir en Android Studio:

Abre Android Studio y selecciona File -> Open.

Navega a la carpeta donde clonaste el proyecto y haz clic en OK.

Sincronizar Gradle:

Espera a que Android Studio sincronice las dependencias de Gradle automáticamente. Si no lo hace, haz clic en el botón "Sync Project with Gradle Files" .

Ejecutar:

Conecta un dispositivo Android por USB o selecciona un emulador.

Haz clic en el botón "Run"  para compilar e instalar la aplicación.
