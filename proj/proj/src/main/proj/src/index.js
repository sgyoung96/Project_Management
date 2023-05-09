import React from 'react';
import ReactDOM from 'react-dom/client';
//import { reportWebVitals } from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
////import 'bootstrap/dist/css/bootstrap.min.css'; 
//import Routes from "./pages/Routes";
import { BrowserRouter } from 'react-router-dom';

//const root = ReactDOM.createRoot(document.getElementById('root'));
//root.render(
//	<React.StrictMode>
//		<BrowserRouter>
//			<App />
//		</BrowserRouter>
//	</React.StrictMode>
//);


//<div>
//      		<Component>
//				<Route exact path="/user/login" Component={LoginForm} />
//				<Route path="/user/joinForm" exact={true} component={JoinForm} />
//				
//		
//				<Route path="/book/saveForm" exact={true} component={SaveForm} />
//				<Route path="/book/Detail/:id" exact={true} component={Detail} />
//				<Route path="/user/loginForm" exact={true} component={LoginForm} />
//			
//				<Route path="/book/updateForm/:id" exact={true} component={UpdateForm} />
//			</Component>
//		</div>


//
//ReactDOM.render(
//	<App />,
//	document.getElementById('root')	
//);

//
//class MyComponent extends React.Component {
//	render() {
//		return (
//			ReactDOM.render(App)	
//		);
//	}
//}

//export default MyComponent


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
  	<BrowserRouter>
    	<App />
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();