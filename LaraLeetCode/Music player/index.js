function header() {
    let theamButton = document.querySelector(".togButton");
    let toggle = document.querySelector(".toggle");
    toggle.addEventListener("click", ()=>{
        theamButton.classList.toggle("animateButton");
        let body = document.querySelector("body");
        body.classList.toggle("darkTheam");
    });
}
header();