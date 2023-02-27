import React from 'react'
import {Routes,Route} from "react-router-dom"

const Allroutes = () => {
  return (
    <div>
      <Routes>
        <Route path={"/"}/>
        <Route path={"/movie/:id"}/>
      </Routes>
    </div>
  )
}

export default Allroutes
