let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let numerosIngresados = [];

while (true) {
  let numeroIngresado = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:");

  if (isNaN(numeroIngresado) || numeroIngresado < 1 || numeroIngresado > 100) {
    alert("Debes ingresar un número válido del 1 al 100");
    continue;
  }

  numerosIngresados.push(numeroIngresado);

  if (numeroIngresado === numeroSecreto) {
    let listaNumeros = numerosIngresados.join(", ");
    document.getElementById("mensaje").innerHTML = `Felicidades, adivinaste el número secreto. Números ingresados: ${listaNumeros}`;
    break;
  } else {
    document.getElementById("mensaje").innerHTML = "Ups, el número secreto es incorrecto, vuelve a intentarlo.";
  }
}

