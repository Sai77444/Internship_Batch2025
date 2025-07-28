const bodyElement = document.body;
console.log(bodyElement);
const divElement = document.createElement("div");
bodyElement.appendChild(divElement);

divElement.innerHTML = "Hi,<br><br>I Am Sai ,Web Designer.";

divElement.style.padding="50px 100px";
divElement.style.fontSize="30px ";
divElement.style.marginTop="130px";
const img1 = document.createElement('img');
img1.src ='WhatsApp Image 2025-07-06 at 16.44.35_828e362c.jpg';
bodyElement.style.display="flex";
img1.style.marginTop="130px";
img1.style.width="300px";
img1.style.height="300px";
img1.style.borderRadius="500px";
img1.style.marginLeft="300px";
img1.style.border="2px solid black";
document.body.appendChild(img1);