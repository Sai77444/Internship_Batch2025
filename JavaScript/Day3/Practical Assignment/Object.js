
const Person = {
    Name:"SAi",
    Roll_no:30

}


console.log(Person.Name);
console.log(Person["Roll_no"]);

Person.gen = "Male";
Person["College"] = "KKWP";


//Accessing object in javaScript
for(let key in Person){
console.log(Person[key]);
}

//Second Way by Object.key
console.log(Object.keys(Person));