const REGISTERBUTTON = document.getElementById("sign-up-btn");

REGISTERBUTTON.addEventListener("click", register);

function register(){
    let unameElement = document.getElementById("username").value;
    let pswElement = document.getElementById("password").value;
    let fnameElement = document.getElementById("firstname").value;
    let lnameElement = document.getElementById("lastname").value;
    console.log("elementValue", unameElement, pswElement, fnameElement, lnameElement);
    if(unameElement.trim() === ""
        || pswElement.trim() === ""
        || fnameElement.trim() === ""
        || lnameElement.trim() === ""
    ){
        alert("Please enter your information");
        return false;
    }else{
        let payload = {
            "username": unameElement,
            "password": pswElement,
            "firstName": fnameElement,
            "lastName": lnameElement
        }
        fetch("/register", {
            method: 'POST',
            body: JSON.stringify(payload),
            headers: new Headers({'content-type': 'application/json'})})
            .then(function (response){
                if(response.ok) {
                    console.log("hello")
                    window.location = "index.html";
                }else {
                    console.log("HELLO", response)
                    throw "User already exists";}
            })
            .catch(error => console.log(error));
        return true;
    }

}