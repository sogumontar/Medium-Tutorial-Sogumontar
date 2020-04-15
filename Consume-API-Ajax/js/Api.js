$(document).ready(function() {
    $.ajax({
        type: "GET",
        headers: {
            "Content-Type": "application/json"
        },
        url: "http://localhost:8800/api/hello/test",
        success: function (data) {
            var users = JSON.parse(JSON.stringify(data));
            $("#data").replaceWith('<a >'+users+'</a>')
        }
    });
});