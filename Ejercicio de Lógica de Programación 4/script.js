const fibonacci = () => {
    let num = prompt("Ingrese un número para mostrar la serie de Fibonacci:");
  
    while (isNaN(num)) {
      num = prompt("El valor ingresado no es un número. Intente de nuevo:");
    }
  
    num = Number(num);
  
    let fibonacciArr = [];
  
    for (let i = 0; i < num; i++) {
      if (i === 0) {
        fibonacciArr.push(0);
      } else if (i === 1) {
        fibonacciArr.push(1);
      } else {
        fibonacciArr.push(fibonacciArr[i - 1] + fibonacciArr[i - 2]);
      }
    }
  
    const output = fibonacciArr.join(", ");
  
    const resultElement = document.createElement("p");
    resultElement.textContent = output;
    document.body.appendChild(resultElement);
  };
  
  fibonacci();
  
  