import React from "react";
import {Link} from "react-router-dom";

export default class AccountsTransactions extends React.Component {
  state = {
    loading: true,
    accountTransactions: null
  };

  async componentDidMount() {
    const url = "http://localhost:8081/accountTransactions";
    const response = await fetch(url);
    const data = await response.json();
    this.setState({ accountTransactions: data, loading: false });
  }

  render() {
    var {loading, accountTransactions} = this.state;

    if (this.state.loading) {
      return <div>Data loading...</div>;
    }

    if (!this.state.accountTransactions) {
      return <div>Didn't get a accountTransactions</div>;
    }

    return (
      <div>
       <h1>Account Transaction Enquiry</h1>
        <table >
          <tr>
            <th>Account Number</th>
            <th>Account Type</th>
            <th>Value Date</th>
            <th>Currency</th>
            <th>Debited Amount</th>
            <th>Credited Amount</th>
            <th>Debit/Credit</th>
            <th>Transaction Narrative</th>            
          </tr>
              {accountTransactions.map(transaction => (
                  <tr>
                      <td>{transaction.accountNumber}</td>
                      <td>{transaction.accountType}</td>
                      <td>{transaction.valueDate}</td>
                      <td>{transaction.currency}</td>
                      <td>{transaction.debitedAmount}</td>
                      <td>{transaction.creditedAmount}</td>     
                      <td>{transaction.creditDebitType}</td>
                      <td>{transaction.transactionNarrative}</td>                                         
                  </tr>
              ))}
        </table>
        <h2> <Link to="/"> Go Back To Accounts </Link> </h2>
      </div>
    );
  }
}