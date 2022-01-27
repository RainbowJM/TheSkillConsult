function UpdateReccomandation(student) {
    var Course = "";
    switch (student){
        case 'Jan':
            Course = 'ASD'
            break;
        case 'Piet':
            Course = 'Englisch'
            break;
        case 'Klaas':
            Course = 'French'
            break;

    }
    document.getElementById('cursusReconmantion').innerHTML = Course

}
// fetch("/recomandation", { method: 'POST', body: SelectedStudent })
//     .then(response => response.json())
//     .then(function(myJson) {
//         console.log(myJson.Recomandation);
//         document.getElementById('cursusReconmantion').innerHTML = myJson.Recomandation;
//     });
