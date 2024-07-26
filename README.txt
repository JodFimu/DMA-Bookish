
# Bookish-DMA

Una aplicación para gestionar una pagina web de manera eficiente.


-- Descripción

Esta aplicación permite a los usuarios visualizar la base de datos de la empresa y agregar atributos a ella mediante una pagina interactiva e intuitiva.

- Clonar el repositorio
git clone https://github.com/JodFimu/DMA-Bookish.git

- esta aplicacion requiere de un usuario en base de datos:
para añadirlo solo hay que copiar y pegar estas tres lineas a continuacion y ejecutarlas.

CREATE USER 'DMA_Corporation'@'localhost' IDENTIFIED BY 'DMAPassword';
GRANT ALL PRIVILEGES ON *.* TO 'DMA_Corporation'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

* el script de la base de datos se encuentra dentro del proyecto en: \DMA-Bookish\src\main\java\com\dma\database *



