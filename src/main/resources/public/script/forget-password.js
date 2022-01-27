const REGISTERBUTTON = document.getElementById("send-btn");

REGISTERBUTTON.addEventListener("click", newPassword);

function newPassword(){
    let unameElement = document.getElementById("username").value;
    let pswElement = document.getElementById("new-password").value;
    console.log("elementValue", unameElement, pswElement);
    if(unameElement.trim() === "" || pswElement.trim() === ""){
        alert("Please enter your information");
        return false;
    }else{
        let payload = {
            "username": unameElement,
            "password": pswElement
        }
        fetch("/user/edit", {
            method: 'PATCH',
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