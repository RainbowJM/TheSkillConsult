function UpdateChart() {
    var student = document.getElementById("studentsBox");
    var SelectedStudent = student.options[student.selectedIndex].text;

    console.log(SelectedStudent);
    UpdateReccomandation(SelectedStudent);


    document.querySelector(".myChart").innerHTML = '<canvas id="myChart"></canvas>';

    ctx = document.getElementById("myChart");

    labels = [
        'openness',
        'cultural empathy',
        'openmindness',
        'adaptability',
        'flexibility',
        'emotional stability',
        'social initiative'
    ]

    switch (SelectedStudent) {
        case 'Jan':
            data = {
                labels,
                datasets: [
                    {
                        data: [
                            5.926,
                            5.926,
                            5.151,
                            3.773,
                            2.664,
                            3.65,
                            5.146],
                        label: "eerste meeting",
                        backgroundColor: 'rgba(255, 99, 132, 0.2)',
                        borderColor: 'rgb(255, 99, 132)',
                        pointBackgroundColor: 'rgb(255, 99, 132)',
                        pointBorderColor: '#fff',
                        pointHoverBackgroundColor: '#fff',
                        pointHoverBorderColor: 'rgb(255, 99, 132)'
                    }, {
                        data: [
                            5.879,
                            5.437,
                            6.275,
                            3.324,
                            2.266,
                            4.174,
                            4.921],
                        label: "tweede meeting",
                        backgroundColor: 'rgba(54, 162, 235, 0.2)',
                        borderColor: 'rgb(54, 162, 235)',
                        pointBackgroundColor: 'rgb(54, 162, 235)',
                        pointBorderColor: '#fff',
                        pointHoverBackgroundColor: '#fff',
                        pointHoverBorderColor: 'rgb(54, 162, 235)'
                    }
                ]
            };
            config = {
                type: 'radar',
                data: data,

            }
            myChart = new Chart(ctx, config);
        case 'Piet':
            data = {
                labels,
                datasets: [
                    {
                        data: [
                            5.926,
                            5.926,
                            5.151,
                            3.773,
                            2.664,
                            3.65,
                            5.146],
                        label: "eerste meeting",
                        backgroundColor: 'rgba(255, 99, 132, 0.2)',
                        borderColor: 'rgb(255, 99, 132)',
                        pointBackgroundColor: 'rgb(255, 99, 132)',
                        pointBorderColor: '#fff',
                        pointHoverBackgroundColor: '#fff',
                        pointHoverBorderColor: 'rgb(255, 99, 132)'
                    }, {
                        data: [
                            5.879,
                            5.437,
                            6.275,
                            3.324,
                            2.266,
                            4.174,
                            4.921],
                        label: "tweede meeting",
                        backgroundColor: 'rgba(54, 162, 235, 0.2)',
                        borderColor: 'rgb(54, 162, 235)',
                        pointBackgroundColor: 'rgb(54, 162, 235)',
                        pointBorderColor: '#fff',
                        pointHoverBackgroundColor: '#fff',
                        pointHoverBorderColor: 'rgb(54, 162, 235)'
                    }
                ]
            };
            config = {
                type: 'radar',
                data: data,

            }

            myChart = new Chart(ctx, config);
        case 'Klaas':
            data = {
                labels,
                datasets: [
                    {
                        data: [
                            5.926,
                            5.926,
                            5.151,
                            3.773,
                            2.664,
                            3.65,
                            5.146],
                        label: "eerste meeting",
                        backgroundColor: 'rgba(255, 99, 132, 0.2)',
                        borderColor: 'rgb(255, 99, 132)',
                        pointBackgroundColor: 'rgb(255, 99, 132)',
                        pointBorderColor: '#fff',
                        pointHoverBackgroundColor: '#fff',
                        pointHoverBorderColor: 'rgb(255, 99, 132)'
                    }, {
                        data: [
                            5.879,
                            5.437,
                            6.275,
                            3.324,
                            2.266,
                            5.437,
                            4.921],
                        label: "tweede meeting",
                        backgroundColor: 'rgba(54, 162, 235, 0.2)',
                        borderColor: 'rgb(54, 162, 235)',
                        pointBackgroundColor: 'rgb(54, 162, 235)',
                        pointBorderColor: '#fff',
                        pointHoverBackgroundColor: '#fff',
                        pointHoverBorderColor: 'rgb(54, 162, 235)'
                    }
                ]
            };
            config = {
                type: 'radar',
                data: data,

            }
            myChart = new Chart(ctx, config);
    }
}



// fetch("/progress", { method: 'POST', body: SelectedStudent })
//     .then(response => response.json())
//     .then(function(myJson) {
//         console.log(myJson.Progress);
//
//         const data = {
//             labels,
//             datasets: [
//                 {
//                     data: [
//                         myJson.Progress[0].openness,
//                         myJson.Progress[0].cultural_empathy,
//                         myJson.Progress[0].openmindness,
//                         myJson.Progress[0].adaptability,
//                         myJson.Progress[0].flexibility,
//                         myJson.Progress[0].emotional_stability,
//                         myJson.Progress[0].social_initiative],
//                     label: "eerste meeting",
//                     backgroundColor: 'rgba(255, 99, 132, 0.2)',
//                     borderColor: 'rgb(255, 99, 132)',
//                     pointBackgroundColor: 'rgb(255, 99, 132)',
//                     pointBorderColor: '#fff',
//                     pointHoverBackgroundColor: '#fff',
//                     pointHoverBorderColor: 'rgb(255, 99, 132)'
//                 }, {
//                     data: [
//                         myJson.Progress[1].openness,
//                         myJson.Progress[1].cultural_empathy,
//                         myJson.Progress[1].openmindness,
//                         myJson.Progress[1].adaptability,
//                         myJson.Progress[1].flexibility,
//                         myJson.Progress[1].emotional_stability,
//                         myJson.Progress[1].social_initiative],
//                     label: "tweede meeting",
//                     backgroundColor: 'rgba(54, 162, 235, 0.2)',
//                     borderColor: 'rgb(54, 162, 235)',
//                     pointBackgroundColor: 'rgb(54, 162, 235)',
//                     pointBorderColor: '#fff',
//                     pointHoverBackgroundColor: '#fff',
//                     pointHoverBorderColor: 'rgb(54, 162, 235)'
//                 }
//
//             ]
//         };
//     });