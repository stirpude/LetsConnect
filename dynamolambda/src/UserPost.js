import React, { Component } from 'react';
import axios from 'axios';


class UserPost extends Component {
    constructor(props) {
		super(props)

		this.state = {
			id: '',
			name: ''
			
		}
    }

    
    changeHandler = (e) => {
        this.setState({[e.target.name]: e.target.value})
    }

    submitHandler = (e) =>{
        e.preventDefault()
        console.log(this.state)
        axios.post('https://npv0tgsru4.execute-api.us-east-1.amazonaws.com/default/myDynamoTest/user',this.state)
        .then(response =>{
            console.log(response)
        })
        .catch(error => {
            console.log(error)
        })

    }
    render() { 
        const { id,name } = this.state
        return ( 
            <form onSubmit={this.submitHandler}>
                <div>
                <input type="text" name="id" value={id} onChange={this.changeHandler}></input>
                </div>
                <div>
                <input type="text" name="name" value={name} onChange={this.changeHandler}></input>
                </div>
                <button type="submit">Add Usert</button>
            </form>
         );
    }
}
 
export default UserPost