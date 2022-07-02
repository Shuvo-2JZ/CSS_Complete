document.getElementById("btnOK").addEventListener("click", function(event){

    document.getElementById("toBeRemoved").classList.add("d-none");
    
    document.getElementById("txtDetails").classList.remove("slide-in-up");

    requestAnimationFrame(()=>{
        document.getElementById("txtDetails").classList.add("slide-in-up");
    });


    // document.getElementById("txtDetails").classList.remove("slide-in-up");
    // document.getElementById("txtDetails").classList.add("slide-in-up");

    event.preventDefault();
    checkInputs();
});