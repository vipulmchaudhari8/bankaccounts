import React from "react";

export default class Accounts extends React.Component {
  state = {
    loading: true,
    accounts: null
  };

  async componentDidMount() {
    const url = "http://localhost:8081/account";
    const response = await fetch(url);
    const data = await response.json();
    this.setState({ accounts: data, loading: false });
  }

  render() {
    var {loading, accounts} = this.state;

    if (this.state.loading) {
      return <div>Data loading...</div>;
    }

    if (!this.state.accounts) {
      return <div>Didn't get a accounts</div>;
    }

    return (
      <div>
       <h1>Account List Enquiry</h1>
        <table >
          <tr>
            <th>Account Number</th>
            <th>Account Name</th>
            <th>Account Type</th>
            <th>Balance Date</th>
            <th>Currency</th>
            <th>Opening Available Balance</th>            
          </tr>
              {accounts.map(account => (
                <tr>
                    <td><a href="/accountTransactions" >{account.accountNumber}</a></td>
                    <td>{account.accountName}</td>
                    <td>{account.accountType}</td>
                    <td>{account.balanceDate}</td>
                    <td>{account.currency}</td>
                    <td>{account.balance}</td>                      
                </tr>
              ))}
        </table>
      </div>
    );
  }
}