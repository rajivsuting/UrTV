import { Box, Image, Text } from '@chakra-ui/react'
import React from 'react'

const Fourththing = () => {
  return (
    <Box w={"80%"} display={"flex"} justifyContent={"space-between"} alignItems={"center"} m={"auto"}>
      <Box  w={"50%"}>
        <Text fontSize={"50px"} fontWeight={"bold"} color={"white"}>Watch everywhere.</Text>
        <Text fontSize={"18px"} w={"70%"} mt={"10px"} color={"white"}>Stream unlimited movies and TV shows on your phone, tablet, laptop, and TV.</Text>
      </Box>
      <Box  w={"50%"} padding={"50px"}>
        <Image w={"100%"} borderRadius={"10px"} src='./Images/avatar-_the_way_of_water-sixteen_nine.webp'/>
      </Box>
    </Box>
  )
}

export default Fourththing
