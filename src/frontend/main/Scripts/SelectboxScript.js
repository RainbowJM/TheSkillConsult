fetch("/students")
    .then(response => response.json())
    .then(function(students) {
        console.log(students)

        var select = document.getElementById("studentsBox");
        for(index in students) {
            select.options[select.options.length] = new Option(students[index], index);
        }
    });


var students = {
    1 : 'Jan',
    2 : 'Piet',
    3 : 'Klaas'
};

var select = document.getElementById("studentsBox");
for(index in students) {
    select.options[select.options.length] = new Option(students[index], index);
}