import React from 'react'

 import './login.css';
export default function Login() {
const handleSubmit=(e)=>
{
  e.preventDefault();
  alert("successfully loginned");
}
  return (
    <div id='align'>
    <form id='main1'>
    <div><img id='photo1' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiRdxp7VS0L8-csydY4BvsdZFtumQpsjLcYE5kQetrrrlF79CMJ4Cw_X0s8tMTEx-fF3E&usqp=CAU'></img></div>
    <div id='f1'>
    <br></br>
    <label><b className='l'>USERNAME</b></label>
    <br></br>
    <input type='text' placeholder='please enter the name' className='al'></input>
    <br></br><br></br>
    <label><b className='l'>EMAIL</b></label>
    <br></br>
    <input type='text' placeholder='please enter the mail' className='al'></input>
    <br></br><br></br>
    <label><b className='l'>PASSWORD</b></label>
    <br></br>
    <input type='password' placeholder='password' className='al'></input><br></br><br></br>
     </div>
    </form>
    <button className='man1' type='submit' onClick={handleSubmit}><b>Login</b></button> 
    
    <br></br><h3 id='wd'>If you don't have an account </h3>
    <a href='/signup' id='sig' className='man'><button type='submit'><b>Sign Up</b></button></a>
    </div>
  )
}
