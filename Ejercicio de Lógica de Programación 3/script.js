
// Se declara la variable 'num', que se usará para almacenar el número ingresado por el usuario
// Se inicializa la variable 'factorial' en 1
let num; 
let factorial = 1; 

do { // Se utiliza un bucle do-while para asegurarse de que el usuario ingrese un número válido
  num = prompt("Ingrese un número:"); 
  // Si el valor ingresado no es un número, se muestra un mensaje de error y se vuelve a solicitar el número
  if (isNaN(num)) {
    alert("Error: Debe ingresar un número válido.");
  }
} while (isNaN(num));
// Se utiliza un bucle for para calcular el factorial del número ingresado
// Se multiplica 'factorial' por cada número entero positivo desde 1 hasta el número ingresado
for (let i = 1; i <= num; i++) { 
  factorial *= i; 
}

document.write(`El factorial de ${num} es ${factorial}.`); 