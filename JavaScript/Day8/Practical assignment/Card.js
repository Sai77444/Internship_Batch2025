const URL = "https://fakestoreapi.com/products";
let cart = [];

fetch(URL)
  .then(res => res.json())
  .then(data => {
    data.map(item => {
      const div = document.createElement("div");

      const btn = document.createElement("button");
      btn.textContent = "Add to Cart";
      btn.onclick = () => {
        cart.push(item);
        console.log("Cart:", cart);
        alert(`Added "${item.title}" to cart.`);
      };

      div.innerHTML = `
        <h3>${item.title}</h3>
        <img src="${item.image}" width="100">
        <p>Price: $${item.price}</p>
      `;

      div.appendChild(btn);
          div.style.border = "1px solid #ccc";
          div.style.backgroundColor="#95dec2";
          div.style.margin = "10px";
          div.style.padding = "10px";
          div.style.width="400px";
          div.style.textAlign="center"
          div.style.gridTemplateColumns="5px"
          div.style.borderRadius="15px"
      document.body.appendChild(div);
      btn.style.width="400px"
          btn.style.height="40px"
          btn.style.backgroundColor="#39d498"
          btn.style.borderRadius="11px"
    });
  })
  .catch(error => {
    console.error("Error fetching products:", error);
  });
