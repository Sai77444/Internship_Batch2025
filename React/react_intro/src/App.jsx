import React from "react";
import {
  createBrowserRouter,
  createRoutesFromElements,
  Route,
  RouterProvider,
} from "react-router-dom";
import Home from "./pages/Home";
import Project from "./pages/Project";
import Contact from "./pages/Contact";
import About from "./pages/About";
import Layout from "./Layout/layout";


function App() {
  const router = createBrowserRouter(
    createRoutesFromElements(
      
     <Route path="/" element={<Layout/>}>
        <Route path="/"element={<Home />} />
        <Route path="/About"element={<About/>} />
        <Route path="/Project"element={<Project />} />
        <Route path="/Contact"element={<Contact />} />
    </Route>
    )
  );

  return (
    
      <RouterProvider router={router} />
    
  );
}

export default App;
