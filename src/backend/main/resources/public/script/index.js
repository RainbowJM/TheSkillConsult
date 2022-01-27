const LOGINBUTTON = document.getElementById("sign-in-btn");

LOGINBUTTON.addEventListener("click", signin);

function signin(){
    let unameElement = document.getElementById("username").value;
    let pswElement = document.getElementById("password").value;
    console.log("elementValue", unameElement, pswElement);
    if(unameElement.trim() === "" || pswElement.trim() === ""){
        alert("Please enter username and password");
        return false;
    }else{
        let payload = {
            "username": unameElement,
            "password": pswElement
        }
        fetch('/login', {method: 'POST', body: JSON.stringify(payload)})
            .then(function (response) {
                if(response.ok) {
                    console.log("h");
                    window.location = "https://google.com";
                }else {
                    console.log("HH")
                    alert("Wrong username/password")
                    throw "Wrong username/password";
                }
            })
            .catch(error => console.log(error));
        return true;
    }
}