# Proyecto POO en Java

## Descripción del Proyecto: Simulador de Tienda en Línea
Este proyecto que es un **Simulador de Tienda en Línea** en **Java**, donde los usuarios pueden interactuar con una tienda virtual, agregar productos a un carrito de compras y realizar pedidos. La idea principal es modelar el flujo básico de una tienda en línea, permitiendo que los usuarios seleccionen productos, gestionen su carrito y finalmente realicen sus compras.

## Objetivos Principales
- **Simular el proceso de compra en línea**: Desarrollar una aplicación que represente el ciclo completo de compra en línea, desde la selección de productos hasta la creación de un pedido.
- **Gestión de productos**: La tienda debe ofrecer una lista de productos disponibles que los usuarios puedan ver y agregar a su carrito.
- **Gestión de usuarios**: Los usuarios deben poder interactuar con la tienda, realizar acciones como agregar productos a su carrito y hacer pedidos.
- **Control de pedidos**: Al realizar un pedido, la tienda debe poder manejar múltiples pedidos de diferentes usuarios y mostrar el historial de pedidos realizados.
- **Flexibilidad y expansión futura**: El diseño del sistema debe ser modular y escalable, permitiendo agregar funcionalidades como sistemas de pago o inventario.

## Funcionalidades Principales

### 1. Gestión de Productos
La tienda debe contener una lista de productos que los usuarios pueden comprar. Cada producto tendrá los atributos básicos como:
- **Nombre del producto**.
- **Precio**.

Los productos estarán disponibles en la tienda para ser visualizados y agregados al carrito por parte de los usuarios.

### 2. Carrito de Compras
Cada usuario tendrá un carrito de compras personalizado. El carrito permitirá:
- **Agregar productos**: Los usuarios pueden agregar uno o varios productos al carrito, especificando la cantidad.
- **Eliminar productos**: Si lo desean, los usuarios pueden eliminar productos específicos del carrito.
- **Calcular el total**: El carrito mantendrá el total de la compra en función de los productos y cantidades añadidas.
- **Vaciar el carrito**: Una vez que los usuarios hacen un pedido, el carrito se vaciará automáticamente.

### 3. Gestión de Usuarios
Cada usuario tendrá un perfil que incluye un nombre y un correo electrónico. Los usuarios pueden realizar las siguientes acciones:
- **Agregar productos al carrito**: A través de la tienda, los usuarios seleccionarán productos y los agregarán a su carrito.
- **Ver su carrito**: Los usuarios pueden ver los productos agregados al carrito, las cantidades y el costo total.
- **Realizar pedidos**: Una vez que el usuario esté satisfecho con su carrito, puede proceder a crear un pedido. Este pedido contendrá todos los productos del carrito y calculará el total.

### 4. Gestión de Pedidos
Una vez que el usuario ha agregado productos a su carrito, puede proceder a realizar un pedido. La tienda manejará los pedidos de la siguiente manera:
- **Crear pedidos**: Cuando un usuario decide hacer una compra, los productos de su carrito se transfieren a un nuevo pedido, y el carrito se vacía.
- **Calcular el total del pedido**: El sistema calculará el total del pedido sumando el costo de cada producto multiplicado por la cantidad pedida.
- **Almacenar pedidos en la tienda**: La tienda mantendrá un registro de todos los pedidos realizados por los usuarios.
- **Mostrar pedidos**: Se podrá ver una lista de los pedidos realizados, junto con los productos en cada pedido y su costo total.

### 5. Tienda (Store)
La tienda actuará como el intermediario que gestiona tanto los productos como las órdenes. Las funcionalidades incluyen:
- **Agregar productos a la tienda**: El administrador de la tienda puede agregar nuevos productos al inventario.
- **Agregar usuarios**: Los usuarios se registran en la tienda para realizar sus compras.
- **Ver pedidos**: La tienda podrá ver todos los pedidos realizados por los usuarios.

## Conclusión
El proyecto de **Simulador de Tienda en Línea** tiene como objetivo replicar un proceso básico de compra en línea, con un enfoque en la interacción usuario-carrito-pedido. Las funcionalidades son simples pero extensibles, permitiendo la futura implementación de nuevas características como sistemas de pago, manejo de inventarios y descuentos.

Este proyecto se centrará en la lógica detrás del manejo de usuarios, productos y pedidos, asegurando que el sistema sea robusto y capaz de manejar múltiples pedidos de diferentes usuarios. Al utilizar conceptos como agregación, composición y asociación, se logra una estructura clara y bien definida entre las diferentes clases.
