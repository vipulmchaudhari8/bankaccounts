import React, {Component} from 'react';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {
      item:[],
      isLoaded = false;
    }
  }

  componentDidMount() {
    fetch('http://localhost:8080/account')
    .then(res =>res.json())
    .then(json => {
      this.setState ({
        isLoaded:true;
        items : json,
        })
      }
    })
  }

  render() {
    return (
      <div className="App">Data loaded</div>  
    );
  }

}

export default App;