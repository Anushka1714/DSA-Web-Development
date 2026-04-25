// let pencilPrice = 10;
// let eraserPrice = 5;
// output = console.log(" the total price is : "+ (pencilPrice + eraserPrice )+ "rupees.")
// console.log(output);


//template literals


let pencilPrice = 10;
let eraserPrice = 5;
// let output = `the total price is : ${pencilPrice + eraserPrice} rupees.`
// console.log(output);
console.log(`the total price is : ${pencilPrice + eraserPrice} rupees.`)




 

//if statement ---> all condition get checked
console.log("before my if statement");
let age = 14;
if(age>=18){
    console.log("you can vote");
}
if(age<18){
    console.log("you cannot vote");
}
console.log("after my if statement");
if(age<20){
    console.log("you are in your 20's");
}


let firstName = "anushka";
if(firstName == "anushka"){
    console.log(`welcome ${firstName}`);
}



//practice question  (Traffic Light)

let color = "yellow";
if(color == "red"){
    console.log(`stop! light color is ${color}`);
}

if(color == "yellow"){
    console.log(`ready light color is ${color}`);
}
if(color == "green"){
    console.log(`go light color is ${color}`);
}



//else-if statement  ---> if else will only run when if statement get false.
                    //  without if statement we can't write if alse statement.
 let marks = 33;

 if(marks >=80){
    console.log("A+");
 }
 else if(marks >= 60){
    console.log("A");
 }
 else if(marks >= 33){
    console.log("B");
 }
 else if("marks < 33"){
    console.log("F");
 }


 //else statement ----> in this else statement get executed when if statement get false.

 let Age = 16;
 if(Age >= 18){
    console.log("you can vote");
 }else{
    console.log("you cannot vote");
 }


//ALL CONDITONAL STATEMENT

let Color = "yellow";
if(Color == "red"){
    console.log(`stop! light color is ${Color}`);
}

else if(Color == "yellow"){
    console.log(`ready light color is ${Color}`);
}
else{
    console.log(`go light color is ${Color}`);
}


//Practice ques (popcorn price)

let size = "XL"
if(size=="XL"){
    console.log("price is rs 250");
}
else if(size=="L"){
    console.log("price is rs 200");
}
else if(size=="M"){
    console.log("price is rs 100 ");
}
else{
    console.log("price is rs 50");
}


// Neste if-else ----> nesting is writing if-else inside if-else statements. it can have many levels.


let mark = 30;
if(mark >= 33){
    console.log("pass");
    if(mark >= 80){
        console.log("Grade: O");
    }
    else{
        console.log("Grade: A")
    }
}
else{
    console.log("better luck next time");
}




//logical operator
let n1=0;
let n2=1;
console.log(n1 && n2);
console.log(n1 || n2);
console.log(!n1);
console.log(!n2);

let Marks = 23;

if((Marks > 33 && Marks <=80) || !false){
    console.log("pass");
}


//pracice question (find stsring good or not)
let sentence = "Apple"
if((sentence[0]=='A') && (sentence.length>3)){
    console.log("good string");
}
else{
    console.log("not good string");
}

//predict the output
let num = 12;

if((num%3 === 0) && ((num+1 == 15) || (num-1 == 11))){
    console.log("safe");
}
else{
    console.log("unsafe");
}


//truthy and falsy
if(0){
    console.log("it has true valse");
}
else{
    console.log("it has false value");
}

//switch statement

let shade = "yellow";

switch(shade){
    case "red":
        console.log("stop");
        break;
    case "yellow":
        console.log("slow down");
        break;
    case "green":
        console.log("go");
        break;
    default:
        console.log("broken lights");
}


//practice ques (week day)

let day = 8;

switch(day){
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
     case 3:
        console.log("Wednesday");
        break;
     case 4:
        console.log("Thursday");
        break;
     case 5:
        console.log("Friday");
        break;
     case 6:
        console.log("Saturday");
        break;
    case 7:
        console.log("Sunday");
        break;
     default:
        console.log("Wrong day");
       
}


//alert and prompt
// alert("something is wrong");
// alert("what is happening");
//   console.log("this is simple log");
//   console.error("this is error");
//   console.warn("this is warning");


// prompt("please enter your number");
// console.log("hello")


//String methods

// ---- trim() method ----> it is used to remove the extra spaces from the string.
let str = "  hello worlds  ";
console.log(str.trim());

// let password = prompt("set your password");
// let newPass = password.trim();
// console.log(newPass);

//-----uppercase() method ----> it is used to convert the string into uppercase.
let name = "anushka";
console.log(name.toUpperCase());

//-----lowercase() method ----> it is used to convert the string into lowercase.
let Name = "ANUSHKA";
console.log(Name.toLowerCase());


// string method with argument

//-----indexOf() method ----> it is used to find the index of the first occurrence of a specified value in a string.
let Str = "I am learning JavaScript";
console.log(Str.indexOf("learning"));
console.log(Str.indexOf("Learning"));
console.log(Str.indexOf(" "));

//--method chaining ----> it is used to call multiple methods on the same string.
let hey = "   hello world   ";
console.log(hey.trim().toUpperCase());