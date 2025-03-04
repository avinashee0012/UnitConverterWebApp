document.getElementById('convertForm').addEventListener('submit', getData);

async function getData(event) {
    event.preventDefault();
    
    const formData = {
        input: document.getElementById('input').value,
        from: document.getElementById('from').value,
        to: document.getElementById('to').value
    };

    var isFormValid = validateForm(formData.input, formData.from, formData.to);

    if(isFormValid == true) {
        try {
            const response = await fetch('http://localhost:8080/' + pageName, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            });
    
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
    
            const result = await response.text();
            document.getElementById('convertForm').innerHTML = `<div id="result"><h2 id="response"></h2><button id="resetButton" onclick="location.reload()">Reset</button></div>`;
            document.getElementById('response').innerText = `Result of your calculation:\n ${result}`;
        } catch (error) {
            console.error('Error:', error);
            document.getElementById('convertForm').innerHTML = `<div id="result"><h2 id="response"></h2><button id="resetButton" onclick="location.reload()">Reset</button></div>`;
            document.getElementById('response').innerText = 'Error processing request';
        }
    }
}

function validateForm(input, from, to) {
    if((input == "" || input < 0) || from == "" || to == ""){
        alert("Enter valid input");
        return false;
    }
    return true;
}