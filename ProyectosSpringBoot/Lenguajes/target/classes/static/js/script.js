// Obtener la tabla y las filas vacías
const table = document.getElementById("table");
const emptyRows = document.querySelectorAll(".empty-row");
const realRows = document.querySelectorAll("#table tbody tr:not(.empty-row)");

// Función para agregar filas vacías si es necesario
function addEmptyRowsIfNeeded() {
	const remainingEmptyRows = 3 - realRows.length;
	if (remainingEmptyRows > 0) {
		for (let i = 0; i < remainingEmptyRows; i++) {
			const emptyRow = document.createElement("tr");
			emptyRow.classList.add("empty-row");
			emptyRow.innerHTML = `
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    `;
			table.tBodies[0].appendChild(emptyRow);
		}
	}
}

// Agregar filas vacías iniciales
addEmptyRowsIfNeeded();

// Verificar si hay lenguajes reales en la tabla
const hasRealData = realRows.length > 0;

// Ocultar las filas vacías si hay lenguajes reales en la tabla
if (hasRealData) {
	emptyRows.forEach((row) => {
		row.style.display = "none";
	});
}