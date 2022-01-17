const ctx = document.getElementById("myChart");

const labels = [
    'openness',
    'cultural empathy',
    'openmindness',
    'adaptability',
    'flexibility',
    'emotional stability',
    'social initiative'
    ]

const data = {
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

const config = {
    type: 'radar',
    data: data,

}

const myChart = new Chart(ctx, config);

