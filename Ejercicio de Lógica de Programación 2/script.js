// Solicitar al usuario la temperatura en grados Celsius
let temperaturaCelsius;
     do {
       temperaturaCelsius = prompt("Ingrese la temperatura en grados Celsius:");
}       while (isNaN(temperaturaCelsius));

// Convertir a números
temperaturaCelsius = parseFloat(temperaturaCelsius);

// Convertir a grados Fahrenheit y Kelvin
const temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
const temperaturaKelvin = temperaturaCelsius + 273.15;

// Mostrar resultados por DOM
const resultadoFahrenheit = document.createElement("p");
       resultadoFahrenheit.textContent = `Grados Fahrenheit: ${temperaturaFahrenheit}`;
       document.body.appendChild(resultadoFahrenheit);

const resultadoKelvin = document.createElement("p");
        resultadoKelvin.textContent = `Grados Kelvin: ${temperaturaKelvin}`;
         document.body.appendChild(resultadoKelvin);
