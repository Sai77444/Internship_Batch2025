let value1 = 0;
let value2 = 0;

const text1 = document.querySelector("#val1");
const text2 = document.querySelector("#val2");

text1.addEventListener("input", (e) => {
    value1 = Number(e.target.value); 
    console.log("Value1:", value1);
});

text2.addEventListener("input", (e) => {
    value2 = Number(e.target.value); 
    console.log("Value2:", value2);
});

const button=document.getElementById("add")
    button.addEventListener("click",()=>{
        let add=value1+value2;
        alert(`Sum is:${add}`)
    })

    const button1=document.getElementById("mul")
    button.addEventListener("click",()=>{
        let mul=value1-value2;
        alert(`Mul is:${mul}`)
    })
