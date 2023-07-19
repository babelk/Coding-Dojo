  function autoScroll() {
    const valoresGoldDiv = document.getElementById('valoresgold');
    // Desplazamiento automático hacia abajo (scrollHeight) con una animación suave (behavior: 'smooth').
    valoresGoldDiv.scrollTo({
      top: valoresGoldDiv.scrollHeight,
    });
  }

  // Llamamos a la función de autoscroll cada vez que se actualicen los valores en la sección "valoresgold".
  autoScroll();