import { Box, Image, Text } from '@chakra-ui/react'
import React from 'react'

const MovieCard = ({id,image,name,year,country}) => {
  return (
    <Box key={id} color={"white"} borderRadius={"10px"} cursor={"pointer"} _hover={{color:"lightblue"}}>
      <Image src={image} alt={image} w={"100%"} h={"80%"} borderRadius={"10px"}/>
      <Text p={"10px"} fontWeight={"bold"}>{name}</Text>
      <Box pl={"10px"}  pr={"10px"}  display={"flex"}justifyContent={"space-between"} alignItems={"center"}>
        <Text fontSize={"12px"}>{year}</Text>
        <Text border={"1px solid lightgray"} pl={"5px"} pr={"5px"} fontSize={"12px"}>{country}</Text>
      </Box>
    </Box>
  )
}

export default MovieCard
