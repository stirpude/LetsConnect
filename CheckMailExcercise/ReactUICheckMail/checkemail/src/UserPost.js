import React, { Component } from 'react';
import axios from 'axios';


class UserPost extends Component {
    constructor(props) {
		super(props)

		this.state = {
			
			email: ''
			
		}
    }

    
    changeHandler = (e) => {
        this.setState({[e.target.name]: e.target.value})
    }

    submitHandler = (e) =>{
        e.preventDefault()
        console.log(this.state)
        axios.post('http://localhost:8080/checkemail',this.state)
        .then(response =>{
            console.log(response)
        })
        .catch(error => {
            console.log(error)
        })

    }
    render() { 
        const { emails } = this.state
        return ( 
            <form onSubmit={this.submitHandler}>
                <div>
                <input type="text" name="emails" value={emails} onChange={this.changeHandler}></input>
                </div>
                <button type="submit">Check Email</button>
            </form>
         );
    }
}
 
export default UserPost