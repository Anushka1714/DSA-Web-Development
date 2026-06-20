//user enters a max number and then tries to guess a random generated number between 1 to max

const max = prompt("enter maximum number");
const random = Math.floor(Math.random() * max) + 1;
// console.log(random);
let guess = prompt("guess the number");

while(true){
    if(guess == "quit"){
        console.log("user quit");
        break;
    }
    if(guess == random){
        console.log("you are right! congrats!! random number was",random);
        break;
    }else if(guess < random){
        guess = prompt("hint: your guess was small. please try again! ")
    }
    else{
        guess = prompt("hint: your guess was large. please try again!");
    }
}

