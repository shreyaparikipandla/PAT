var firstname=document.getElementById('fname');
var input2 = document.createElement('input');
input2.type="text";
input2.id="lastname";
input2.className="form-control";
input2.placeholder="enter your lastname";
firstname.appendChild(input2);
var input = document.createElement('input');
input.type="email";
input.id="user email";
input.className="form-control";
input.placeholder="enter your email";
firstname.appendChild(input);
var input1 = document.createElement('input');
input1.type="password";
input1.id="password";
input1.className="form-control";
input1.placeholder="enter your password";
firstname.appendChild(input1);

var btn=document.createElement("button");
btn.className="btn btn-primary btn-block mt-3";
btn.innerText="submit form";
//var myform=document.getElementById('customerform');
// function createInputele(type,className='',id='',placeholder='',label){
// }
firstname.appendChild(btn);
function handleSubmit(event){
    event.preventDefault;//to not reload the page 
    var email=document.getElementById("user email");
    console.log(email.value);
}
function validation(){
    let x = document.getElementById;
    if (x == "") {
        alert("Name must be filled out");
    return false;
  }
}
btn.addEventListener("click",handleSubmit);