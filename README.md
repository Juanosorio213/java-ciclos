# Prácticas de Algoritmos en Java - Estructuras de Control y Ciclos

* **Autor:** Juan Sebastian Osorio
* **Programa academico:** Tecnologia En Desarrollo De Software
* **Fecha de entrega:** 04/09/26
## Descripción General del Proyecto

Este repositorio recopila una serie de ejercicios prácticos desarrollados en el lenguaje de programación Java, enfocados en el dominio de las estructuras de control repetitivas (`for`, `while`, `do-while`), condicionales (`if-else`), entrada de datos mediante la clase `Scanner` y la resolución de problemas lógicos y matemáticos.

## Ejercicios Incluidos

* **Ejercicio 1: Estadísticas de Sueldos**
  * Programa que solicita 10 sueldos por teclado, calcula la suma total de todos los sueldos ingresados y cuenta cuántas personas perciben un sueldo mayor a 500.
  * Utiliza un bucle `for` iterando 10 veces, un acumulador para los sueldos y un contador condicional `if (sueldo > 500)`.

<img width="1366" height="768" alt="ejercicio1" src="https://github.com/user-attachments/assets/e2e01bcb-6a67-4f0a-a333-866e3ba35bbd" />


* **Ejercicio 2 y 5: Simplificación de Fracciones**
  * Solicita al usuario un numerador y un denominador, reduce la fracción a su mínima expresión utilizando el Máximo Común Divisor (MCD) y muestra el resultado en pantalla (por ejemplo, de 24 y 30 obtiene "4/5").
  * Aplica el **algoritmo de Euclides** mediante un bucle `while (b != 0)` apoyado en el operador módulo (`%`), asegurando que las variables auxiliares capturen correctamente los datos del `Scanner` antes de realizar las divisiones de simplificación.

<img width="1366" height="768" alt="ejercicio2" src="https://github.com/user-attachments/assets/ca1b2757-3771-4e98-8bdc-0745d6cf0b66" />

<img width="1366" height="768" alt="ejercicio5" src="https://github.com/user-attachments/assets/196456b7-b2f2-47a8-82cd-8e77c6be78e6" />



* **Ejercicio 3: Conteo de Paridad y Signo**
  * Pide 10 números por teclado e indica de manera estructurada si cada número ingresado es positivo o negativo, así como si es par o impar.
  * Combina un ciclo `for` con estructuras condicionales `if-else` y validación de paridad por medio del operador módulo (`% 2 == 0`).
 
<img width="1366" height="768" alt="ejercicio3" src="https://github.com/user-attachments/assets/b7a49273-ea88-4a5b-83d1-59157fbdfeb6" />



* **Ejercicio 4: Cálculo de Potencias**
  * Solicita una base y un exponente (números enteros positivos) para calcular el resultado de la potenciación mediante iteraciones sucesivas.
  * Desarrollado con un bucle `for` acumulativo inicializado en 1 que multiplica iterativamente la base según el valor del exponente.

<img width="1366" height="768" alt="ejercicio4" src="https://github.com/user-attachments/assets/540ecee3-b2d1-4812-812a-fe7789f056cc" />



* **Ejercicio 6: Cálculo de Factorial con Validación**
  * Pide por teclado un número entero y calcula su factorial, exigiendo obligatoriamente que sea un valor no negativo (si se ingresa un número negativo, lo sigue pidiendo hasta que sea válido).
  * Utiliza una estructura iterativa de validación y un bloque de control para asegurar la correcta introducción de los datos.

<img width="1366" height="768" alt="ejercicio6" src="https://github.com/user-attachments/assets/8b71a9d9-8c8d-4fe4-895a-24961d5dfcd8" />



* **Ejercicio 7: Generación de Patrones Gráficos**
  * Programa que imprime en consola una secuencia escalonada de asteriscos en formato triangular incremental.
  * Implementado mediante **ciclos anidados** (`for` dentro de otro `for`), controlando de manera independiente las filas y la cantidad de caracteres impresos por línea.

<img width="1366" height="768" alt="ejercicio7" src="https://github.com/user-attachments/assets/56c05d95-bab7-4ec3-a10a-defa0484023c" />

CONCLUSIONES

El desarrollo de esta serie de programas permitió afianzar el dominio de las estructuras de control repetitivas (for, while, do-while) y condicionales (if-else) en Java, fundamentales para la resolución de problemas algorítmicos.

La implementación del operador módulo (%) demostró ser una herramienta versátil y clave tanto para validar paridades y múltiplos como para calcular residuos en algoritmos matemáticos complejos, tales como el de Euclides para la simplificación de fracciones.

Se comprobó la importancia del orden en la ejecución de código y la asignación estratégica de variables auxiliares y de acumulación, asegurando que los datos ingresados por el usuario mediante la clase Scanner se procesen correctamente sin alterar el flujo lógico ni generar errores de cálculo.
4. Selecciona el archivo de la clase que deseas probar (por ejemplo, `Ejercicio5.java`) y ejecútalo directamente desde el IDE para interactuar con la consola.
