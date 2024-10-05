# Yorman Jose Carrascal Sanchez 191859
# CalculadoraTopicos191859
# Calculador de Trabajo Independiente de Estudiantes

Este proyecto está desarrollado en Kotlin y permite calcular el trabajo independiente de un estudiante a partir de los datos de una materia, incluyendo el nombre de la materia, horas teóricas, horas prácticas y cantidad de créditos.

## Tabla de Contenidos

- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)

## Requisitos

Para ejecutar este proyecto, necesitas tener instalado:

- [Java JDK 11 o superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Kotlin](https://kotlinlang.org/docs/command-line.html)

## Instalación

1. Clona el repositorio:
   git clone https://github.com/YormanS24/CalculadoraTopicos191859.git

## Uso

La aplicación "Calculador de Trabajo Independiente de Estudiantes" está diseñada para ayudar a los estudiantes a calcular el tiempo que deben dedicar a su trabajo independiente basado en la carga académica de una materia específica. A continuación se detallan los pasos para utilizar la aplicación:

1. Ingreso de Datos:
   Una vez que la aplicación esté en funcionamiento, se te solicitará ingresar la siguiente información:
   Nombre de la materia: Escribe el nombre de la materia para la cual deseas calcular el trabajo independiente.
   Horas teóricas: Indica cuántas horas teóricas se imparten en la materia.
   Horas prácticas: Especifica cuántas horas prácticas se requieren para la materia.
   Cantidad de créditos: Introduce cuántos créditos académicos corresponde a la materia.
2. Cálculo:
   Después de ingresar todos los datos, la aplicación calculará automáticamente el tiempo que el estudiante debería dedicar al trabajo independiente. Este cálculo tiene en cuenta las horas teóricas y prácticas, así como los créditos académicos de la materia.
   ejemplo del calculo:
   Horas por créditos =  Número de créditos * 48  = 3 * 48 = 144
   Horas presenciales =  (Hora teórica + Hora práctica) * Trabajo independiente del semestre=  (2 + 2) * 16= 64
   Trabajo independiente =     (Horas total por créditos - Horas total presenciales ) / Trabajo independiente del semestre   = (144 -  64 ) / 16 = 5
3. Resultados:
   La aplicación mostrará el resultado del cálculo, permitiendo al estudiante conocer de manera precisa cuánto tiempo debería invertir en el trabajo independiente para cumplir con los requisitos de la materia.
