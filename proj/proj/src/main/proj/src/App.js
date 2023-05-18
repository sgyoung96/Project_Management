import logo from './logo.svg';
import './App.css';
import React, { Component, useState, useEffect } from 'react';
import SaveForm from './pages/book/SaveForm';
import Detail from './pages/book/Detail';
import JoinForm from './pages/user/JoinForm';
import UpdateForm from './pages/book/UpdateForm';
import LoginForm from './pages/user/LoginForm';
import { BrowserRouter, Routes, Route, Router } from 'react-router-dom';
import Home from './pages/book/Home';
import Container, { Link, Switch } from '@material-ui/core';
import clsx from 'clsx';
import ConnTest from './pages/test/connection';


function App() {

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      
      <div>
      	<h1>????</h1>
      </div>
      
      <div>
		<h1>please...</h1>
			<Routes>
				<Route exact path="/user/login" Component={LoginForm} />
				<Route exact path="test/conn" Component={ConnTest} />
			</Routes>	
    	</div>
      
      
    </div>
  );
}

export default App;