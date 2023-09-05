import React from 'react'
import './main.css'
import Ticketshow from '../ticket/ticket'
export default function Main() {
  return (
    <div>
    <img id='pic3' src='https://img.freepik.com/premium-photo/model-train-with-number-3-front_862330-8340.jpg'></img>
    <img id='logo' src='https://png.pngtree.com/png-clipart/20230417/original/pngtree-train-retro-red-pattern-png-image_9058773.png'></img>
    <h1 id='head1'><div className='h1'>ARE YOU READY FOR THE TRIP????</div></h1>
    
    <div>
    <a href='/main' className='al1' id='home'><h1>HOME</h1></a>
    <a href='/about'  className='al1' id='about'><h1>ABOUT</h1></a>
    <a href='/ticket' className='al1' id='ticket'><h1>BOOKING</h1></a>
    <a href='/Login' className='al1'  id='Login'><h1>LOGIN</h1></a>
    <a href='/signup' className='al1' id='signup'><h1>SIGNUP</h1></a>
     <a href='/t1' className='al1'  id='show'><h1>BOOKED</h1></a>
    </div>
   
    </div>
    
  )
}
