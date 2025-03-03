document.getElementById('convertForm').addEventListener('submit', getData);

async function getData(event) {
    event.preventDefault();

    document.getElementById('convertForm').style.display = "none";
    document.getElementById('resetButton').style.display = "block";
    document.getElementById('result').style.visibility = "visible";

    const formData = {
        input: document.getElementById('input').value,
        from: document.getElementById('from').value,
        to: document.getElementById('to').value
    };

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
        document.getElementById('result').innerText = `Converted ${pageName}: ${result}`;
    } catch (error) {
        console.error('Error:', error);
        document.getElementById('result').innerText = 'Error processing request';
    }
}