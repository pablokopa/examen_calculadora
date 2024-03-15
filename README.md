 # Examen COD
1. Hago 'git clone' al repositorio ya subido de la calculadora
2. Creo una nueva rama llamada 'raices' desde la cual voy a trabajar
3. Creo una variable final para la opcion RAIZ, después cre una case RAIZ con sus correspondientes operaciones
4. Según el índice seleccionado se hará la raiz cuadrada con 'Math.sqrt' o la raiz cúbica con 'Math.cbrt'.
5. Para que el resultado funcione correctamente debo hacer un cast a float.
6. Para cualquier tipo de indice habría que utiliza la siguiente fórmula 'Math.pow(num1, 1/num2)' 
7. Una vez terminado se hace merge-squash para unificar todos los commits en uno solo, en este caso en la main.
8. Ahora creo el jar para usarlo como  libreria. Para ello iré a Project Structure > Artifacts > Jar > From modules with dependencies.
En main class se deja vacío para utilizarlo como librería.
9. Finalmente se irá a Build > Build Artifacts para crear el .jar.
10. Creo el release en github con la libreria.