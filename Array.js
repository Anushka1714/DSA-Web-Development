// let students = ["Anushka","Aastha","Anshika","Pakhi"];
// console.log(typeof(students));
// console.log(students.length);
// console.log(students[0]);
// console.log(students[1]);
// console.log(students[2]);
// console.log(students[3]);

// let info = ["Anushka",21, 78.9];    //mixed array
// console.log(info[0][0]);
// console.log(info[1][0]);

// let empty =[];     //empty array


// //Arrays are mutable (can be changed) and ordered (elements have a specific order) data structures that can hold multiple values of different types. They are commonly used to store and manipulate collections of data in programming languages.
// let fruits = ["mango","apple","litchi"];
// console.log(fruits);

// fruits[0]="banana";  //changing the value of index 0
// console.log(fruits);

// fruits[10] ="grapes";  //adding a new value at index 10
// console.log(fruits);
// console.log(fruits[5]);


// //------array methods-------

// //1. push() method ----> it is used to add one or more elements to the end of an array and returns the new length of the array.
// let cars = ["bmw","audi","porsche","ferrari"];
// console.log(cars);
// cars.push("toyota");
// console.log(cars);

// // 2. pop() method ----> it is used to remove the last element from an array and returns that element.  
// cars.pop();
// console.log(cars);
// console.log(cars.pop());
// console.log(cars);

// // 3. unshift() method ----> it is used to add one or more elements to the beginning of an array and returns the new length of the array.
// cars.unshift("mercedes");
// console.log(cars);
// cars.unshift("honda")
// console.log(cars);

// // 4. shift() method ----> it is used to remove the first element from an array and returns that element.
// cars.shift();
// console.log(cars);
// cars.shift();
// console.log(cars);


// // let followers = ["a","b","c"];
// // let blocked = followers.shift();
// // console.log(followers);
// // console.log(blocked);
   
// //5.indexOf() method ----> it is used to find the index of the first occurrence of a specified value in an array. It returns -1 if the value is not found.
// console.log(cars.indexOf("bmw"));
// console.log(cars.indexOf("porsche"));
// console.log(cars.indexOf("honda"));

// //6.includes() method ----> it is used to determine whether an array includes a certain value among its entries, returning true or false as appropriate.
// console.log(cars.includes("audi"));
// console.log(cars.includes("honda"));

// //7.concat() method ----> it is used to merge two or more arrays. This method does not change the existing arrays, but instead returns a new array.
// let primary = ["red","yellow","blue"];
// let secondary = ["orange","green","purple"];
// let colors = primary.concat(secondary);
// console.log(colors);
// let color = secondary.concat(primary);
// console.log(color);
// console.log(primary);
// console.log(secondary);

// //8.reverse() method ----> it is used to reverse the order of the elements in an array. This method changes the original array.
// console.log(cars.reverse());

// //9.slice() method ----> it is used to extract a portion of an array and returns a new array. The original array remains unchanged.
// let numbers = [1,2,3,4,5,6,7,8,9];
// console.log(numbers.slice());
// console.log(numbers.slice(2));
// console.log(numbers.slice(2,6));
// console.log(numbers.slice(-1));
// console.log(numbers.slice(-5,-2));

// //10.splice() method ----> it is used to change the contents of an array by removing or replacing existing elements and/or adding new elements in place. This method changes the original array.
// console.log(numbers.splice(2));   //work as slice when we only give starting index
// console.log(numbers);
// console.log(numbers.splice(0,1));
// console.log(numbers);
// console.log(numbers.splice(2,3,5,6));
// console.log(numbers);
// console.log(cars.splice(1,2,"audi","porsche"));
// console.log(cars);

// let name = ["Anushka","Aastha","Anshika","Pakhi"];
// console.log(name.splice(3));
// console.log(name);
// console.log(name.splice(0,1));
// console.log(name);
// console.log(name.splice(1,1,"anushka"));
// console.log(name);

// console.log(name.splice(1,0,"pakhi"));
// console.log(name);



// //11.sort() method ----> it is used to sort the elements of an array in place and returns the sorted array. The default sort order is ascending, built upon converting the elements into strings, then comparing their sequences of UTF-16 code units values.
// console.log(numbers.sort());
// console.log(cars.sort());
// console.log(name.sort());
// console.log(colors.sort());

