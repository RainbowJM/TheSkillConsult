document.getElementById('cursusReconmantion').innerHTML = 'A The world around you. About world citizenship\u202f(OA-MINBILDUN1-20)'
function UpdateReccomandation(student) {
    var Course = "";
    switch (student){
        case 'Jane Doe':
            Course = 'A The world around you. About world citizenship\u202f(OA-MINBILDUN1-20)'
            break;
        case 'Jan Kaas':
            Course = 'A The world around you. About world citizenship\u202f(OA-MINBILDUN1-20)'
            break;
        case 'Jaap Doe':
            Course = 'Honours - Mindfulness voor professionals\u202f(OHON-MINDFUL-18)'
            break;
        case 'Ellen Steven':
            Course = 'A The world around you. About world citizenship\u202f(OA-MINBILDUN1-20)'
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
