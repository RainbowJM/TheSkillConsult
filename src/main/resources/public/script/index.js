const LOGINBUTTON = document.getElementById("sign-in-btn");

LOGINBUTTON.addEventListener("click", signin);

function signin() {
    let unameElement = document.getElementById("username").value;
    let pswElement = document.getElementById("password").value;
    console.log("elementValue", unameElement, pswElement);
    if (unameElement.trim() === "" || pswElement.trim() === "") {
        alert("Please enter username and password");
        return false;
    } else {
        let payload = {
            "username": unameElement,
            "password": pswElement
        }
        fetch('/login', {method: 'POST', body: JSON.stringify(payload)})
            .then(function (response) {
                if (response.ok) {
                    console.log(response.headers.get('Authorization'))
                    let token = response.headers.get('Authorization');
                    let subToken = token.substr(6,token.length)
                    console.log(subToken)
                    let convertPayload = parseJwt(subToken);
                    let role = convertPayload.ROLE

                    if (role === "TEACHER"){
                        console.log(" teacher window")
                        window.location = "DocentStudentoverzicht.html"
                    }else{
                        console.log("student window")
                        window.location = "Studentoverzicht.html"
                    }
                    //     console.log(payload);
                    // console.log(payload.ROLE);
                    // checkRole();
                    // window.location = "Studentoverzicht.html";
                    // checkRole();
                } else {
                    console.log("HH")
                    alert("Wrong username/password")
                    throw "Wrong username/password";
                }
            })
            .catch(error => console.log(error));
        return true;
    }
}

function parseJwt (token) {
    var base64Url = token.split('.')[1];
    var base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
    var jsonPayload = decodeURIComponent(atob(base64).split('').map(function(c) {
        return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
    }).join(''));

    return JSON.parse(jsonPayload);
}

function checkRole() {
    console.log("WE gonna check the role")
    let unameElement = document.getElementById("username").value;
    console.log("elementValue", unameElement);

    if (unameElement.trim() === "") {
        return false;
    } else {
        let payload = {
            "username": unameElement,
        }
        fetch('/user/role/admin', {method: 'GET'})
            .then(function (response){
                if (response.ok){
                    console.log(response.json());
                    return response.json();
                }else{
                    console.log("wrong")
                    throw "ERROR"
                }
            })
            .catch(error => console.log(error));
            return true;
    }
}