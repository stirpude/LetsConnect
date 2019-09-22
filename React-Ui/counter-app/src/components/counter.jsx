import React, { Component } from 'react';
class Counter extends Component {
    // state ={
    //     value:this.props.value,
    //     imageURL : 'https://picsum.photos/200',
    //     tags :  ['tag1','tag2','tag3']
    // };

    /*styles = {
        fontSize : 100,
        fontWeight  : "bold"
    }*/

    /*handleIncrement = () =>{

        console.log("Clicked",this);
        this.setState({ value : this.state.value + 1});

    };*/

    //  constructor(){
    //      super();
    //    this.handleIncrement = this.handleIncrement.bind(this);
    //  }
    
    
    render() {

        //console.log('props',this.props)

        
        return (
        <div>
        <span className ={ this.getBadgeClasses()} >{this.formatCount()}</span>
        <button 
        onClick = {() => this.props.onIncrement(this.props.counter)} 
        className="btn btn-secondary btn-sm">
        Increment</button>
        <button 
               onClick ={() => this.props.onDelete(this.props.counter.id) } 
               className="btn btn-danger btn-sm m-2"
               >
                   Delete</button>
        

        </div>
        );
    }

    getBadgeClasses() {
        let classes = "badge m-2 badge-";
        classes += this.props.counter.value === 0 ? "warning" : "primary";
        return classes;
    }

    formatCount(){
        const {value} = this.props.counter;
            return value === 0 ? <h1>Zero</h1> : value;
    }

}
 
export default Counter;