// let marks = [99,89,67,42,100];  //first numbers are converted to strings and then sorted in lexicographical order
// console.log(marks.sort());



// //------Array references------
// let arr = ['a','b'];
// let arrCopy = arr;
// console.log(arrCopy);
// console.log(arrCopy.push('c'));
// console.log(arr);
// arrCopy.pop();
// console.log(arr);



// //------Constant array-----we can add here but we cannot change the reference of the array
// const myArr = [1,2,3];
// myArr.push(4);
// console.log(myArr);
// myArr.pop();
// console.log(myArr);



// //-----nested array-----
// let nestedArr = [[2,4],[3,6],[4,8]];
// console.log(nestedArr);
// console.log(nestedArr.length);
// console.log(nestedArr[0]);
// console.log(nestedArr[0][0]);



//object literals----
let delhi ={
    latitude: "28.7041 N",
    longitude: "77.1025 E"
};

const student ={
    name: "Anushka",
    age: 21,
    marks: 80,
    city: "Fatehpur"
};


const item ={
    price: 100.99,
    discount: 50,
    color: ["red","pink"]
};
console.log(item.color);


//---get values---

const students ={
    name: "Anushka",
    age: 21,
    marks: 80,
    city: "Fatehpur"
};
console.log(student["name"]);
console.log(student.name);


const obj  = {
    1: "a",
    2: "b",
    true: "c",
    null: "d",
    undefined: "e"
}
console.log(obj[1]);
console.log(obj[2]);
console.log(obj[true]);
console.log(obj[null]);
console.log(obj[undefined]);

console.log(obj.null);

//---add/update----

// const students ={
//     name: "Anushka",
//     age: 21,
//     marks: 80,
//     city: "Fatehpur"
// };
console.log(students.city="mumbai"); //update
console.log(students.gender="female");  //add 
console.log(students.marks="A");  //while updating any value,we can change datatype too.
console.log(students.marks=["A",92]);  

delete students.gender; //deleting the value
console.log(students);



//-----nesting-----
const classInfo={
    aman:{
        grade: "A+",
        city: "Delhi"
    },
    anushka:{
        grade:"A",
        city:"Pune"
    },
    karan:{
        grade:"B",
        city:"Mumbai"
    }
};
console.log(classInfo.aman);
console.log(classInfo.anushka);
console.log(classInfo.karan);

console.log(classInfo.anushka.grade); // accesing particular value
classInfo.anushka.city="gurgaon";
console.log(classInfo.anushka.city);


//---array of objects----
const ClassInfo=[
    {
        name: "anushka",
        grade: "A+",
        city: "Delhi"
    },
    {
        name: "Aastha",
        grade: "A",
        city: "Delhi"
    },
    {
        name: "Pakhi",
        grade: "O",
        city: "Banaras"
    },
    {
        name:"Anshika",
        grade:"O",
        city:"Kannauj"
    }
];
console.log(ClassInfo[0]);
console.log(ClassInfo[1]);
console.log(ClassInfo[2]);
console.log(ClassInfo[3]);

console.log(ClassInfo[1].name);
console.log(ClassInfo[1].city="Jaipur");



//-------Math object-----
//properties
console.log(Math.PI);
console.log(Math.E);

//methods
//power function
let a = 4
let b = 2
console.log(Math.pow(a,b));

//absolute function
let n = -23.78
console.log(Math.abs(n));

//floor function
let n1 = 23.8;
console.log(Math.floor(n1));

//ceil function
console.log(Math.ceil(n1));

//random function
// console.log(Math.random()); // any random number range(0 to 1) where 1 is exclusive(kbhi nh dega) and all other inclusive 



//------generating random integers using random function----

// step 1
let num = Math.random();  //0.6128795670651057
console.log(num);
//step 2
num = num * 10;   //6.6128795670651057
console.log(num);
//step 3
num = Math.floor(num);   //6
console.log(num);
//step 4
num = num + 1;
console.log(num);


console.log(Math.floor(Math.random() * 10));  // it will never give us 10 because at random function we never get 1 so we never get 10 
//so for getting 10 we use +1 at it
console.log(Math.floor((Math.random() * 10 )+ 1)); 
 