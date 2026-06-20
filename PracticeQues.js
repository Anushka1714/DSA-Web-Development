// //1
// let msg = "help!";
// console.log(msg.trim().toUpperCase());

// //2
// let name = "ApnaCollege";
// console.log(name.slice(4,9));
// console.log((name.indexOf("na")));
// console.log(name.replace("Apna","Our"));

// //3
// console.log(name.slice(4).replace("l","t"));


// //-----array methods-----

// //1
// let months = ["january","july","march","august"];
// months.shift();
// months.shift();
// months.unshift("june");
// months.unshift("july");
// console.log(months);

// //using splice method
// months.splice(0,2,"july","june");
// console.log(months);

// //2.
// let languages = ["c","c++","html","javascript","python","java","c#","sql"];
// console.log(languages.indexOf("javascript"));
// // console.log(languages.reverse());
// console.log(languages.reverse().indexOf("javascript"));


// //----nested array----

// //1
// let tictac = [['x',null,'o'],[null,'x',null],['o',null,'x']];
// console.log(tictac);
// console.log(tictac[0][1]);
// tictac[0][1] = 'o';
// console.log(tictac);
// console.log(tictac[0][1]);



// //------------practice ques part3------------

// //1
// let Arr = [7,9,0,-2];
// let n=3;

// // let ans = Arr.slice(0,n);
// // console.log(ans);
// // console.log(Arr.slice(0,3));

// //2
// let ans = Arr.slice(0,Arr.length-n);
// console.log(ans);


// //3
// let String = "Hello World";
// console.log(String.empty());
 


//-----------for loop---------

// //print all odd numbers (1 to 15)
// console.log("forward odd");
// for(let i = 1;i <= 15; i = i + 2){
//     console.log(i);
// }


// console.log("backward odd");
// for(let i = 15;i >= 1; i = i - 2){
//     console.log(i);
// }

// //print all even numbers (2 to 10)
// console.log("even numbers");
// for(let i = 2; i<=10; i = i+2){
//     console.log(i);
// }

// //print multiplication table of 5
// console.log("table of 5");
// for(let i = 5; i <= 50; i = i+5){
//     console.log(i);
// }

// //user input table
// let n = prompt ("enter your number");
// n = parseInt(n);
// for(let i=n ; i<n*10 ; i=i+n){
//     console.log(i);
// }


//-----------while loop-------

// //favourite movie
// const fav = "avatar";
// let guess = prompt("enter your movie");
// while((guess != fav) && (guess != "quit")){
//     // console.log("wrong");
//     guess = prompt("wrong guess please try again");
// }

// if(guess == fav){
//     console.log("congrats!!");
// }else{
//     console.log("quit");
// }

//  const fav = "avatar";
// let guess = prompt("enter your movie");
// while(guess != fav){
//     if (guess == "quit"){
//         console.log("you  quit");
//         break;
//     }
//     guess = prompt("wrong guess please try again");
// }

// if(guess == fav){
//     console.log("congrats!!");
// }



//------------math object----------

//generate a random number between 1 and 100
// console.log(Math.floor(Math.random() * 100) + 1);

// //generate a random number between 1 and 5
// console.log(Math.floor(Math.random() * 5) + 1);

// //generate a random number between 21 to 25
// console.log(Math.floor(Math.random() * 5) + 20 + 1);



//-----------part4----------

//1. .Write a JS program to delete all occurrences of element ‘num’ in a given array.
// Example: if arr=[1,2,3,4,5,6,2,3]&num=2
// Resultshouldbearr=[1,3,4,5,6,3]

let arr = [1,2,3,4,5,6,2,3];
let num = 2;
for(let i=0;i<arr.length;i++){
    if(arr[i] == num){
        arr.splice(i,1);
    }
}
console.log(arr);


//WriteaJSprogramtofindthenoofdigitsinanumber.
// Example: ifnumber=287152,count=6


let number = 287152;
let count = 0;
