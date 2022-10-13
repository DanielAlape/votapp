/*
  CLASE 12 DE OCTUBRE - SPRINT 4 (RETO 4) - JS (VotApp)
*/

var vectorCandidatos = new Array(4); // 4 Índices para 4 candidatos

// Se incia el conteo de votos desde 0 para cada candidato
vectorCandidatos[0] = 0;
vectorCandidatos[1] = 0;
vectorCandidatos[2] = 0;
vectorCandidatos[3] = 0;

// Función que suma un 1 cada vez que se da click sobre "Votar" en determinado candidato
function votar(candidato) {
  vectorCandidatos[candidato] = vectorCandidatos[candidato] + 1; // Le suma 1 al valor del índice
  alert("Gracias por su voto!");
}

// Función que nos muestra el resultado o el escrutinio de la votación
function resultados() {
  let total = vectorCandidatos[0] + vectorCandidatos[1] + vectorCandidatos[2] + vectorCandidatos[3];
  let porCan1 = (vectorCandidatos[0] / total) * 100;
  let porCan2 = (vectorCandidatos[1] / total) * 100;
  let porCan3 = (vectorCandidatos[2] / total) * 100;
  let porCan4 = (vectorCandidatos[3] / total) * 100;

  let nodoParrafo = document.createElement('p');
  let nodoParrafo2 = document.createElement('p');
  let nodoParrafo3 = document.createElement('p');
  let nodoParrafo4 = document.createElement('p');

  let texto = document.createTextNode("Votos Candidato 1: " + vectorCandidatos[0] + " - Porcentaje: " + porCan1 + "%");
  let texto2 = document.createTextNode("Votos Candidato 2: " + vectorCandidatos[1] + " - Porcentaje: " + porCan2 + "%");
  let texto3 = document.createTextNode("Votos Candidato 3: " + vectorCandidatos[2] + " - Porcentaje: " + porCan3 + "%");
  let texto4 = document.createTextNode("Votos Candidato 4: " + vectorCandidatos[3] + " - Porcentaje: " + porCan4 + "%");

  nodoParrafo.appendChild(texto);
  nodoParrafo2.appendChild(texto2);
  nodoParrafo3.appendChild(texto3);
  nodoParrafo4.appendChild(texto4);

  let elementoDiv = document.getElementById('EstVot');
  elementoDiv.appendChild(nodoParrafo);
  elementoDiv.appendChild(nodoParrafo2);
  elementoDiv.appendChild(nodoParrafo3);
  elementoDiv.appendChild(nodoParrafo4);


  // CÓDIGO DE LA GRÁFICA:

  // Obtener una referencia al elemento canvas del DOM
  const $grafica = document.querySelector("#grafica");
  // Las etiquetas son las que van en el eje X. 
  const etiquetas = ["Petro", "Fico", "Rodolfo", "Fajardo"]
  // Podemos tener varios conjuntos de datos. Comencemos con uno
  const datosVotos = {
    label: "Total de votos",
    data: [vectorCandidatos[0], vectorCandidatos[1], vectorCandidatos[2], vectorCandidatos[3]], // La data es un arreglo que debe tener la misma cantidad de valores que la cantidad de etiquetas
    backgroundColor: 'rgba(54, 162, 235, 0.2)', // Color de fondo
    borderColor: 'rgba(54, 162, 235, 1)', // Color del borde
    borderWidth: 1,// Ancho del borde
  };
  new Chart($grafica, {
    type: 'line',// Tipo de gráfica
    data: {
      labels: etiquetas,
      datasets: [
        datosVotos,
        // Aquí más datos...
      ]
    },
    options: {
      scales: {
        yAxes: [{
          ticks: {
            beginAtZero: true
          }
        }],
      },
    }
  });

}
