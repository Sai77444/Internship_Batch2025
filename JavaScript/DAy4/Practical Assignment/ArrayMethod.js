//Using For each Loop
// const users = [
//    {firstName:"Om",age : 22},
//    {firstName:"mahi",age : 20},
//    {firstName:"raj",age : 23},
//    {firstName:"sumesh",age : 27},
//    {firstName:"sai",age : 24},
// ]

// users.forEach(function(user){
//     console.log(user.firstName);
// });
//Using Map

// const numbers = [4,3,5,6,5];
// const users = [
//    {firstName:"Om",age : 22},
//    {firstName:"mahi",age : 20},
//    {firstName:"raj",age : 23},
//    {firstName:"sumesh",age : 27},
//    {firstName:"sai",age : 24},
// ]

// const user_names = users.map((user)=>{
//     return user.firstName;
// })
// console.log(user_names);

//using Filter
const numbers = [1,3,2,6,4,8];

const isEven= function(number){
    return number % 2 === 0;
}

const Even_numbers = numbers.filter(isEven);
console.log(Even_numbers);
