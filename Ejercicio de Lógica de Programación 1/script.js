//Solicitar los datos y guardarlos en variables
let num1 = parseInt(prompt("Ingrese el primer número"));
let num2 = parseInt(prompt("Ingrese el segundo número"));
let num3 = parseInt(prompt("Ingrese el tercer número"));

//Verificar si los números son iguales
if(num1 === num2 && num2 === num3){
  console.log("Los números son iguales");
} else{
  //Ordenar los números de mayor a menor y mostrarlos en consola
  let numerosOrdenadosDesc = [num1, num2, num3].sort((a, b) => b - a);
  console.log(numerosOrdenadosDesc);
  
  //Ordenar los números de menor a mayor y mostrarlos en consola
  let numerosOrdenadosAsc = [num1, num2, num3].sort((a, b) => a - b);
  console.log(numerosOrdenadosAsc);
}
