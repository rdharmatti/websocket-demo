var stompClient = null;

let process;
var headers = {
    'Authorization': 'dummy'
};

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function getAuthToken() {
    $.ajax({
        url: '/env/1',
        method: 'GET',
        dataType: 'json',
        success: function(response) {
            // Process the response and access the environment variables
            headers.Authorization = response.body;
        },
        error: function(error) {
            headers.Authorization = error.responseText;
        }
    });
}

function connect() {

    var url = 'http://localhost:8080/ws';
    var socket = new SockJS(url);

    stompClient = Stomp.over(socket);

    stompClient.connect(headers, function(frame) {
        // Connection is established
        setConnected(true);
        console.log('Connected: ' + frame);
        // Subscribe to a destination
        stompClient.subscribe('/user/queue/cart-count', function(message) {
            // Handle incoming message
            console.log('Received message:', message.body);
            $("#greetings").append("<tr><td>" + message.body + "</td></tr>");
        });
    }, function(error) {
        // Handle connection error
        console.log('Connection error:', error);
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
}

function addToCart(){
    stompClient.send("/app/api/v1/cart/add-item", headers, JSON.stringify({
        "audiences": [
            "pf_1000"
        ]
    }));
}

function showGreeting(message) {
    $("#greetings").append("<tr><td>" + message + "</td></tr>");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#auth" ).click(function() { getAuthToken(); });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { addToCart(); });
});