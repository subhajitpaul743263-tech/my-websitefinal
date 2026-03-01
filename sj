// 1. Select the button using its ID
const button = document.getElementById("contactBtn");

// 2. Add a "listener" to wait for a click
button.addEventListener("click",function() {
// 3. The Action: Change the button text and color
button.innerText = "Request Sent!";
button.style.backgroundColor = "white";
button.style.color = "black";
});
