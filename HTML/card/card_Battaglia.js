/*
 * Copyright (c) 2023. Ciccio Battaglia
 * All rights reserved.
 *
 */
    let ciccio = document.getElementById("ciccio")
    ciccio.addEventListener('click', flipCard)
    let steve = document.getElementById("steve")
    steve.addEventListener('click', flipCard)

    function flipCard() {
        let card = document.getElementById("card")
        card.classList.toggle("flipCard")
    }