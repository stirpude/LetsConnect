import React, { Component } from 'react';
import axios from 'axios';


class UserPost extends Component {
    constructor(props) {
		super(props)

		this.state = {
			
			email: '',
            myObject: {data:0}
           // myObject: {}
           //data : null

            
		}

        this.changeHandler = this.changeHandler.bind(this);

    }

    
    changeHandler = (e) => {
        this.setState({[e.target.name]: e.target.value})
        //this.myObject = this.myObject.bind(this);
         //return {data: this.state.data};
    }

       submitHandler = (e) =>{
        e.preventDefault()
        console.log(this.state)
        axios.post('http://ec2-52-35-138-206.us-west-2.compute.amazonaws.com:8080/checkemail',this.state)
        .then(response =>{
            this.state.myObject.data=response.data;
            //this.setState({myObject})
            console.log("5555555"+this.state.myObject.data)
            console.log(response)
        })
        .catch(error => {
            console.log(error)
        })

    }
    render() { 
        const { emails,myObject } = this.state
        return ( 
            <form onSubmit={this.submitHandler}>
                <div>
                <input type="text" name="emails" value={emails} onChange={this.changeHandler}></input>
                </div>
                <button type="submit">Check Email 11111</button>
                <text>THis is retrun value: </text>
                 
                <span>{this.state.myObject.data}</span>
                </form >
            
         );
    }
}
 
export default UserPost