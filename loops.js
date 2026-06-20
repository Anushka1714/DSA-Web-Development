// //------without loop-------
// console.log("1");
// console.log("2");
// console.log("3");
// console.log("4");
// console.log("5");



// // -----1. for loop---------

// for(let i = 1; i <= 5; i++){
//     console.log(i);
// }

// for(let i = 5; i >= 1; i--){
//     console.log(i);
// }


// // let n = prompt ("enter your number");
// // n = parseInt(n);
// // for(let i=n ; i<n*10 ; i=i+n){
// //     console.log(i);
// // }


// //-------2. nested loops-------

// for(let i=1 ; i<=3; i++){
//     console.log(`outer loop ${i}`); 
//     for(let j=1;j<=3;j++){
//         console.log(j);
//     }
// }



// //------3. while loop----------

// let k = 1;
// while(k <= 5){
//     console.log(k);
//     k++;
// }

// let i = 5;
// while(i >= 1){
//     console.log(i);
//     i--;
// }


// let i = 0;
// while(i<=20){
//     console.log(i);
//     i = i+2;
// }


//-----------break keyword---------
// let i = 1;
// while(i <= 5){
//     if(i ==3){
//         break;
//     }
//     console.log(i);
//     i++;
// }
// console.log("used break at 3");



// //---loops with arrays-----
// let fruits = ["mango","apple","banana","litchi","orange"];
// for(let  i=0; i<fruits.length; i++){
//     console.log(i,fruits[i]);
// }
// for(let  i=fruits.length-1; i>=0; i--){
//     console.log(i,fruits[i]);
// }


// //------loops with nested arrays-----
// let heroes = [["ironman","spiderman","thor"],
//               ["superman","wonder woman","flash"]];

// for(let i=0; i<heroes.length; i++){  //all nested array inside the big array
//     console.log(i,heroes[i],heroes[i].length);
//     // console.log(`list #${i}`);  //
//     for(let j=0; j<heroes[i].length; j++){
//         console.log(`j=${j}`);
//         console.log(heroes[i][j]);
//     }
// }


// let student = [["aman",95],["anushka",94],["aastha",100]];

// for(let i=0; i<student.length;i++){
//     console.log(`info of student #${i}`);
//     for(let j=0;j<student[i].length;j++){
//         console.log(student[i][j]);
//     }
// }


//-----for of loop-----

let fruits = ["mango",'strawberry',"banana","litchi"];
for(fruit of fruits){
    console.log(fruit);
}

for(char of "apnacollege"){
    console.log(char);
}


//------nested for of loop-----

let heroes = [["ironman","spiderman","thor"],
              ["superman","wonder woman","flash"]];
for(list of heroes){
    for(name of list){
        console.log(name);
    }
    
}
