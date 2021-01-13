import React, { Component } from "react";
import "./App.css";
import Accounts from "./components/Accounts";
import AccountTransactions from "./components/AccountsTransactions";
import {Route, BrowserRouter as Router} from "react-router-dom";

class App extends Component {
  render() {
      return ( 
        <Router>
        <div className="App">
             <Route path="/" exact component={Accounts} />
             <Route path="/accountTransactions" component={AccountTransactions} />
          </div>
        </Router>
        );
  }
}

export default App;