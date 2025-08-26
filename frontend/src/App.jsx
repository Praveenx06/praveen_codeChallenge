
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom'
import './App.css'
import AddPlayer from './component/AddPlayer'
import GetAll from './component/GetAll'
import UpdatePlayer from './component/UpdatePlayer'
import HomePage from './component/HomePage'
import Error from './component/Error'
import TeamMatches from './component/TeamMatches'

function App() {
 

  return (
    <>
    <BrowserRouter>
    <center>
      <button type='button' className='btn btn-success ' >  <Link style={{margin:"0px 20px",color:"black"}} to="/GetAll">GETALL </Link>  </button>
       <button type='button' className='btn btn-primary ' >  <Link style={{margin:"0px 20px",color:"black"  }} to="/">HOME </Link>  </button>
      <button type='button' className='btn btn-danger ' >  <Link style={{margin:"0px 20px",color:"black"}} to="/AddPlayers">ADD PLAYER</Link>  </button>
      <button type='button' className='btn btn-warning ' >  <Link style={{margin:"0px 20px",color:"black"}} to="/UpdatePlayers"> UPDATE PLAYER </Link> </button>
       <button type='button' className='btn btn-success ' >  <Link style={{margin:"0px 20px",color:"black"}} to="/TeamMatches">GET TEAM MATCHES </Link>  </button>
    </center>

    <Routes>
      <Route path='/' element={<HomePage/>}> Home page </Route>
      <Route path='/AddPlayers' element={<AddPlayer/>}>  Add Player </Route>
    <Route path='/UpdatePlayers' element={<UpdatePlayer/>}>  Update Player </Route>
    <Route path='/GetAll' element={<GetAll/>}>  Get all Players </Route>
     <Route path='*' element={<Error/>}>  Get all Players </Route>
     <Route path='/TeamMatches' element={<TeamMatches/>}></Route>
    </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
