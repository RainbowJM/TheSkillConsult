// fetch("/students")
//     .then(response => response.json())
//     .then(function(students) {
//         console.log(students)
//
//         var select = document.getElementById("studentsBox");
//         for(index in students) {
//             select.options[select.options.length] = new Option(students[index], index);
//         }
//     });


var students = {
    1 : 'Jane Doe',
    2 : 'Jan Kaas',
    3 : 'Jaap Doe',
    4 : 'Ellen Steven'
};

var select = document.getElementById("studentsBox");
for(index in students) {
    select.options[select.options.length] = new Option(students[index], index);
}