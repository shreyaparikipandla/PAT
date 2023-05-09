window.alert("hi")
var firstname = document.getElementById('fname');
// document.getElementsByClassName()
// document.getElementsByTagName()
// document.getElementsByName()
console.log(firstname);
firstname.type="password";
firstname.style="background-color:blue;color:white"; 
function myfunc(event){
    console.log(event);
    event.preventDefault();
    var currentele=event.target
    console.log(currentele);
    currentele.innerText="nice try , dont copy";
}
var area=document.getElementById('demo');
area.addEventListener("paste",myfunc);