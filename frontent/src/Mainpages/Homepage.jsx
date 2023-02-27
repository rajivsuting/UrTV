import React from 'react'
import ImageNavbar from '../Componants/Secondsearch'
import Navbar from '../Componants/Navbar'
import Secondsearch from '../Componants/Secondsearch'
import ThirdCrousel from '../Componants/ThirdCrousel'
import { Divider } from '@chakra-ui/react'
import Fourththing from '../Componants/Fourththing'
import Trending from '../Componants/Trending'
import Footer from '../Componants/Footer'

const Homepage = () => {
  return (
    <div>
      <Navbar/>
      <Secondsearch/>
      <Divider w={"99%"} m={"auto"} mt={"100px"} mb={"100px"} border={'5px solid lightgray'}/>
      <ThirdCrousel/>
      <Divider w={"99%"} m={"auto"} mt={"100px"} mb={"100px"} border={'5px solid lightgray'}/>
      <Fourththing/>
      <Divider w={"99%"} m={"auto"} mt={"100px"} mb={"100px"} border={'5px solid lightgray'}/>
      <Trending/>
      <Divider w={"99%"} m={"auto"} mt={"100px"} mb={"100px"} border={'5px solid lightgray'}/>
      <Footer/>
      <Divider w={"99%"} m={"auto"} mt={"100px"} border={'5px solid lightgray'}/>
    </div>
  )
}

export default Homepage
