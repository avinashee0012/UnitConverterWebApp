function fetchMessage() {
    fetch('/UnitConverterWebApp/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById("message").innerText = data;
        })
        .catch(error => console.error('Error:', error));
}