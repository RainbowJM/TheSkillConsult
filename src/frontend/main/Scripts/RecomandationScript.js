document.getElementById('cursusReconmantion').innerHTML = 'Cursus'

var student = new document.getElementById("studentsBox");
var SelectedStudent = student.options[student.selectedIndex].text;

// console.log(SelectedStudent);
fetch("/recomandation", { method: 'POST', body: SelectedStudent })
    .then(response => response.json())
    .then(function(myJson) {
        console.log(myJson.Recomandation);
        document.getElementById('cursusReconmantion').innerHTML = myJson.Recomandation;
    });
