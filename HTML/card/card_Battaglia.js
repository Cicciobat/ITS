/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */

/* Get to a class name */
let images = document.getElementsByClassName("image")

/* Check if images was clicked and then flip it */
for (const image of images) {
    image.addEventListener('click', flipCard)
}

/* Flip the card function */
function flipCard() {
        let card = document.getElementById("card")
        card.classList.toggle("flipCard")
    }